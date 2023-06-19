package com.game.Entities;

import com.game.CharacterProperties.ISpeed;
import com.game.CharacterProperties.SizeE;
import com.game.CharacterProperties.Stats;
import com.game.Entities.CharacterProperties.IDeath;
import com.game.Entities.CharacterProperties.IMelee;

public abstract class Character extends Entity implements IMelee, ISpeed, IDeath {
    private Integer speed;

    public Character(Integer hp, Integer maxHp, Float armor, Integer x, Integer y, Integer width, Integer height, Integer speed) {
        super(hp, maxHp, armor, x, y, width, height);
        this.speed = speed;
    }
    public Character(Stats stats, SizeE sizeE, Integer speed) {
        super(stats.getHp(), stats.getMaxHp(), stats.getArmor(), sizeE.getX(), sizeE.getY(), sizeE.getWidth(), sizeE.getHeight());;
        this.speed = speed;
    }

    @Override
    public void attack(int side) {
        //MOMENTO MARIAN
    }

    @Override
    public Integer getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    @Override
    public Boolean isAlive() {
        if(super.getHp()>0) return true;
        else return false;
    }
}
