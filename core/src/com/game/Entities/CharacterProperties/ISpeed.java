package com.game.Entities.CharacterProperties;

public interface ISpeed {
    Integer getSpeed();
    void setSpeed(Integer newSpeed);
    void move(int side);
}
