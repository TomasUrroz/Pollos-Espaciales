package com.game.Entities.Enemies;

import com.game.Entities.Personaje;

public class Enemy extends Personaje {

    public Enemy(Integer hp, Integer maxHp, Float armor, Float x, Float y, Float width, Float height, Float draw_width, Float draw_height, Float speed) {
        super(hp, maxHp, armor, x, y, width, height, draw_width, draw_height, speed);
    }

}
