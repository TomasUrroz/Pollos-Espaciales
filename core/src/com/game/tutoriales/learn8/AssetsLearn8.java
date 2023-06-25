package com.game.tutoriales.learn8;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;


public class AssetsLearn8 {

    static Sprite polloBlanco;
    static Sprite polloMarron;
    static Sprite guebo;
    static Sprite pata;
    public static Texture backgroundTexture;
    public static Sprite backgroundSprite;

    static TextureAtlas atlas;

    public static void load() {
        atlas = new TextureAtlas(Gdx.files.internal("Entities/sprites.txt"));
        polloBlanco = atlas.createSprite("chiquen1");
        polloMarron = atlas.createSprite("brown chicken");
        guebo = atlas.createSprite("egg");
        pata  = atlas.createSprite("pata");

        backgroundTexture = new Texture("Entities/Space Background.png");
        backgroundSprite =new Sprite(backgroundTexture);
    }


    public static void dispose() {
        atlas.dispose();
    }
}

