package com.game.Entities;


import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.game.CharacterProperties.SizeE;
import com.game.CharacterProperties.Stats;

public abstract class Entity {
    private Integer hp;
    private Integer maxHp;
    private Float armor;

    Vector2 position;
    Vector2 velocity;
    private Float width;
    private Float height;


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

    public Float getX() {
        return position.x;
    }

    public void setX(Float x) {
        this.position.x = x;
    }

    public Float getY() {
        return position.y;
    }

    public void setY(Float y) {
        this.position.y = y;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Entity(Integer hp, Integer maxHp, Float armor, Float x, Float y, Float width, Float height) {
        this.hp = hp;
        this.maxHp = maxHp;
        this.armor = armor;
        position = new Vector2(x, y);
        this.width = width;
        this.height = height;
    }

/*
    public Entity(Stats stats, SizeE sizeE) {
        this.hp = stats.getHp();
        this.maxHp = stats.getMaxHp();
        this.armor = stats.getArmor();
        this.x = sizeE.getX();
        this.y = sizeE.getY();
        this.width = sizeE.getWidth();
        this.height = sizeE.getHeight();
    }
*/

}
