package com.game.tutoriales.learn8;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import java.util.ArrayList;


public class AssetsLearn8 {

    static Sprite polloBlanco;
    static Sprite polloMarron;
    static Sprite guebo;
    static Sprite pata;
    static ArrayList<Sprite> wz = new ArrayList<>();
    static ArrayList<Sprite> zw = new ArrayList<>();
    static ArrayList<Sprite> zm = new ArrayList<>();
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

        atlas = new TextureAtlas(Gdx.files.internal("Entities/Wild Zombie/WZ.txt"));
        wz.add(atlas.createSprite("Attack_1_C"));
        wz.add(atlas.createSprite("Attack_2_A"));
        wz.add(atlas.createSprite("Attack_3_B"));
        wz.add(atlas.createSprite("Dead_A"));
        wz.add(atlas.createSprite("Dead_C"));

        atlas = new TextureAtlas(Gdx.files.internal("Entities/Zombie Man/ZM.txt"));
        zm.add(atlas.createSprite("Attack_1_C"));
        zm.add(atlas.createSprite("Attack_1_E"));
        zm.add(atlas.createSprite("Attack_2_A"));
        zm.add(atlas.createSprite("Attack_2_B"));
        zm.add(atlas.createSprite("Bite_H"));
        zm.add(atlas.createSprite("Hurt_A"));
        zm.add(atlas.createSprite("Jump_B"));
        zm.add(atlas.createSprite("Jump_D"));
        zm.add(atlas.createSprite("Run_E"));
        zm.add(atlas.createSprite("Walk_A"));
        zm.add(atlas.createSprite("Walk_H"));

        atlas = new TextureAtlas(Gdx.files.internal("Entities/Zombie Woman/ZW.txt"));
        zw.add(atlas.createSprite("Attack_2_B"));
        zw.add(atlas.createSprite("Attack_3_A"));
        zw.add(atlas.createSprite("Dead_D"));
        zw.add(atlas.createSprite("Hurt_A"));
        zw.add(atlas.createSprite("Hurt_B"));
        zw.add(atlas.createSprite("Hurt_C"));
        zw.add(atlas.createSprite("Jump_C"));
        zw.add(atlas.createSprite("Run_C"));

    }


    public static void dispose() {
        atlas.dispose();
    }
}

