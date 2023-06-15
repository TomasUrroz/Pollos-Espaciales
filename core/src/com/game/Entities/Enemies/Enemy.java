package com.game.Entities.Enemies;

import com.game.Entities.Character;
import com.game.Weapon;

public class Enemy extends Character {
    private Weapon weapon;

    public Enemy(Integer hp, Integer maxHp,Float armor, Integer speed, Weapon weapon) {
        super(hp, maxHp, armor, speed);
        this.weapon = weapon;
    }

    @Override
    public Weapon getSelectedWeapon() {
        return weapon;
    }
    @Override
    public void move(int side) {

    }
}
