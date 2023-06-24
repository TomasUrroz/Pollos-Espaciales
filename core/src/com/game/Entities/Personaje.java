package com.game.Entities;

import com.badlogic.gdx.physics.box2d.Body;
import com.game.Entities.CharacterProperties.*;

public abstract class Personaje extends Entity implements IMelee, ISpeed, IDeath {
    static Float speed;
    public static final Float IDDLE_FRAME_DURATION = 0.04f;
    public static final Float RUN_FRAME_DURATION = 0.06f;
    public static final Float WALK_FRAME_DURATION = 0.1f;
    public static final Float ATTK1_FRAME_DURATION = 0.06f;
    public static final Float ATTK2_FRAME_DURATION = 0.06f;
    public static final Float ATTK3_FRAME_DURATION = 0.06f;
    public static final Float DEATH_FRAME_DURATION = 0.06f;
    public static final Float HURT_FRAME_DURATION = 0.03f;
    static boolean isWalking = false;
    static boolean isIddle = false;
    static boolean isRunning = false;
    static boolean isAttacking = false;
    static boolean isDying = false;

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
    public void update(Body body, Float delta, Float accelX, Float accelY) {
        position.x = body.getPosition().x;
        position.y = body.getPosition().y;

        velocity = body.getLinearVelocity();
//HACER ACA TODO EL TEMA DEL MOVMIENTO Y ESO DEL PERSONAJE. SI NO COMO QUE SE BUGEA TODO AL RE PINGO SI LO HAGO SEPARADO


        if(accelX != 0 || accelY !=0){
            isWalking = true;
            isIddle = false;
        }else {
            isWalking = false;
            isIddle = true;
        }

        if (accelX == -1) {
            velocity.x = -speed;
        } else if (accelX == 1) {
            velocity.x = speed;
        } else {
            velocity.x = 0;
        }
        if (accelY == -1) {
            velocity.y = -speed;
        } else if (accelY == 1) {
            velocity.y = speed;
        } else {
            velocity.y = 0;
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





    /*                         GETTERS Y SETTERS                                         */

    public static boolean isIsIddle() {
        return isIddle;
    }

    public static void setIsIddle(boolean isIddle) {
        Personaje.isIddle = isIddle;
    }

    public static boolean isIsWalking() {
        return isWalking;
    }

    public static void setIsWalking(boolean isWalking) {
        Personaje.isWalking = isWalking;
    }

    public static boolean isIsRunning() {
        return isRunning;
    }

    public static void setIsRunning(boolean isRunning) {
        Personaje.isRunning = isRunning;
    }

    public static boolean isIsAttacking() {
        return isAttacking;
    }

    public static void setIsAttacking(boolean isAttacking) {
        Personaje.isAttacking = isAttacking;
    }

    public static boolean isIsDying() {
        return isDying;
    }

    public static void setIsDying(boolean isDying) {
        Personaje.isDying = isDying;
    }

    public static float getStateTime() {
        return stateTime;
    }

    public static void setStateTime(float stateTime) {
        Personaje.stateTime = stateTime;
    }




}
