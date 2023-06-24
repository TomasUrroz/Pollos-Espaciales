package com.game.Entities.Enemies;

import com.game.Entities.CharacterProperties.IGrabbable;
import com.game.Entities.CharacterProperties.Weapon;


public class Zombie extends Enemy implements IGrabbable{

    public Zombie(Float x, Float y) {
        super(30, 30, 1.0f, x, y, .45f, .6f, 1.3f,1.7f,0.05f,0.05f,0.05f,0.05f,0.05f,0.05f,0.05f,0.05f, new Weapon(5,1));
    }


}
