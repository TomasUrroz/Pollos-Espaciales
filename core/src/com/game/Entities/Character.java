package com.game.Entities;

import com.game.CharacterProperties.IDeath;
import com.game.CharacterProperties.IMelee;
import com.game.CharacterProperties.ISpeed;


public abstract class Character extends Entity implements IMelee, ISpeed, IDeath {
    private Integer speed;

    public Character(Integer hp, Integer maxHp, Float armor, Integer speed) {
        super(hp, maxHp, armor);
        this.speed = speed;
    }

    public void move(int side){
        //YO EQUISDE
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
