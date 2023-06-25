package com.game;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.NinePatchDrawable;

import java.util.ArrayList;


public class AssetsGame {

    public static Texture backgroundTexture;
    public static Sprite backgroundSprite;
    public static BitmapFont font;
    public static TextButton.TextButtonStyle txButtonStyle;
    public static Label.LabelStyle labelStyle;
    public static ScrollPane.ScrollPaneStyle scrollPaneStyle;
    static Sprite polloBlanco;
    static Sprite polloMarron;
    static Sprite guebo;
    static Sprite pata;
    static Animation<Sprite> bum;
    static ArrayList<Sprite> wz = new ArrayList<>();
    static ArrayList<Sprite> zw = new ArrayList<>();
    static ArrayList<Sprite> zm = new ArrayList<>();
    static TextureAtlas atlas;

    public static void loadFonts() {
        font = new BitmapFont();

        TextureAtlas atlas = new TextureAtlas(Gdx.files.internal("data/ui.txt"));

        txButtonStyle = new TextButton.TextButtonStyle(new NinePatchDrawable(
                atlas.createPatch("bt")), new NinePatchDrawable(
                atlas.createPatch("btDown")), null, font);

        labelStyle = new Label.LabelStyle(font, Color.GREEN);

        NinePatchDrawable knob = new NinePatchDrawable(
                atlas.createPatch("scroll"));
        scrollPaneStyle = new ScrollPane.ScrollPaneStyle(null, knob, knob, knob, knob);
    }


    public static void load() {
        atlas = new TextureAtlas(Gdx.files.internal("Entities/sprites.txt"));
        polloBlanco = atlas.createSprite("chiquen1");
        polloMarron = atlas.createSprite("brown chicken");
        guebo = atlas.createSprite("egg");
        pata = atlas.createSprite("pata");

        backgroundTexture = new Texture("Entities/Space Background.png");
        backgroundSprite = new Sprite(backgroundTexture);

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


        atlas = new TextureAtlas(Gdx.files.internal("bum/bum.txt"));

        bum = new Animation<>(0.05f, atlas.createSprite("explosion1"),
                atlas.createSprite("explosion2"),
                atlas.createSprite("explosion3"),
                atlas.createSprite("explosion4"),
                atlas.createSprite("explosion5"),
                atlas.createSprite("explosion6"),
                atlas.createSprite("explosion7"),
                atlas.createSprite("explosion8"),
                atlas.createSprite("explosion9"),
                atlas.createSprite("explosion10"),
                atlas.createSprite("explosion11"),
                atlas.createSprite("explosion12"),
                atlas.createSprite("explosion13"),
                atlas.createSprite("explosion14"),
                atlas.createSprite("explosion15"),
                atlas.createSprite("explosion16"),
                atlas.createSprite("explosion17"),
                atlas.createSprite("explosion18"),
                atlas.createSprite("explosion19")
        );
    }


    public static void dispose() {
        atlas.dispose();
    }
}

