package com.game.Entities.Enemies;

import com.game.Entities.CharacterProperties.CharacterAnimations;
import com.game.Entities.CharacterProperties.SizeE;
import com.game.Entities.CharacterProperties.Stats;
import com.game.Entities.Personaje;
import com.game.Entities.CharacterProperties.Weapon;

public class Enemy extends Personaje {
    private Weapon weapon;

    public Enemy(Integer hp, Integer maxHp, Float armor, Float x, Float y, Float width, Float height, Float draw_width, Float draw_height, Weapon weapon, Float speed, CharacterAnimations anim) {
        super(hp, maxHp, armor, x, y, width, height, draw_width, draw_height, speed, anim);
        this.weapon = weapon;
    }

    public Enemy(Stats stats, SizeE sizeE, Weapon weapon, CharacterAnimations anim) {
        super(stats, sizeE, anim);
        this.weapon = weapon;
    }

    @Override
    public Weapon getSelectedWeapon() {
        return this.weapon;
    }


}
