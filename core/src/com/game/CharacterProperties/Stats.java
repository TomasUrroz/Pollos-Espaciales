package com.game.CharacterProperties;

public class Stats {
    private Integer hp;
    private Integer maxHp;
    private Float armor;
    private Integer speed;

    public Stats(Integer hp, Integer maxHp, Float armor, Integer speed) {
        this.hp = hp;
        this.maxHp = maxHp;
        this.armor = armor;
        this.speed = speed;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(Integer maxHp) {
        this.maxHp = maxHp;
    }

    public Float getArmor() {
        return armor;
    }

    public void setArmor(Float armor) {
        this.armor = armor;
    }
}
