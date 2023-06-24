package com.game.Entities.CharacterProperties;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.game.tutoriales.learn8.Animation;

import java.util.ArrayList;

public class CharacterAnimations {
    private Animation iddleAnimation;
    private Animation runAnimation;
    private Animation walkAnimation;
    private Animation attk1Animation;
    private Animation attk2Animation;
    private Animation attk3Animation;
    private Animation deathAnimation;
    private Animation hurtAnimation;

    //legacy despues borrar
    private Float iddle_frame_duration ;
    private Float run_frame_duration ;
    private Float walk_frame_duration ;
    private Float attk1_frame_duration ;
    private Float attk2_frame_duration ;
    private Float attk3_frame_duration ;
    private Float death_frame_duration ;
    private Float hurt_frame_duration ;

    public CharacterAnimations(String choice, Float iddle_frame_duration, Float run_frame_duration, Float walk_frame_duration, Float attk1_frame_duration, Float attk2_frame_duration, Float attk3_frame_duration, Float death_frame_duration, Float hurt_frame_duration) {
        makeAnim(choice);
        this.iddle_frame_duration = iddle_frame_duration;
        this.run_frame_duration = run_frame_duration;
        this.walk_frame_duration = walk_frame_duration;
        this.attk1_frame_duration = attk1_frame_duration;
        this.attk2_frame_duration = attk2_frame_duration;
        this.attk3_frame_duration = attk3_frame_duration;
        this.death_frame_duration = death_frame_duration;
        this.hurt_frame_duration = hurt_frame_duration;
    }

    private void makeAnim(String choice){
        Texture texture;
        if (choice.equalsIgnoreCase("zm")){
            texture = new Texture("Entities/Zombies/Zombie Man/Idle.png");
            this.iddleAnimation = new Animation(new TextureRegion(texture), 8, 0.5f);

            texture = new Texture("Entities/Zombies/Zombie Man/run.png");
            this.runAnimation = new Animation(new TextureRegion(texture), 7, 0.5f);

            texture = new Texture("Entities/Zombies/Zombie Man/walk.png");
            this.walkAnimation = new Animation(new TextureRegion(texture), 8, 0.5f);

            texture = new Texture("Entities/Zombies/Zombie Man/Attack_1.png");
            this.attk1Animation = new Animation(new TextureRegion(texture), 5, 0.5f);

            texture = new Texture("Entities/Zombies/Zombie Man/Attack_2.png");
            this.attk2Animation = new Animation(new TextureRegion(texture), 4, 0.5f);

            texture = new Texture("Entities/Zombies/Zombie Man/Attack_3.png");
            this.attk3Animation = new Animation(new TextureRegion(texture), 5, 0.5f);

            texture = new Texture("Entities/Zombies/Zombie Man/dead.png");
            this.deathAnimation = new Animation(new TextureRegion(texture), 5, 0.5f);

            texture = new Texture("Entities/Zombies/Zombie Man/hurt.png");
            this.hurtAnimation = new Animation(new TextureRegion(texture), 3, 0.5f);

        }else if(choice.equalsIgnoreCase("zw")){

            texture = new Texture("Entities/Zombies/Zombie Woman/Idle.png");
            this.iddleAnimation = new Animation(new TextureRegion(texture), 5, 0.5f);

            texture = new Texture("Entities/Zombies/Zombie Woman/run.png");
            this.runAnimation = new Animation(new TextureRegion(texture), 7, 0.5f);

            texture = new Texture("Entities/Zombies/Zombie Woman/walk.png");
            this.walkAnimation = new Animation(new TextureRegion(texture), 7, 0.5f);

            texture = new Texture("Entities/Zombies/Zombie Woman/Attack_1.png");
            this.attk1Animation = new Animation(new TextureRegion(texture), 4, 0.5f);

            texture = new Texture("Entities/Zombies/Zombie Woman/Attack_2.png");
            this.attk2Animation = new Animation(new TextureRegion(texture), 4, 0.5f);

            texture = new Texture("Entities/Zombies/Zombie Woman/Attack_3.png");
            this.attk3Animation = new Animation(new TextureRegion(texture), 4, 0.5f);

            texture = new Texture("Entities/Zombies/Zombie Woman/dead.png");
            this.deathAnimation = new Animation(new TextureRegion(texture), 5, 0.5f);

            texture = new Texture("Entities/Zombies/Zombie Woman/hurt.png");
            this.hurtAnimation = new Animation(new TextureRegion(texture), 3, 0.5f);

        }else if(choice.equalsIgnoreCase("wz")){
            texture = new Texture("Entities/Zombies/Wild Zombie/Idle.png");
            this.iddleAnimation = new Animation(new TextureRegion(texture), 9, 0.5f);

            texture = new Texture("Entities/Zombies/Wild Zombie/run.png");
            this.runAnimation = new Animation(new TextureRegion(texture), 8, 0.5f);

            texture = new Texture("Entities/Zombies/Wild Zombie/walk.png");
            this.walkAnimation = new Animation(new TextureRegion(texture), 10, 0.5f);

            texture = new Texture("Entities/Zombies/Wild Zombie/Attack_1.png");
            this.attk1Animation = new Animation(new TextureRegion(texture), 4, 0.5f);

            texture = new Texture("Entities/Zombies/Wild Zombie/Attack_2.png");
            this.attk2Animation = new Animation(new TextureRegion(texture), 4, 0.5f);

            texture = new Texture("Entities/Zombies/Wild Zombie/Attack_3.png");
            this.attk3Animation = new Animation(new TextureRegion(texture), 4, 0.5f);

            texture = new Texture("Entities/Zombies/Wild Zombie/dead.png");
            this.deathAnimation = new Animation(new TextureRegion(texture), 5, 0.5f);

            texture = new Texture("Entities/Zombies/Wild Zombie/hurt.png");
            this.hurtAnimation = new Animation(new TextureRegion(texture), 3, 0.5f);
        }
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

    public Animation getIddleAnimation() {
        return iddleAnimation;
    }

    public void setIddleAnimation(Animation iddleAnimation) {
        this.iddleAnimation = iddleAnimation;
    }

    public Animation getRunAnimation() {
        return runAnimation;
    }

    public void setRunAnimation(Animation runAnimation) {
        this.runAnimation = runAnimation;
    }

    public Animation getWalkAnimation() {
        return walkAnimation;
    }

    public void setWalkAnimation(Animation walkAnimation) {
        this.walkAnimation = walkAnimation;
    }

    public Animation getAttk1Animation() {
        return attk1Animation;
    }

    public void setAttk1Animation(Animation attk1Animation) {
        this.attk1Animation = attk1Animation;
    }

    public Animation getAttk2Animation() {
        return attk2Animation;
    }

    public void setAttk2Animation(Animation attk2Animation) {
        this.attk2Animation = attk2Animation;
    }

    public Animation getAttk3Animation() {
        return attk3Animation;
    }

    public void setAttk3Animation(Animation attk3Animation) {
        this.attk3Animation = attk3Animation;
    }

    public Animation getDeathAnimation() {
        return deathAnimation;
    }

    public void setDeathAnimation(Animation deathAnimation) {
        this.deathAnimation = deathAnimation;
    }

    public Animation getHurtAnimation() {
        return hurtAnimation;
    }

    public void setHurtAnimation(Animation hurtAnimation) {
        this.hurtAnimation = hurtAnimation;
    }
}
