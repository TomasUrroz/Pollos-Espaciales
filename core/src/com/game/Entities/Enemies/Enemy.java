package com.game.Entities.Enemies;

import com.game.Entities.CharacterProperties.CharacterAnimations;
import com.game.Entities.CharacterProperties.SizeE;
import com.game.Entities.CharacterProperties.Stats;
import com.game.Entities.Personaje;
import com.game.Entities.CharacterProperties.Weapon;

public class Enemy extends Personaje {
    private Weapon weapon;

    public Enemy(Integer hp, Integer maxHp, Float armor, Float x, Float y, Float width, Float height, Float draw_width, Float draw_height, Float iddle_frame_duration, Float run_frame_duration, Float walk_frame_duration, Float attk1_frame_duration, Float attk2_frame_duration, Float attk3_frame_duration, Float death_frame_duration, Float hurt_frame_duration, Weapon weapon) {
        super(hp, maxHp, armor, x, y, width, height, draw_width, draw_height, iddle_frame_duration, run_frame_duration, walk_frame_duration, attk1_frame_duration, attk2_frame_duration, attk3_frame_duration, death_frame_duration, hurt_frame_duration);
        this.weapon = weapon;
    }

    public Enemy(Stats stats, SizeE sizeE, CharacterAnimations charAn, Weapon weapon) {
        super(stats, sizeE, charAn);
        this.weapon = weapon;
    }

    @Override
    public Weapon getSelectedWeapon() {
        return this.weapon;
    }


}
