package com.game.Entities;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;

public class Egg {

    final int STATE_NORMAL = 0;
    final int STATE_HIT = 1;
    final int STATE_REMOVE = 2;
    public Float angle;
    private Float width;
    private Float height;
    private Float draw_width;
    private Float draw_height;
    private int state;

    private float stateTime = 0;
    private float angleDeg;
    private Vector2 position;

    public Egg(float x, float y) {
        position = new Vector2(x, y);
        this.width = 0.03f;
        this.height = 0.03f;
        this.draw_width = 0.3f;
        this.draw_height = 0.3f;
        this.angleDeg = 0;
        state = STATE_NORMAL;
    }


    public void update(Body body) {
        position.x = body.getPosition().x;
        position.y = body.getPosition().y;
        angleDeg = (float) Math.toDegrees(body.getAngle());
    }


    public void hit() {
        state = STATE_HIT;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public float getAngleDeg() {
        return angleDeg;
    }

    public void setAngleDeg(float angleDeg) {
        this.angleDeg = angleDeg;
    }

    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public Float getX() {
        return position.x;
    }

    public Float getY() {
        return position.y;
    }

    public int getSTATE_NORMAL() {
        return STATE_NORMAL;
    }

    public int getSTATE_HIT() {
        return STATE_HIT;
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

    public int getSTATE_REMOVE() {
        return STATE_REMOVE;
    }

    public float getStateTime() {
        return stateTime;
    }

    public void setStateTime(float stateTime) {
        this.stateTime = stateTime;
    }
}
