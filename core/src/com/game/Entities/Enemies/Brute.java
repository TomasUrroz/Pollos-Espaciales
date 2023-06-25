package com.game.Entities.Enemies;

import com.game.Entities.CharacterProperties.Weapon;
import com.game.Entities.Entity;


public class Brute extends Enemy {
    private Entity ammo;

    public Brute(Float x, Float y, Weapon weapon) {
        super(100, 100, 0.3f, x, y, .45f, .6f, 1.3f, 1.7f, new Weapon(5, 1), 1.5f);
        this.ammo = null;
    }

    public Brute(Integer hp, Integer maxHp, Float armor, Float x, Float y, Float width, Float height, Float draw_width, Float draw_height, Weapon weapon, Entity ammo, Float speed) {
        super(hp, maxHp, armor, x, y, width, height, draw_width, draw_height, weapon, speed);
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

    public void throwEntity(int posX, int posY) {
        //*le revolea un mogo*
    }


}
