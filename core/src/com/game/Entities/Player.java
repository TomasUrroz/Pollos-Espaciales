package com.game.Entities;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.game.CharacterProperties.SizeE;
import com.game.CharacterProperties.Stats;
import com.game.Entities.CharacterProperties.IAttackPlayer;
import com.game.Entities.CharacterProperties.IGrabbable;
import com.game.Entities.CharacterProperties.Weapon;

import java.util.ArrayList;

public class Player extends Personaje implements IAttackPlayer, IGrabbable {

    private Integer dodges = 2;
    private Integer speed = 2;
    private Integer ammo = 0;
    private ArrayList<Weapon> weapon = new ArrayList<>();
    private Integer selectedWeapon = 0;
    private Boolean god=false;
    static final float WIDTH = .45f;
    static final float HEIGHT = .6f;

    static final float DRAW_WIDTH = 1.3f;
    static final float DRAW_HEIGHT = 1.7f;

    static final Integer WALK_SPEED = 3;
    static final float WALK_FRAME_DURATION = 0.05f;

    Vector2 position;
    Vector2 velocity;


    //3 constructores. 1:Poner to.do de una. 2:Poner to.do pero organizado en las clases stats y sizeE. 3:Uno en el que agregas un arma y listo,
    public Player(Float x, Float y) {
        super(100, 100, 1.0f, x, y, WIDTH, HEIGHT, WALK_SPEED);
        this.dodges = 2;
        this.ammo = 0;
        this.weapon = new ArrayList<>();
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

    public void move(int side) {
        if(side == Keys.LEFT){
            this.setX(this.getX()-this.getSpeed());
        }else if(side == Keys.RIGHT){
            this.setX(this.getX()+this.getSpeed());
        }else if(side == Keys.UP){
            this.setY(this.getY()+this.getSpeed());
        }else if(side == Keys.DOWN){
            this.setY(this.getY()-this.getSpeed());
        }
    }

    public Integer getAmmo() {
        return ammo;
    }

    public void setAmmo(Integer ammo) {
        this.ammo = ammo;
    }

}
