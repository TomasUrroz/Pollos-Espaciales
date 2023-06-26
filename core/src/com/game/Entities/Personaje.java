package com.game.Entities;

import com.badlogic.gdx.physics.box2d.Body;
import com.game.Entities.CharacterProperties.IDeath;
import com.game.Entities.CharacterProperties.ISpeed;

public abstract class Personaje extends Entity implements ISpeed, IDeath {
    static final float EXPLOSION_DURATION = 0.95f;
    static Float speed;
    static boolean isAttacking = false;
    static boolean isHurt = false;
    static float stateTime = 0;
    final int STATE_NORMAL = 0;
    final int STATE_EXPLODE = 1;
    final int STATE_REMOVE = 2;
    public Float angle;
    int state;
    float angleDeg;


    public Personaje(Integer hp, Integer maxHp, Float armor, Float x, Float y, Float width, Float height, Float draw_width, Float draw_height, Float speed) {
        super(hp, maxHp, armor, x, y, width, height, draw_width, draw_height);
        this.speed = speed;
        state = STATE_NORMAL;

    }


    public static boolean isIsHurt() {
        return isHurt;
    }

    public static void setIsHurt(boolean isHurt) {
        Personaje.isHurt = isHurt;
    }

    public static boolean isIsAttacking() {
        return isAttacking;
    }

    public static void setIsAttacking(boolean isAttacking) {
        Personaje.isAttacking = isAttacking;
    }

    public static float getStateTime() {
        return stateTime;
    }

    public static void setStateTime(float stateTime) {
        Personaje.stateTime = stateTime;
    }



    /*                         GETTERS Y SETTERS                                         */

    @Override
    public void update(Body body, Float delta, Float accelX, Float accelY, String action) {
        position.x = body.getPosition().x;
        position.y = body.getPosition().y;

        velocity = body.getLinearVelocity();

        if (action.equalsIgnoreCase("str")) {
            setStraight();
        } else if (action.equalsIgnoreCase("hurt")) {
            isHurt = true;
        }

        if (accelX == -1) {
            velocity.x = -speed;
        } else if (accelX == 1) {
            velocity.x = speed;
        }
        if (accelY == -1) {
            velocity.y = -speed;
        } else if (accelY == 1) {
            velocity.y = speed;
        }
        body.setLinearVelocity(velocity);
        stateTime += delta;
    }


    @Override
    public Float getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(Float speed) {
        speed = speed;
    }

    @Override
    public Boolean isAlive() {
        if (this.getHp() > 0) return true;
        else return false;
    }

    public void setStraight() {
        this.angle = 0.0f;
    }

    public int getSTATE_NORMAL() {
        return STATE_NORMAL;
    }

    public int getSTATE_EXPLODE() {
        return STATE_EXPLODE;
    }

    public int getSTATE_REMOVE() {
        return STATE_REMOVE;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
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

    public float getAngleDeg() {
        return angleDeg;
    }

    public void setAngleDeg(float angleDeg) {
        this.angleDeg = angleDeg;
    }
}
