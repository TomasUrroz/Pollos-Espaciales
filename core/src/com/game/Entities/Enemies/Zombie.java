package com.game.Entities.Enemies;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.game.Entities.CharacterProperties.IGrabbable;
import com.game.Entities.CharacterProperties.Weapon;

import java.awt.*;


public class Zombie extends Enemy implements IGrabbable{
    private Sprite draw;
     final int STATE_NORMAL = 0;
     final int STATE_EXPLODE = 1;
     final int STATE_REMOVE = 2;

    static final float EXPLOSION_DURATION = 0.95f;

    int state;
    float stateTime = 0;

    float angleDeg;
    Vector2 position;

    public Zombie(Float x, Float y) {
        super(30, 30, 1.0f, x, y,.12f, .28f, 1.3f,1.7f, new Weapon(5,1), 1.5f);
        state = STATE_NORMAL;
    }

    public Sprite getDraw() {
        return draw;
    }

    public void setDraw(Sprite draw) {
        this.draw = draw;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getSTATE_NORMAL() {
        return STATE_NORMAL;
    }

    public void update(Body body, float delta) {
        if (state == STATE_NORMAL) {
            position.x = body.getPosition().x;
            position.y = body.getPosition().y;
            angleDeg = (float) Math.toDegrees(body.getAngle());
        } else if (state == STATE_EXPLODE) {
            if (stateTime >= EXPLOSION_DURATION) {
                state = STATE_REMOVE;
                stateTime = 0;
            }
        }
        stateTime += delta;
    }

    public void hit() {
        if (state == STATE_NORMAL) {
            state = STATE_EXPLODE;
            stateTime = 0;
        }
    }

}
