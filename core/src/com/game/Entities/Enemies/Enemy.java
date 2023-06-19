package com.game.Entities.Enemies;

import com.badlogic.gdx.Input;
import com.game.CharacterProperties.SizeE;
import com.game.CharacterProperties.Stats;
import com.game.Entities.Character;
import com.game.Weapon;

public class Enemy extends Character {
    private Weapon weapon;

    public Enemy(Integer hp, Integer maxHp, Float armor, Integer x, Integer y, Integer width, Integer height, Integer speed, Weapon weapon) {
        super(hp, maxHp, armor, x, y, width, height, speed);
        this.weapon = weapon;
    }
    public Enemy(Stats stats, SizeE sizeE, Weapon weapon) {
        super(stats.getHp(), stats.getMaxHp(), stats.getArmor(), sizeE.getX(), sizeE.getY(), sizeE.getWidth(), sizeE.getHeight(), stats.getSpeed());
        this.weapon = weapon;
    }

    @Override
    public Weapon getSelectedWeapon() {
        return weapon;
    }

    @Override
    public void move(int side) {
        if(side == Input.Keys.LEFT){
            this.setX(this.getX()-10);
        }else if(side == Input.Keys.RIGHT){
            this.setX(this.getX()+10);
        }else if(side == Input.Keys.UP){
            this.setY(this.getY()+10);
        }else if(side == Input.Keys.DOWN){
            this.setY(this.getY()-10);
        }
    }
}
