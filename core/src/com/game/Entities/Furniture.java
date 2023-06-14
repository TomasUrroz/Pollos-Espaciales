package com.game.Entities;

public class Furniture extends Entity{

    public Furniture(Integer hp, Integer maxHp, Float armor) {
        super(hp, maxHp, armor);
    }

    public Integer getState(){
        if(getHp() == getMaxHp()) return 0;
        else if (0 < getHp() && getHp() >= getMaxHp()*0.5) return 1;
        else return 2;
    }
}
