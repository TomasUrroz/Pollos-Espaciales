package com.game.Entities.Enemies;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.physics.box2d.World;
import com.game.CharacterProperties.SizeE;
import com.game.CharacterProperties.Stats;
import com.game.Entities.Personaje;
import com.game.Entities.CharacterProperties.Weapon;
import com.game.Entities.Personaje;

public class Enemy extends Personaje {
    private Weapon weapon;

    public Enemy(World world, long addr,  Integer hp, Integer maxHp, Float armor, Integer x, Integer y, Integer width, Integer height, Integer speed, Weapon weapon) {
        super(world,addr, hp, maxHp, armor, x, y, width, height, speed);
        this.weapon = weapon;
    }
    public Enemy(World world, long addr,Stats stats, SizeE sizeE, Weapon weapon) {
        super(world,addr,stats.getHp(), stats.getMaxHp(), stats.getArmor(), sizeE.getX(), sizeE.getY(), sizeE.getWidth(), sizeE.getHeight(), stats.getSpeed());
        this.weapon = weapon;
    }

    @Override
    public Weapon getSelectedWeapon() {
        return this.weapon;
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
