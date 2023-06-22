package com.game.Entities;

import com.badlogic.gdx.physics.box2d.World;
import com.game.CharacterProperties.SizeE;
import com.game.CharacterProperties.Stats;

public class Furniture extends Entity{

    public Furniture(World world, long addr, Integer hp, Integer maxHp, Float armor, Integer x, Integer y, Integer width, Integer height) {
        super(world, addr, hp, maxHp, armor, x, y, width, height);
    }

    public Furniture(World world, long addr, Stats stats, SizeE sizeE) {
        super(world, addr, stats, sizeE);
    }

    public Integer getState(){
        if(getHp() == getMaxHp()) return 0;
        else if (0 < getHp() && getHp() >= getMaxHp()*0.5) return 1;
        else return 2;
    }
}
