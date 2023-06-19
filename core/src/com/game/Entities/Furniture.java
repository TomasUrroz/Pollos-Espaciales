package com.game.Entities;

import com.game.CharacterProperties.SizeE;
import com.game.CharacterProperties.Stats;

public class Furniture extends Entity{

    public Furniture(Integer hp, Integer maxHp, Float armor, Integer x, Integer y, Integer width, Integer height) {
        super(hp, maxHp, armor, x, y, width, height);
    }

    public Furniture(Stats stats, SizeE sizeE) {
        super(stats, sizeE);
    }

    public Integer getState(){
        if(getHp() == getMaxHp()) return 0;
        else if (0 < getHp() && getHp() >= getMaxHp()*0.5) return 1;
        else return 2;
    }
}
