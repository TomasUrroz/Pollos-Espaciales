package com.game.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.physics.box2d.*;

import static com.game.Screens.WORLD_HEIGHT;
import static com.game.Screens.WORLD_WIDTH;

public class Utils {
    static public TextureRegion getRegion(String path) {
        return new TextureRegion(new Texture(Gdx.files.internal(path)));
    }

    public void createFloor(World oWorld) {

        BodyDef bd = new BodyDef();
        bd.position.set(0, .6f);
        bd.type = BodyDef.BodyType.StaticBody;

        EdgeShape shape = new EdgeShape();
        shape.set(0, -0.7f, WORLD_WIDTH, -0.7f);

        FixtureDef fixDef = new FixtureDef();
        fixDef.shape = shape;
        fixDef.friction = 1f;
        fixDef.restitution = 1f;

        Body oBody = oWorld.createBody(bd);
        oBody.createFixture(fixDef);
        BodyDef bd2 = new BodyDef();
        bd2.position.set(0, .6f);
        bd2.type = BodyDef.BodyType.StaticBody;

        EdgeShape shape2 = new EdgeShape();
        shape2.set(0, WORLD_HEIGHT - 0.58F, WORLD_WIDTH, WORLD_HEIGHT - 0.58F);

        FixtureDef fixDef2 = new FixtureDef();
        fixDef2.shape = shape2;
        fixDef2.friction = 1f;
        fixDef2.restitution = 1f;

        Body oBody2 = oWorld.createBody(bd2);
        oBody2.createFixture(fixDef2);

        shape2.dispose();
        shape.dispose();
    }

    public void createWalls(World oWorld) {

        BodyDef bd = new BodyDef();
        bd.position.set(0, .6f);
        bd.type = BodyDef.BodyType.StaticBody;

        EdgeShape shape = new EdgeShape();
        shape.set(0, -0.7f, 0, WORLD_HEIGHT);

        FixtureDef fixDef = new FixtureDef();
        fixDef.shape = shape;
        fixDef.friction = 1f;
        fixDef.restitution = 1f;

        Body oBody = oWorld.createBody(bd);
        oBody.createFixture(fixDef);
/*
        BodyDef bd2 = new BodyDef();
        bd2.position.set(0, .6f);
        bd2.type = BodyDef.BodyType.StaticBody;

        EdgeShape shape2 = new EdgeShape();
        shape2.set(WORLD_WIDTH, -0.7f, WORLD_WIDTH, WORLD_HEIGHT);

        FixtureDef fixDef2 = new FixtureDef();
        fixDef2.shape = shape2;
        fixDef2.friction = 1f;

        Body oBody2 = oWorld.createBody(bd2);
        oBody2.createFixture(fixDef2);
*/
        shape.dispose();
        //shape2.dispose();

    }

}
