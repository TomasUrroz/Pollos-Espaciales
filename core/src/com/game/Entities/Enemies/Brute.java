package com.game.Entities.Enemies;

import com.game.Entities.Entity;
import com.game.Entities.CharacterProperties.Weapon;


public class Brute extends Enemy{
    private Entity ammo;

    public Brute(Float x, Float y, Weapon weapon) {
        super(100, 100, 0.3f, x, y, .45f, .6f, 1.3f,1.7f,0.05f,0.05f,0.05f,0.05f,0.05f,0.05f,0.05f,0.05f, new Weapon(5,1));
        this.ammo = null;
    }

    public Brute(Integer hp, Integer maxHp, Float armor, Float x, Float y, Float width, Float height, Float draw_width, Float draw_height, Float iddle_frame_duration, Float run_frame_duration, Float walk_frame_duration, Float attk1_frame_duration, Float attk2_frame_duration, Float attk3_frame_duration, Float death_frame_duration, Float hurt_frame_duration, Weapon weapon, Entity ammo) {
        super(hp, maxHp, armor, x, y, width, height, draw_width, draw_height, iddle_frame_duration, run_frame_duration, walk_frame_duration, attk1_frame_duration, attk2_frame_duration, attk3_frame_duration, death_frame_duration, hurt_frame_duration, weapon);
        this.ammo = ammo;
    }

    public Entity getAmmo() {
        return ammo;
    }

    public void setAmmo(Entity ammo) {
        this.ammo = ammo;
    }


    public void grab(int direction) {
        //*agarra a alguien
    }

    public void throwEntity(int posX, int posY){
        //*le revolea un mogo*
    }


}
