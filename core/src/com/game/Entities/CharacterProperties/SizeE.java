package com.game.Entities.CharacterProperties;

public class SizeE {
    private Float x;
    private Float y;
    private Float width;
    private Float height;
    private Float drawWidth;
    private Float drawHeight;

    public SizeE(Float x, Float y, Float width, Float height, Float drawWidth, Float drawHeight) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.drawWidth = drawWidth;
        this.drawHeight = drawHeight;
    }

    public Float getX() {
        return x;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public Float getY() {
        return y;
    }

    public void setY(Float y) {
        this.y = y;
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

    public Float getDrawWidth() {
        return drawWidth;
    }

    public void setDrawWidth(Float drawWidth) {
        this.drawWidth = drawWidth;
    }

    public Float getDrawHeight() {
        return drawHeight;
    }

    public void setDrawHeight(Float drawHeight) {
        this.drawHeight = drawHeight;
    }
}
