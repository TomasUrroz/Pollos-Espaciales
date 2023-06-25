package com.game.Entities;

import com.game.Entities.CharacterProperties.*;

import java.util.ArrayList;

public class Player extends Personaje implements IAttackPlayer, IGrabbable {

    private  Integer id;
    private static Integer count =0;
    private Integer dodges = 2;
    private Integer ammo = 10;
    private ArrayList<Weapon> weapon = new ArrayList<>();
    private Integer selectedWeapon = 0;
    private Boolean god=false;


    public Player(Float x, Float y) {
        super(100, 100, 1.0f, x, y, 0.38f, 0.47f, 1f,1.38f,20f);
        this.id = this.count;
        ++this.count;
        this.dodges = 2;
        this.weapon = new ArrayList<>();
        this.selectedWeapon = 0;
        this.god = false;
    }
    public Player(Float x, Float y, Weapon weapon) {
        super(100, 100, 1.0f, x, y, .45f, .25f, 1.3f,1.7f,10f);
        this.dodges = 2;
        this.weapon.add(weapon);
        this.selectedWeapon = 0;
        this.god = false;
    }

    public Player(Integer hp, Integer maxHp, Float armor, Float x, Float y, Float width, Float height, Float draw_width, Float draw_height, Integer dodges, Integer ammo, ArrayList<Weapon> weapon, Integer selectedWeapon, Boolean god, Float speed) {
        super(hp, maxHp, armor, x, y, width, height, draw_width, draw_height,speed);
        this.dodges = dodges;
        this.ammo = ammo;
        this.weapon = weapon;
        this.selectedWeapon = selectedWeapon;
        this.god = god;
    }
    public Player(Stats stats, SizeE sizeE, ArrayList<Weapon> weapon) {
        super(stats,sizeE);
        this.dodges = 2;
        this.weapon = weapon;
        this.selectedWeapon = 0;
        this.god = false;
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
        return this.weapon.get(selectedWeapon);
    }

    @Override
    public void switchWeapon() {
        if(weapon.size()<selectedWeapon)
        {
            selectedWeapon++;
        } else selectedWeapon =0;
    }

    public  Integer getId() {
        return id;
    }

    public  void setId(Integer id) {
        this.id = id;
    }

    public Integer getAmmo() {
        return ammo;
    }

    public void setAmmo(Integer ammo) {
        this.ammo = ammo;
    }



}
