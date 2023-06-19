package com.game.Entities.Enemies;

import com.badlogic.gdx.Input;
import com.game.CharacterProperties.SizeE;
import com.game.CharacterProperties.Stats;
import com.game.Entities.CharacterProperties.IGrabbable;
import com.game.Entities.CharacterProperties.Weapon;


public class Zombie extends Enemy implements IGrabbable{
    public Zombie(Integer hp, Integer maxHp, Float armor, Integer x, Integer y, Integer width, Integer height, Integer speed, Weapon weapon) {
        super(hp, maxHp, armor, x, y, width, height, speed, weapon);
    }
    public Zombie(Stats stats, SizeE sizeE, Weapon weapon) {
        super(stats.getHp(), stats.getMaxHp(), stats.getArmor(), sizeE.getX(), sizeE.getY(), sizeE.getWidth(), sizeE.getHeight(), stats.getSpeed(), weapon);;
    }
    public void move(int side) {
        if(side == Input.Keys.LEFT){
            this.setX(this.getX()-this.getSpeed());
        }else if(side == Input.Keys.RIGHT){
            this.setX(this.getX()+this.getSpeed());
        }else if(side == Input.Keys.UP){
            this.setY(this.getY()+this.getSpeed());
        }else if(side == Input.Keys.DOWN){
            this.setY(this.getY()-this.getSpeed());
        }
    }

}
