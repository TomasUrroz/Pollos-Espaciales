package com.game.Entities;

import com.badlogic.gdx.physics.box2d.Body;
import com.game.Entities.CharacterProperties.*;

public abstract class Personaje extends Entity implements IMelee, ISpeed, IDeath {
    static Float speed;
    static Float iddle_frame_duration ;
    static Float run_frame_duration ;
    static Float walk_frame_duration ;
    static Float attk1_frame_duration ;
    static Float attk2_frame_duration ;
    static Float attk3_frame_duration ;
    static Float death_frame_duration ;
    static Float hurt_frame_duration ;
    static boolean isWalking;
    static boolean isIddle;
    static boolean isRunning;
    static boolean isAttacking;
    static boolean isDying;

    static float stateTime = 0;
    public Personaje(Integer hp, Integer maxHp, Float armor, Float x, Float y, Float width, Float height, Float draw_width, Float draw_height, Float iddle_frame_duration, Float run_frame_duration, Float walk_frame_duration, Float attk1_frame_duration, Float attk2_frame_duration, Float attk3_frame_duration, Float death_frame_duration, Float hurt_frame_duration) {
        super(hp, maxHp, armor, x, y, width, height, draw_width, draw_height);
        this.iddle_frame_duration = iddle_frame_duration;
        this.run_frame_duration = run_frame_duration;
        this.walk_frame_duration = walk_frame_duration;
        this.attk1_frame_duration = attk1_frame_duration;
        this.attk2_frame_duration = attk2_frame_duration;
        this.attk3_frame_duration = attk3_frame_duration;
        this.death_frame_duration = death_frame_duration;
        this.hurt_frame_duration = hurt_frame_duration;
    }
    public Personaje(Stats stats, SizeE sizeE, CharacterAnimations charAn) {
        super(stats.getHp(), stats.getMaxHp(), stats.getArmor(), sizeE.getX(), sizeE.getY(), sizeE.getWidth(), sizeE.getHeight(), sizeE.getDrawWidth(), sizeE.getDrawHeight());
        this.speed = stats.getSpeed();
        this.iddle_frame_duration =charAn.getIddle_frame_duration();
        this.run_frame_duration = charAn.getRun_frame_duration();
        this.walk_frame_duration = charAn.getWalk_frame_duration();
        this.attk1_frame_duration = charAn.getAttk1_frame_duration();
        this.attk2_frame_duration = charAn.getAttk2_frame_duration();
        this.attk3_frame_duration = charAn.getAttk3_frame_duration();
        this.death_frame_duration = charAn.getDeath_frame_duration();
        this.hurt_frame_duration = charAn.getHurt_frame_duration();
    }

    @Override
    public void update(Body body, Float delta, Float accelX, Float accelY) {
        position.x = body.getPosition().x;
        position.y = body.getPosition().y;

        velocity = body.getLinearVelocity();
        isIddle = true;
        if (accelX == -1) {
            isIddle = false;
            velocity.x = -speed;
            isWalking = true;
        } else if (accelX == 1) {
            isIddle = false;
            velocity.x = speed;
            isWalking = true;
        } else {
            isIddle = true;
            velocity.x = 0;
            isWalking = false;
        }
        if (accelY == -1) {
            isIddle = false;
            isWalking = true;
            velocity.y = -speed;
        } else if (accelY == 1) {
            isIddle = false;
            velocity.y = speed;
            isWalking = true;
        } else {
            isIddle = true;
            velocity.y = 0;
            isWalking = false;
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

    public static Float getIddle_frame_duration() {
        return iddle_frame_duration;
    }

    public void setIddle_frame_duration(Float iddle_frame_duration) {
        this.iddle_frame_duration = iddle_frame_duration;
    }

    public static Float getRun_frame_duration() {
        return run_frame_duration;
    }

    public void setRun_frame_duration(Float run_frame_duration) {
        this.run_frame_duration = run_frame_duration;
    }

    public static Float getWalk_frame_duration() {
        return walk_frame_duration;
    }

    public void setWalk_frame_duration(Float walk_frame_duration) {
        this.walk_frame_duration = walk_frame_duration;
    }

    public static Float getAttk1_frame_duration() {
        return attk1_frame_duration;
    }

    public void setAttk1_frame_duration(Float attk1_frame_duration) {
        this.attk1_frame_duration = attk1_frame_duration;
    }

    public static Float getAttk2_frame_duration() {
        return attk2_frame_duration;
    }

    public void setAttk2_frame_duration(Float attk2_frame_duration) {
        this.attk2_frame_duration = attk2_frame_duration;
    }

    public static Float getAttk3_frame_duration() {
        return attk3_frame_duration;
    }

    public void setAttk3_frame_duration(Float attk3_frame_duration) {
        this.attk3_frame_duration = attk3_frame_duration;
    }

    public static Float getDeath_frame_duration() {
        return death_frame_duration;
    }

    public void setDeath_frame_duration(Float death_frame_duration) {
        this.death_frame_duration = death_frame_duration;
    }

    public static Float getHurt_frame_duration() {
        return hurt_frame_duration;
    }

    public void setHurt_frame_duration(Float hurt_frame_duration) {
        this.hurt_frame_duration = hurt_frame_duration;
    }


    public static float getStateTime() {
        return stateTime;
    }

    public static void setStateTime(float stateTime) {
        Personaje.stateTime = stateTime;
    }
}
