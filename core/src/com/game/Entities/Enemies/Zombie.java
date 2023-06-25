package com.game.Entities.Enemies;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.game.Entities.CharacterProperties.IGrabbable;
import com.game.Entities.CharacterProperties.Weapon;

import java.awt.*;


public class Zombie extends Enemy implements IGrabbable{
    private Sprite draw;

    public Zombie(Float x, Float y) {
        super(30, 30, 1.0f, x, y,.12f, .28f, 1.3f,1.7f, new Weapon(5,1), 1.5f);
        this.angle = (float) Math.random() * (360 + 1);
    }

    public Sprite getDraw() {
        return draw;
    }

    public void setDraw(Sprite draw) {
        this.draw = draw;
    }
}
