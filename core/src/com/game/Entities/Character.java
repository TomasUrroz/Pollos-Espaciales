package com.game.Entities;

import com.game.Entities.CharacterProperties.IDeath;
import com.game.Entities.CharacterProperties.IMelee;
import com.game.Entities.CharacterProperties.ISpeed;


public abstract class Character extends Entity implements IMelee, ISpeed, IDeath {
    private Integer speed;

    public Character(Integer hp, Integer maxHp, Float armor, Integer speed) {
        super(hp, maxHp, armor);
        this.speed = speed;
    }



    @Override
    public void attack(int side) {
        //MOMENTO MARIAN
    }

    @Override
    public Integer getSpeed() {
        return this.speed;
    }

    @Override
    public void setSpeed(Integer newSpeed) {
        this.speed -= newSpeed;
    }

    @Override
    public Boolean isAlive() {
        if(super.getHp()>0) return true;
        else return false;
    }
}
