package com.game.tutoriales.learn8;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.*;
import com.badlogic.gdx.physics.box2d.BodyDef.BodyType;
import com.badlogic.gdx.utils.Array;
import com.game.Assets;
import com.game.Entities.Egg;
import com.game.Entities.Enemies.Zombie;
import com.game.Entities.Player;
import com.game.MainLearn;
import com.game.Screens;
import com.game.psysicsEditor.PhysicsShapeCache;
import com.game.utils.CollisionListener;

import java.util.ArrayList;
import java.util.List;

public class Learn8 extends Screens {

    World oWorld;
    PhysicsShapeCache physicsBodies;
    Player player;
    Player player2;
    int hits1=0;
    int hits2=0;
    ArrayList<Zombie> zombies;
    Array<Body> arrBodies;
    List eggsP1 = new ArrayList();
    List eggsP2 = new ArrayList();

    //Utils util = new Utils();
    //Box2DDebugRenderer renderer = new Box2DDebugRenderer();

    public Learn8(MainLearn game) {
        super(game);
        AssetsLearn8.load();

        Vector2 gravity = new Vector2(-0.5f, 0);
        oWorld = new World(gravity, true);
        oWorld.setContactListener(new CollisionListener());
        arrBodies = new Array<>();


        //util.createFloor(oWorld);
        //util.createWalls(oWorld);

        player = createPlayer(1f, 3f);
        player2 = createPlayer(1f, 1f);

        zombies = createZombies(200);
    }


    //PALYERS

    private Player createPlayer(Float x, Float y) {
        Player player = new Player(x, y);
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
        oBody.setTransform(x, y, 0);
        oBody.createFixture(fixDef);
        oBody.setUserData(player);
        shape.dispose();
        return player;
    }

    private void drawplayer(Player player) {
        Sprite keyframe;
        if (player.getId() == 0) {
            keyframe = AssetsLearn8.polloBlanco;
        } else keyframe = AssetsLearn8.polloMarron;

        keyframe.setOrigin(player.getDraw_width() / 2, player.getDraw_height() / 2);
        keyframe.setRotation(player.angle);
        keyframe.setPosition(player.getX() - player.getDraw_width() / 2, player.getY() - player.getDraw_height() / 2 + 0.03f);
        keyframe.setSize(player.getDraw_width(), player.getDraw_height());
        keyframe.setScale(0.8f);

        keyframe.draw(spriteBatch);
    }


    private Sprite getRandSprite() {
        int rand2 = (int) (Math.random() * (2 + 1));
        Sprite sprite = null;

        if (rand2 == 0) {
            sprite = AssetsLearn8.zm.get((int) (Math.random() * (AssetsLearn8.zm.size())));
        } else if (rand2 == 1) {
            sprite = AssetsLearn8.zw.get((int) (Math.random() * (AssetsLearn8.wz.size())));
        } else {
            sprite = AssetsLearn8.wz.get((int) (Math.random() * (AssetsLearn8.wz.size())));
        }
        return sprite;
    }


    //ZOMBIES

    private Zombie createZombie(Float x, Float y) {
        Zombie zombie = new Zombie(x, y);
        BodyDef bd = new BodyDef();
        bd.position.x = zombie.getX();
        bd.position.y = zombie.getY();
        bd.type = BodyType.DynamicBody;

        float rand = (float) Math.random() * (90 + 1);
        zombie.angle = rand;

        zombie.setDraw(getRandSprite());

        PolygonShape shape = new PolygonShape();
        shape.setAsBox(zombie.getWidth(), zombie.getHeight());

        FixtureDef fixDef = new FixtureDef();
        fixDef.shape = shape;
        fixDef.friction = 0;
        fixDef.restitution = 0;
        fixDef.density = 5;


        Body oBody = oWorld.createBody(bd);
        oBody.setTransform(x, y, rand);
        oBody.createFixture(fixDef);
        oBody.setUserData(zombie);
        shape.dispose();
        return zombie;
    }

    private ArrayList<Zombie> createZombies(int size) {
        ArrayList<Zombie> zombies = new ArrayList<>();
        int i = 0;
        Float randX;
        Float randY;
        while (i <= size) {
            randX = (float) (Math.random() * (100 - 7.8f + 1.5f) + 7.8f);
            randY = (float) (Math.random() * (5 - 1 + 1.5f) + 0.5f);
            zombies.add(createZombie(randX, randY));
            i++;
        }
        return zombies;
    }

    private void drawZombie(Zombie zombie) {
        Sprite keyframe = zombie.getDraw();
        try {
            keyframe.setOrigin(zombie.getDraw_width() / 2, zombie.getDraw_height() / 2);
            keyframe.setRotation(zombie.angle);
            keyframe.setPosition(zombie.getX() - zombie.getDraw_width() / 2, zombie.getY() - zombie.getDraw_height() / 2 + 0.03f);
            keyframe.setSize(zombie.getDraw_width(), zombie.getDraw_height());
            keyframe.setScale(0.5f);
        } catch (NullPointerException npe) {
            keyframe = AssetsLearn8.zm.get(0);
        }
        keyframe.draw(spriteBatch);

    }

    private void drawZombies(ArrayList<Zombie> zombies) {
        int i = 0;
        Sprite keyframe = null;
        try {
            while (i < zombies.size()) {
                if(zombies.get(i).getState() == zombies.get(i).getSTATE_NORMAL()){
                    drawZombie(zombies.get(i));
                }else if (zombies.get(i).getState() != zombies.get(i).getSTATE_NORMAL()) {
                    System.out.println("xd");
                    keyframe = AssetsLearn8.bum.getKeyFrame(zombies.get(i).getStateTime(), true);
                    keyframe.setPosition(zombies.get(i).getX() + zombies.get(i).getDraw_width() / 2, zombies.get(i).getY() - zombies.get(i).getDraw_height() / 2 + .25f);
                    keyframe.setSize(-zombies.get(i).getDraw_width(), zombies.get(i).getDraw_height());
                    keyframe.draw(spriteBatch);
                }
                i++;
            }
        } catch (NullPointerException npe) {
            drawZombie(createZombie(3f, 5f));
        }
    }


    private Egg shootEgg(Player player) {
        Egg egg = new Egg(player.getX() + 0.4f, player.getY());
        BodyDef bd = new BodyDef();
        bd.position.x = egg.getX() + 1f;
        bd.position.y = egg.getY();
        bd.type = BodyType.KinematicBody;


        PolygonShape shape = new PolygonShape();
        shape.setAsBox(egg.getWidth(), egg.getHeight());

        FixtureDef fixDef = new FixtureDef();
        fixDef.shape = shape;
        fixDef.friction = 0;
        fixDef.restitution = 0;
        fixDef.density = 1;


        Body oBody = oWorld.createBody(bd);
        oBody.setTransform(player.getX() + 0.4f, player.getY(), 0);
        oBody.createFixture(fixDef);
        oBody.setUserData(egg);
        shape.dispose();

        Vector2 direction = new Vector2(egg.getX(), 0);
        Vector2 linearVelocity = direction.nor().scl(5f);
        oBody.setLinearVelocity(linearVelocity);
        oBody.setAngularVelocity(0f);

        return egg;
    }

    private void drawEgg(Egg egg) {
        Sprite keyframe = AssetsLearn8.guebo;
        try {
            keyframe.setOrigin(egg.getDraw_width() / 2, egg.getDraw_height() / 2);
            keyframe.setRotation(egg.angle);
            keyframe.setPosition(egg.getX() - egg.getDraw_width() / 2, egg.getY() - egg.getDraw_height() / 2 + 0.03f);
            keyframe.setSize(egg.getDraw_width(), egg.getDraw_height());
            keyframe.setScale(0.5f);
        } catch (NullPointerException npe) {
            keyframe = AssetsLearn8.zm.get(0);
        }
        keyframe.draw(spriteBatch);

    }

    private void drawEggs(ArrayList<Egg> egg) {
        int i = 0;
        while (i < egg.size()) {
            if (egg.get(i).getState() == egg.get(i).getSTATE_NORMAL()) {
                drawEgg(egg.get(i));
            }
            i++;
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

        //PLAYER1
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT))
            accelX = -1;

        else if (Gdx.input.isKeyPressed(Input.Keys.RIGHT))
            accelX = 1;

        if (Gdx.input.isKeyPressed(Input.Keys.DOWN))
            accelY = -1;

        if (Gdx.input.isKeyPressed(Input.Keys.UP))
            accelY = 1;

        if (Gdx.input.isKeyJustPressed(Input.Keys.NUMPAD_0))
            eggsP1.add(shootEgg(player));

        if (Gdx.input.isKeyPressed(Input.Keys.NUMPAD_ADD))
            action = "str";


        //PLAYER2
        if (Gdx.input.isKeyPressed(Input.Keys.A))
            accelX2 = -1;

        else if (Gdx.input.isKeyPressed(Input.Keys.D))
            accelX2 = 1;

        if (Gdx.input.isKeyPressed(Input.Keys.S))
            accelY2 = -1;

        if (Gdx.input.isKeyPressed(Input.Keys.W))
            accelY2 = 1;

        if (Gdx.input.isKeyJustPressed(Input.Keys.SPACE))
            eggsP2.add(shootEgg(player2));

        if (Gdx.input.isKeyPressed(Input.Keys.Q))
            action2 = "str";


        oWorld.step(delta, 8, 6);
        oWorld.getBodies(arrBodies);

        for (Body body : arrBodies) {
            if ((body.getUserData() instanceof Player) && ((Player) body.getUserData()).getId() == 0) {
                Player obj = (Player) body.getUserData();
                obj.angle = (float) Math.toDegrees(body.getAngle());
                obj.update(body, delta, accelX, accelY, action);

                if (action.equalsIgnoreCase("str")) {
                    body.setTransform(body.getPosition().x, body.getPosition().y, 0f);
                    body.setAngularVelocity(0f);

                }

            } else if ((body.getUserData() instanceof Player) && ((Player) body.getUserData()).getId() == 1) {
                Player obj = (Player) body.getUserData();
                obj.angle = (float) Math.toDegrees(body.getAngle());
                obj.update(body, delta, accelX2, accelY2, action2);

                if (action2.equalsIgnoreCase("str")) {
                    body.setTransform(body.getPosition().x, body.getPosition().y, 0f);
                    body.setAngularVelocity(0f);
                }

            } else if ((body.getUserData() instanceof Zombie)) {
                Zombie obj = (Zombie) body.getUserData();
                obj.update(body, delta, 0f, 0f, action2);
                obj.angle = (float) Math.toDegrees(body.getAngle());
                if (obj.getState() == 1) {
                    zombies.remove(obj);
                    oWorld.destroyBody(body);
                }
            } else if (((body.getUserData() instanceof Egg) && (((Egg) body.getUserData()).getX()< SCREEN_WIDTH)) && (((Egg) body.getUserData()).getX()>= 0)
                    && (((Egg) body.getUserData()).getY()<= SCREEN_HEIGHT) && (((Egg) body.getUserData()).getY()>-0.7f))
                 {
                Egg obj = (Egg) body.getUserData();
                obj.update(body);
                obj.angle = (float) Math.toDegrees(body.getAngle());
                if (obj.getState() == 1) {
                    if (eggsP1.contains(obj)) {
                        hits1++;
                        eggsP1.remove(obj);
                    } else {
                        eggsP2.remove(obj);
                        hits2++;

                    }
                    oWorld.destroyBody(body);
                }
            } else {
                oWorld.destroyBody(body);
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
        Assets.font.draw(spriteBatch, "1:  " + hits1, 0, 60);
        Assets.font.draw(spriteBatch, "2:  " + hits2, 0, 40);
        spriteBatch.end();

        oCamBox2D.update();

        spriteBatch.setProjectionMatrix(oCamBox2D.combined);
        spriteBatch.begin();


        drawplayer(player);
        drawplayer(player2);

        drawEggs((ArrayList<Egg>) eggsP1);
        drawEggs((ArrayList<Egg>) eggsP2);
        drawZombies(zombies);
        spriteBatch.end();
        //renderer.render(oWorld, oCamBox2D.combined);
    }

    @Override
    public void dispose() {
        AssetsLearn8.dispose();
        oWorld.dispose();
        super.dispose();
    }
}
