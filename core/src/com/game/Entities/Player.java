package com.game.Entities;

import com.badlogic.gdx.Input;
import com.game.CharacterProperties.SizeE;
import com.game.CharacterProperties.Stats;
import com.game.Weapon;
import com.game.CharacterProperties.IAttackPlayer;
import com.game.CharacterProperties.IGrabbable;

import java.security.Key;
import java.util.ArrayList;
import com.badlogic.gdx.Input.Keys;
public class Player extends Character implements IAttackPlayer, IGrabbable {

    private Integer dodges = 2;
    private Integer ammo = 0;
    private ArrayList<Weapon> weapon;
    private Integer selectedWeapon = 0;
    private Boolean god=false;


    //3 constructores. 1:Poner todo de una. 2:Poner todo pero organizado en las clases stats y sizeE. 3:Uno en el que agregas un arma y listo,
    public Player(Integer hp, Integer maxHp, Float armor, Integer x, Integer y, Integer width, Integer height, Integer speed, Integer dodges, Integer ammo, ArrayList<Weapon> weapon, Integer selectedWeapon, Boolean god) {
        super(hp, maxHp, armor, x, y, width, height, speed);
        this.dodges = dodges;
        this.ammo = ammo;
        this.weapon = weapon;
        this.selectedWeapon = selectedWeapon;
        this.god = god;
    }
    public Player(Stats stats, SizeE sizeE, Integer dodges, Integer ammo, ArrayList<Weapon> weapon, Integer selectedWeapon, Boolean god) {
        super(stats.getHp(), stats.getMaxHp(), stats.getArmor(), sizeE.getX(), sizeE.getY(), sizeE.getWidth(), sizeE.getHeight(), stats.getSpeed());;
        this.dodges = dodges;
        this.ammo = ammo;
        this.weapon = weapon;
        this.selectedWeapon = selectedWeapon;
        this.god = god;
    }
    public Player(Stats stats, SizeE sizeE, Integer dodges, Integer ammo, Weapon weapon, Boolean god) {
        super(stats.getHp(), stats.getMaxHp(), stats.getArmor(), sizeE.getX(), sizeE.getY(), sizeE.getWidth(), sizeE.getHeight(), stats.getSpeed());;
        this.dodges = dodges;
        this.ammo = ammo;
        this.weapon.add(weapon);
        this.god = god;
    }


    //DODGE STUFF
    public Integer getDodges() {
        return dodges;
    }

    public Boolean getGod() {
        return god;
    }

    public void setGod(Boolean god) {
        this.god = god;
    }

    public void dodge(int direction){
        //FOR A SHORT PERIOD OF TIME INVULNERAVILITY WHILE ROLLING
    }



    //WEAPON STUFF
    @Override
    public void addWeapon(Weapon weapon) {
        this.weapon.add(weapon);
    }

    @Override
    public Weapon getSelectedWeapon() {
        return weapon.get(selectedWeapon);
    }
    @Override
    public void switchWeapon() {
        if(weapon.size()<selectedWeapon)
        {
            selectedWeapon++;
        } else selectedWeapon =0;
    }

    @Override
    public void move(int side) {
        if(side == Keys.LEFT){
            this.setX(this.getX()-10);
        }else if(side == Keys.RIGHT){
            this.setX(this.getX()+10);
        }else if(side == Keys.UP){
            this.setY(this.getY()+10);
        }else if(side == Keys.DOWN){
            this.setY(this.getY()-10);
        }
    }

    public Integer getAmmo() {
        return ammo;
    }

    public void setAmmo(Integer ammo) {
        this.ammo = ammo;
    }

}
