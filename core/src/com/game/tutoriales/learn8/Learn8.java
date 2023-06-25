package com.game.tutoriales.learn8;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.*;
import com.badlogic.gdx.physics.box2d.BodyDef.BodyType;
import com.badlogic.gdx.utils.Array;
import com.game.Assets;
import com.game.Entities.Enemies.Zombie;
import com.game.Entities.Player;
import com.game.MainLearn;
import com.game.Screens;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
import com.game.psysicsEditor.PhysicsShapeCache;
import com.game.utils.Utils;

import java.util.ArrayList;
import java.util.Random;

public class Learn8 extends Screens {

    World oWorld;
    PhysicsShapeCache physicsBodies;
    Player player;
    Player player2;
    ArrayList<Zombie> zombies;
    Array<Body> arrBodies;

    Utils util = new Utils();
    Box2DDebugRenderer renderer = new Box2DDebugRenderer();

    public Learn8(MainLearn game) {
        super(game);
        AssetsLearn8.load();

        Vector2 gravity = new Vector2(-1.5f, 0);
        oWorld = new World(gravity, true);

        arrBodies = new Array<>();


        util.createFloor(oWorld);
        //util.createWalls(oWorld);

        player = createPlayer(1f,3f);
        player2 = createPlayer(1f,1f);
        zombies = createZombies(50);
    }


    private Player createPlayer(Float x, Float y) {
        Player player = new Player(x,y);
        BodyDef bd = new BodyDef();
        bd.position.x = player.getX();
        bd.position.y = player.getY();
        bd.type = BodyType.DynamicBody;

        PolygonShape shape = new PolygonShape();
        shape.setAsBox(player.getWidth(), player.getHeight());

        FixtureDef fixDef = new FixtureDef();
        fixDef.shape = shape;
        fixDef.friction = 0;
        fixDef.restitution = 0;
        fixDef.density = 15;

        Body oBody = oWorld.createBody(bd);
        oBody.setTransform(x,y,0);
        oBody.createFixture(fixDef);
        oBody.setUserData(player);
        shape.dispose();
        return player;
    }


    private void drawplayer(Player player) {
        Sprite keyframe;
        if (player.getId()==0){
            keyframe = AssetsLearn8.polloBlanco ;
        }else keyframe = AssetsLearn8.polloMarron;

        keyframe.setOrigin(player.getDraw_width()/2, player.getDraw_height()/2);
        keyframe.setRotation(player.angle);
        keyframe.setPosition(player.getX() - player.getDraw_width() / 2, player.getY() - player.getDraw_height() / 2+0.03f);
        keyframe.setSize(player.getDraw_width(), player.getDraw_height());
        keyframe.setScale(0.8f);

        keyframe.draw(spriteBatch);
    }


    private Zombie createZombie(Float x, Float y) {
        Zombie zombie = new Zombie(x,y);
        BodyDef bd = new BodyDef();
        bd.position.x = zombie.getX();
        bd.position.y = zombie.getY();
        bd.type = BodyType.DynamicBody;

        zombie.setDraw(getRandSprite());

        PolygonShape shape = new PolygonShape();
        shape.setAsBox(zombie.getWidth(), zombie.getHeight());

        FixtureDef fixDef = new FixtureDef();
        fixDef.shape = shape;
        fixDef.friction = 0;
        fixDef.restitution = 0;
        fixDef.density = 15;

        Body oBody = oWorld.createBody(bd);
        oBody.setTransform(x,y,0);
        oBody.createFixture(fixDef);
        oBody.setUserData(zombie);
        shape.dispose();
        return zombie;
    }

    private ArrayList<Zombie> createZombies(int size){
        ArrayList<Zombie> zombies = new ArrayList<>();
        int i = 0;
        Float randX;
        Float randY;
        while (i<=size){
            randX = (float) (Math.random() * (30-7.8f+ 1.5f)+7.8f);
            randY = (float) (Math.random() * (5-1+ 1.5f)+0.5f);
            zombies.add(createZombie(randX,randY));
            i++;
        }
        return zombies;
    }

    private Sprite getRandSprite(){
        int rand2 = (int) (Math.random() * (2 + 1));
        Sprite sprite = null;

        if(rand2 ==0){
            sprite = AssetsLearn8.zm.get((int) (Math.random() * (AssetsLearn8.zm.size())));
        }else if(rand2 ==1){
            sprite = AssetsLearn8.zw.get((int) (Math.random() * (AssetsLearn8.wz.size())));
        }else{
            sprite = AssetsLearn8.wz.get((int) (Math.random() * (AssetsLearn8.wz.size())));
        }
        return sprite;
    }

    private void drawZombie(Zombie zombie){
        Sprite keyframe = zombie.getDraw();
        try
        {
            keyframe.setOrigin(zombie.getDraw_width()/2, zombie.getDraw_height()/2);
            keyframe.setRotation(zombie.angle);
            keyframe.setPosition(zombie.getX() - zombie.getDraw_width() / 2, zombie.getY() - zombie.getDraw_height() / 2+0.03f);
            keyframe.setSize(zombie.getDraw_width(), zombie.getDraw_height());
            keyframe.setScale(0.5f);
        }catch (NullPointerException npe){
            keyframe = AssetsLearn8.zm.get(0);
        }
        keyframe.draw(spriteBatch);

    }

    private void drawZombies(ArrayList<Zombie> zombies){
        int i = 0;
        try {
            while(i<zombies.size() ){
                drawZombie(zombies.get(i));
                i++;
            }
        }catch (NullPointerException npe){
            drawZombie(createZombie(3f,5f));
        }
    }

    @Override
    public void update(float delta) {
        float accelX = 0;
        float accelY = 0;
        float accelX2 = 0;
        float accelY2 = 0;
        String action = "";
        String action2 = "";

        if (Gdx.input.isKeyPressed(Input.Keys.LEFT))
            accelX = -1;

        else if (Gdx.input.isKeyPressed(Input.Keys.RIGHT))
            accelX = 1;

        if (Gdx.input.isKeyPressed(Input.Keys.DOWN))
            accelY = -1;

        if (Gdx.input.isKeyPressed(Input.Keys.UP))
            accelY = 1;

        if (Gdx.input.isKeyPressed(Input.Keys.SPACE))
            action = "attk";




        if (Gdx.input.isKeyPressed(Input.Keys.A))
            accelX2 = -1;

        else if (Gdx.input.isKeyPressed(Input.Keys.D))
            accelX2 = 1;

        if (Gdx.input.isKeyPressed(Input.Keys.S))
            accelY2 = -1;

        if (Gdx.input.isKeyPressed(Input.Keys.W))
            accelY2 = 1;

        if (Gdx.input.isKeyPressed(Input.Keys.F))
            action2 = "attk";



        oWorld.step(delta, 8, 6);
        oWorld.getBodies(arrBodies);

        for (Body body : arrBodies) {
            if ((body.getUserData() instanceof Player) && ((Player) body.getUserData()).getId() ==0) {
                Player obj = (Player) body.getUserData();
                obj.update(body, delta, accelX, accelY, action);
                obj.angle = (float) Math.toDegrees(body.getAngle());
            }else if((body.getUserData() instanceof Player) && ((Player) body.getUserData()).getId() ==1){
                Player obj = (Player) body.getUserData();
                obj.update(body, delta, accelX2, accelY2, action2);
                obj.angle = (float) Math.toDegrees(body.getAngle());
            }else if ((body.getUserData() instanceof Zombie)){
                Zombie obj = (Zombie) body.getUserData();
                obj.update(body, delta, 0f, 0f, action2);
                obj.angle = (float) Math.toDegrees(body.getAngle());
            }
        }
    }



    @Override
    public void draw(float delta) {
        oCamUI.update();
        spriteBatch.setProjectionMatrix(oCamUI.combined);

        spriteBatch.begin();
        AssetsLearn8.backgroundSprite.draw(spriteBatch);

        Assets.font.draw(spriteBatch, "fps:" + Gdx.graphics.getFramesPerSecond(), 0, 20);
        spriteBatch.end();

        oCamBox2D.update();

        spriteBatch.setProjectionMatrix(oCamBox2D.combined);
        spriteBatch.begin();

        drawZombies(zombies);
        System.out.println(player.angle);
        drawplayer(player);
        drawplayer(player2);
        spriteBatch.end();
        renderer.render(oWorld, oCamBox2D.combined);
    }

    @Override
    public void dispose() {
        AssetsLearn8.dispose();
        oWorld.dispose();
        super.dispose();
    }
}
