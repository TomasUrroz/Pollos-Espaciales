package com.game.Entities;


public abstract class Entity {
    private Integer hp;
    private Integer maxHp;
    private Float armor;


    public Integer getHp() {
        return hp;
    }
    public Integer getMaxHp() {
        return maxHp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Float getArmor() {
        return armor;
    }

    public void setArmor(Float armor) {
        this.armor = armor;
    }

    public Entity(Integer hp,Integer maxHp, Float armor) {
        this.hp = hp;
        this.armor = armor;
        this.maxHp = maxHp;
    }
}
