package com.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.TimeUtils;
import com.game.CharacterProperties.SizeE;
import com.game.CharacterProperties.Stats;
import com.game.Entities.Personaje;
import com.game.Entities.CharacterProperties.Weapon;
import com.game.Entities.Enemies.Enemy;
import com.game.Entities.Player;

import java.util.Iterator;


public class GameScreen implements Screen {
    final Drop game;
    Texture dropImage;
    Texture bucketImage;
    Sound dropSound;
    Music rainMusic;
    OrthographicCamera camera;
    Player bucket;
    Array<Enemy> raindrops;
    long lastDropTime;
    int dropsGathered;

    public GameScreen(final Drop gam) {
        this.game = gam;

        // load the images for the droplet and the bucket, 64x64 pixels each
        dropImage = new Texture(Gdx.files.internal("droplet.png"));
        bucketImage = new Texture(Gdx.files.internal("bucket.png"));

        // load the drop sound effect and the rain background "music"
        dropSound = Gdx.audio.newSound(Gdx.files.internal("drop.wav"));
        rainMusic = Gdx.audio.newMusic(Gdx.files.internal("rain.mp3"));
        rainMusic.setLooping(true);

        // create the camera and the SpriteBatch
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);

        Stats charStat = new Stats(10,10,0.5f,5);
        SizeE size = new SizeE(800 / 2 - 64 / 2, 20, 64, 64);
        Weapon palo = new Weapon(5,10);
/*
        bucket = new Player(charStat,size,2,0,palo,false);
*/

        // create the raindrops array and spawn the first raindrop
        raindrops = new Array<Enemy>();
        spawnRaindrop();

    }

    private void spawnRaindrop() {
        Stats charStat = new Stats(10,10,0.5f,5);
        SizeE size = new SizeE(MathUtils.random(0, 800 - 64), 480, 64, 64);
        Weapon palo = new Weapon(5,10);

/*
        Enemy raindrop = new Enemy(charStat,size,palo);
*/

/*
        raindrops.add(raindrop);
*/
        lastDropTime = TimeUtils.nanoTime();
    }

    @Override
    public void render(float delta) {
        // clear the screen with a dark blue color. The
        // arguments to clear are the red, green
        // blue and alpha component in the range [0,1]
        // of the color to be used to clear the screen.
        ScreenUtils.clear(0, 0, 0.2f, 1);

        // tell the camera to update its matrices.
        camera.update();

        // tell the SpriteBatch to render in the
        // coordinate system specified by the camera.
        game.batch.setProjectionMatrix(camera.combined);

        // begin a new batch and draw the bucket and
        // all drops
        game.batch.begin();
        game.font.draw(game.batch, "Drops Collected: " + dropsGathered, 0, 480);
        game.batch.draw(bucketImage, bucket.getX(), bucket.getY());
        for (Enemy raindrop : raindrops) {
            game.batch.draw(dropImage, raindrop.getX(), raindrop.getY());
        }
        game.batch.end();

        // process user input
        if (Gdx.input.isTouched()) {
            Vector3 touchPos = new Vector3();
            touchPos.set(Gdx.input.getX(), Gdx.input.getY(), 0);
            camera.unproject(touchPos);
            bucket.setX((int)(touchPos.x - 64 / 2));
        }
        if (Gdx.input.isKeyPressed(Keys.LEFT))
            bucket.setX((int)(bucket.getX()- 200 * Gdx.graphics.getDeltaTime()));
        if (Gdx.input.isKeyPressed(Keys.RIGHT))
            bucket.setX((int)(bucket.getX()+ 200 * Gdx.graphics.getDeltaTime()));
        // make sure the bucket stays within the screen bounds
        if (bucket.getX() < 0)
            bucket.setX(0);
        if (bucket.getX() > 800 - 64)
            bucket.setX( 800 - 64);

        // check if we need to create a new raindrop
        if (TimeUtils.nanoTime() - lastDropTime > 1000000000)
            spawnRaindrop();

        // move the raindrops, remove any that are beneath the bottom edge of
        // the screen or that hit the bucket. In the later case we play back
        // a sound effect as well.
        Iterator<Enemy> iter = raindrops.iterator();
        while (iter.hasNext()) {
            Enemy raindrop = iter.next();
            raindrop.setY((int)(raindrop.getY() - 200 * Gdx.graphics.getDeltaTime()));
            if (raindrop.getY() + 64 < 0)
                iter.remove();
            if (raindrop.overlaps(bucket)) {
                dropsGathered++;
                dropSound.play();
                iter.remove();
            }
        }
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void show() {
        // start the playback of the background music
        // when the screen is shown
        rainMusic.play();
    }

    @Override
    public void hide() {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void dispose() {
        dropImage.dispose();
        bucketImage.dispose();
        dropSound.dispose();
        rainMusic.dispose();
    }

}