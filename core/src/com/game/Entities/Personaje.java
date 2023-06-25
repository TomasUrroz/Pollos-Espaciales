package com.game.Entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.physics.box2d.Body;
import com.game.Entities.CharacterProperties.*;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class Personaje extends Entity implements IMelee, ISpeed, IDeath {
    static Float speed;
    public static final Float IDDLE_FRAME_DURATION = 0.04f;
    public static final Float RUN_FRAME_DURATION = 0.06f;
    public static final Float WALK_FRAME_DURATION = 0.1f;
    public static final Float ATTK1_FRAME_DURATION = 0.135f;
    public static final Float ATTK2_FRAME_DURATION = 0.06f;
    public static final Float ATTK3_FRAME_DURATION = 0.06f;
    public static final Float DEATH_FRAME_DURATION = 0.06f;
    public static final Float HURT_FRAME_DURATION = 0.03f;
    static boolean isAttacking = false;
    static boolean isHurt = false;
    public Float angle ;

    static float stateTime = 0;

    public Personaje(Integer hp, Integer maxHp, Float armor, Float x, Float y, Float width, Float height, Float draw_width, Float draw_height, Float speed) {
        super(hp, maxHp, armor, x, y, width, height, draw_width, draw_height);
        this.speed = speed;
    }
    public Personaje(Stats stats, SizeE sizeE) {
        super(stats.getHp(), stats.getMaxHp(), stats.getArmor(), sizeE.getX(), sizeE.getY(), sizeE.getWidth(), sizeE.getHeight(), sizeE.getDrawWidth(), sizeE.getDrawHeight());
        this.speed = stats.getSpeed();
    }

    @Override
    public void update(Body body, Float delta, Float accelX, Float accelY, String action) {
        position.x = body.getPosition().x;
        position.y = body.getPosition().y;

        velocity = body.getLinearVelocity();

        if(action.equalsIgnoreCase("str")){
            setStraight();
        }else if(action.equalsIgnoreCase("hurt")){
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
    public void attack(int side) {
        //MOMENTO MARIAN
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
        if(super.getHp()>0) return true;
        else return false;
    }

    public void setStraight(){
        this.angle=0.0f;
    }



    /*                         GETTERS Y SETTERS                                         */

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


}
