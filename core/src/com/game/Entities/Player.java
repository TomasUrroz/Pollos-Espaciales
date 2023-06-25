package com.game.Entities;

public class Player extends Personaje {

    private static Integer count = 0;
    private Integer id;
    private Integer ammo = 10;


    public Player(Float x, Float y) {
        super(100, 100, 1.0f, x, y, 0.38f, 0.47f, 1f, 1.38f, 50f);
        this.id = this.count;
        ++this.count;
    }


    //WEAPON STUFF


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAmmo() {
        return ammo;
    }

    public void setAmmo(Integer ammo) {
        this.ammo = ammo;
    }


}
