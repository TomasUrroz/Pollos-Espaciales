package com.game.Entities.Enemies;

import com.badlogic.gdx.Input;
import com.game.CharacterProperties.SizeE;
import com.game.CharacterProperties.Stats;
import com.game.Entities.Entity;
import com.game.Weapon;

public class Brute extends Enemy{
    private Entity ammo;

    public Brute(Integer hp, Integer maxHp, Float armor, Integer x, Integer y, Integer width, Integer height, Integer speed, Weapon weapon, Entity ammo) {
        super(hp, maxHp, armor, x, y, width, height, speed, weapon);
        this.ammo = ammo;
    }

    public Brute(Stats stats, SizeE sizeE, Weapon weapon, Entity ammo) {
        super(stats, sizeE, weapon);
        this.ammo = ammo;
    }


    public Entity getAmmo() {
        return ammo;
    }

    public void setAmmo(Entity ammo) {
        this.ammo = ammo;
    }


    public void grab(int direction) {
        //*agarra a alguien
    }

    public void throwEntity(int posX, int posY){
        //*le revolea un mogo*
    }

    public void move(int side) {
        if(side == Input.Keys.LEFT){
            this.setX(this.getX()-3);
        }else if(side == Input.Keys.RIGHT){
            this.setX(this.getX()+3);
        }else if(side == Input.Keys.UP){
            this.setY(this.getY()+3);
        }else if(side == Input.Keys.DOWN){
            this.setY(this.getY()-3);
        }
    }

}
