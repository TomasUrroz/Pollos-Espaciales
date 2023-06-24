package com.game.Entities;

import com.badlogic.gdx.math.Vector2;

public abstract class Entity {
    private Integer hp;
    private Integer maxHp;
    private Float armor;
    Vector2 position = new Vector2();
    Vector2 velocity = new Vector2();
    private Float width ;
    private Float height;
    private Float draw_width;
    private Float draw_height ;


    public Entity(Integer hp, Integer maxHp, Float armor, Float x, Float y, Float width, Float height, Float draw_width, Float draw_height) {
        this.hp = hp;
        this.maxHp = maxHp;
        this.armor = armor;
        this.position.x = x;
        this.position.y = y;
        this.width = width;
        this.height = height;
        this.draw_width = draw_width;
        this.draw_height = draw_height;
    }

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


    public Vector2 getVelocity() {
        return velocity;
    }

    public void setVelocity(Vector2 velocity) {
        this.velocity = velocity;
    }

    public Float getVelocityX() {
        return velocity.x;
    }

    public void setVelocity(Float velocityX) {
        this.velocity.x = velocityX;
    }
    public Float getVelocityY() {
        return velocity.x;
    }

    public void setVelocityY(Float velocityY) {
        this.velocity.y = velocityY;
    }

    public void setMaxHp(Integer maxHp) {
        this.maxHp = maxHp;
    }

    public Vector2 getPosition() {
        return position;
    }

    public Float setPositoinX() {
        return position.x;
    }
    public void gettPositoinX(Float posX) {
        position.x = posX;
    }
    public Float setPositoinY() {
        return position.y;
    }
    public void gettPositoinY(Float posY) {
        position.y = posY;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
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

    public Float getDraw_width() {
        return draw_width;
    }

    public void setDraw_width(Float draw_width) {
        this.draw_width = draw_width;
    }

    public Float getDraw_height() {
        return draw_height;
    }

    public void setDraw_height(Float draw_height) {
        this.draw_height = draw_height;
    }


}
