package com.game.Entities;

import com.badlogic.gdx.physics.box2d.Body;
import com.game.Entities.CharacterProperties.*;

public abstract class Personaje extends Entity implements ISpeed, IDeath {
    static Float speed;
    static boolean isAttacking = false;
    static boolean isHurt = false;
    static float stateTime = 0;
    public Float angle;

    public Personaje(Integer hp, Integer maxHp, Float armor, Float x, Float y, Float width, Float height, Float draw_width, Float draw_height, Float speed) {
        super(hp, maxHp, armor, x, y, width, height, draw_width, draw_height);
        this.speed = speed;
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
        if (super.getHp() > 0) return true;
        else return false;
    }

    public void setStraight() {
        this.angle = 0.0f;
    }


}
