package com.game.Entities.Enemies;

import com.game.Weapon;
import com.game.Entities.CharacterProperties.IGrabbable;

public class Zombie extends Enemy implements IGrabbable{
    public Zombie(Integer hp,Integer maxHp, Float armor, Integer speed, Weapon weapon) {
        super(hp, maxHp, armor, speed, weapon);
    }

    @Override
    public void move(int side) {

    }
}
