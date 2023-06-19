package com.game.Entities;


import com.game.CharacterProperties.SizeE;
import com.game.CharacterProperties.Stats;

public abstract class Entity {
    private Integer hp;
    private Integer maxHp;
    private Float armor;

    private Integer x;
    private Integer y;
    private Integer width;
    private Integer height;


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

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Entity(Integer hp, Integer maxHp, Float armor, Integer x, Integer y, Integer width, Integer height) {
        this.hp = hp;
        this.maxHp = maxHp;
        this.armor = armor;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public Entity(Stats stats, SizeE sizeE) {
        this.hp = stats.getHp();
        this.maxHp = stats.getMaxHp();
        this.armor = stats.getArmor();
        this.x = sizeE.getX();
        this.y = sizeE.getY();
        this.width = sizeE.getWidth();
        this.height = sizeE.getHeight();
    }

}
