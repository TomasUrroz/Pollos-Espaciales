package com.game.Entities;

import com.game.Entities.CharacterProperties.*;

import java.util.ArrayList;

public class Player extends Personaje implements IAttackPlayer, IGrabbable {

    private Integer dodges = 2;
    private Integer ammo = 0;
    private ArrayList<Weapon> weapon = new ArrayList<>();
    private Integer selectedWeapon = 0;
    private Boolean god=false;

    public Player(Float x, Float y) {
        super(100, 100, 1.0f, x, y, .45f, .6f, 1.3f,1.7f,0.05f,0.05f,0.05f,0.05f,0.05f,0.05f,0.05f,0.05f);
        this.dodges = 2;
        this.ammo = 0;
        this.weapon = new ArrayList<>();
        this.selectedWeapon = 0;
        this.god = false;
    }
    public Player(Float x, Float y, Weapon weapon) {
        super(100, 100, 1.0f, x, y, .45f, .6f, 1.3f,1.7f,0.05f,0.05f,0.05f,0.05f,0.05f,0.05f,0.05f,0.05f);
        this.dodges = 2;
        this.ammo = 0;
        this.weapon.add(weapon);
        this.selectedWeapon = 0;
        this.god = false;
    }

    public Player(Integer hp, Integer maxHp, Float armor, Float x, Float y, Float width, Float height, Float draw_width, Float draw_height, Float iddle_frame_duration, Float run_frame_duration, Float walk_frame_duration, Float attk1_frame_duration, Float attk2_frame_duration, Float attk3_frame_duration, Float death_frame_duration, Float hurt_frame_duration, Integer dodges, Integer ammo, ArrayList<Weapon> weapon, Integer selectedWeapon, Boolean god) {
        super(hp, maxHp, armor, x, y, width, height, draw_width, draw_height, iddle_frame_duration, run_frame_duration, walk_frame_duration, attk1_frame_duration, attk2_frame_duration, attk3_frame_duration, death_frame_duration, hurt_frame_duration);
        this.dodges = dodges;
        this.ammo = ammo;
        this.weapon = weapon;
        this.selectedWeapon = selectedWeapon;
        this.god = god;
    }
    public Player(Stats stats, SizeE sizeE, CharacterAnimations chrAn, ArrayList<Weapon> weapon) {
        super(stats,sizeE,chrAn);
        this.dodges = 2;
        this.ammo = 0;
        this.weapon = weapon;
        this.selectedWeapon = 0;
        this.god = false;
    }



/*
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
*/



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
        return this.weapon.get(selectedWeapon);
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
