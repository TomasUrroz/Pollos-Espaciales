package com.game.Entities;

public class Furniture extends Entity{

    public Furniture(Integer hp, Integer maxHp, Float armor, Float x, Float y, Float width, Float height, Float draw_width, Float draw_height) {
        super(hp, maxHp, armor, x, y, width, height, draw_width, draw_height);
    }

    public Integer getState(){
        if(getHp() == getMaxHp()) return 0;
        else if (0 < getHp() && getHp() >= getMaxHp()*0.5) return 1;
        else return 2;
    }
}
