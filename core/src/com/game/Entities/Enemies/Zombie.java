package com.game.Entities.Enemies;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;


public class Zombie extends Enemy {

    Vector2 position;
    private Sprite draw;

    public Zombie(Float x, Float y) {
        super(30, 30, 1.0f, x, y, .12f, .28f, 1.3f, 1.7f, 1.5f);
    }


    public Sprite getDraw() {
        return draw;
    }

    public void setDraw(Sprite draw) {
        this.draw = draw;
    }






}
