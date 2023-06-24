package com.game.Entities.CharacterProperties;

public class CharacterAnimations {
    private Float iddle_frame_duration ;
    private Float run_frame_duration ;
    private Float walk_frame_duration ;
    private Float attk1_frame_duration ;
    private Float attk2_frame_duration ;
    private Float attk3_frame_duration ;
    private Float death_frame_duration ;
    private Float hurt_frame_duration ;

    public CharacterAnimations(Float iddle_frame_duration, Float run_frame_duration, Float walk_frame_duration, Float attk1_frame_duration, Float attk2_frame_duration, Float attk3_frame_duration, Float death_frame_duration, Float hurt_frame_duration) {
        this.iddle_frame_duration = iddle_frame_duration;
        this.run_frame_duration = run_frame_duration;
        this.walk_frame_duration = walk_frame_duration;
        this.attk1_frame_duration = attk1_frame_duration;
        this.attk2_frame_duration = attk2_frame_duration;
        this.attk3_frame_duration = attk3_frame_duration;
        this.death_frame_duration = death_frame_duration;
        this.hurt_frame_duration = hurt_frame_duration;
    }

    public Float getIddle_frame_duration() {
        return iddle_frame_duration;
    }

    public void setIddle_frame_duration(Float iddle_frame_duration) {
        this.iddle_frame_duration = iddle_frame_duration;
    }

    public Float getRun_frame_duration() {
        return run_frame_duration;
    }

    public void setRun_frame_duration(Float run_frame_duration) {
        this.run_frame_duration = run_frame_duration;
    }

    public Float getWalk_frame_duration() {
        return walk_frame_duration;
    }

    public void setWalk_frame_duration(Float walk_frame_duration) {
        this.walk_frame_duration = walk_frame_duration;
    }

    public Float getAttk1_frame_duration() {
        return attk1_frame_duration;
    }

    public void setAttk1_frame_duration(Float attk1_frame_duration) {
        this.attk1_frame_duration = attk1_frame_duration;
    }

    public Float getAttk2_frame_duration() {
        return attk2_frame_duration;
    }

    public void setAttk2_frame_duration(Float attk2_frame_duration) {
        this.attk2_frame_duration = attk2_frame_duration;
    }

    public Float getAttk3_frame_duration() {
        return attk3_frame_duration;
    }

    public void setAttk3_frame_duration(Float attk3_frame_duration) {
        this.attk3_frame_duration = attk3_frame_duration;
    }

    public Float getDeath_frame_duration() {
        return death_frame_duration;
    }

    public void setDeath_frame_duration(Float death_frame_duration) {
        this.death_frame_duration = death_frame_duration;
    }

    public Float getHurt_frame_duration() {
        return hurt_frame_duration;
    }

    public void setHurt_frame_duration(Float hurt_frame_duration) {
        this.hurt_frame_duration = hurt_frame_duration;
    }
}
