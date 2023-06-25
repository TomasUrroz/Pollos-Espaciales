package com.game.Entities.Enemies;

import com.game.Entities.CharacterProperties.SizeE;
import com.game.Entities.CharacterProperties.Stats;
import com.game.Entities.CharacterProperties.Weapon;
import com.game.Entities.Personaje;

public class Enemy extends Personaje {
    private Weapon weapon;

    public Enemy(Integer hp, Integer maxHp, Float armor, Float x, Float y, Float width, Float height, Float draw_width, Float draw_height, Weapon weapon, Float speed) {
        super(hp, maxHp, armor, x, y, width, height, draw_width, draw_height, speed);
        this.weapon = weapon;
    }

    public Enemy(Stats stats, SizeE sizeE, Weapon weapon) {
        super(stats, sizeE);
        this.weapon = weapon;
    }

    @Override
    public Weapon getSelectedWeapon() {
        return this.weapon;
    }


}
