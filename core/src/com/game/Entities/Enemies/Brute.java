package com.game.Entities.Enemies;

import com.game.Entities.Entity;
import com.game.Weapon;

public class Brute extends Enemy{
    private Entity ammo;

    public Brute(Integer hp,Integer maxHp, Float armor, Integer speed, Weapon weapon) {
        super(hp,maxHp, armor, speed, weapon);
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
