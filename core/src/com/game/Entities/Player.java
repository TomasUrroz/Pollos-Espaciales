package com.game.Entities;

import com.game.Weapon;
import com.game.CharacterProperties.IAttackPlayer;
import com.game.CharacterProperties.IGrabbable;

import java.util.ArrayList;

public class Player extends Character implements IAttackPlayer, IGrabbable {

    private Integer dodges = 2;
    private Integer ammo = 0;
    private ArrayList<Weapon> weapon;
    private Integer selectedWeapon = 0;
    private Boolean god=false;

    public Player(Integer hp, Integer maxHp, Float armor, Integer speed, ArrayList<Weapon> weapon) {
        super(hp, maxHp, armor, speed);
        this.weapon = weapon;
    }
    public Player(Integer hp, Integer maxHp, Float armor, Integer speed, Weapon weapon) {
        super(hp, maxHp, armor, speed);
        this.weapon.add(weapon);
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
    public Integer getAmmo() {
        return ammo;
    }

    public void setAmmo(Integer ammo) {
        this.ammo = ammo;
    }

}
