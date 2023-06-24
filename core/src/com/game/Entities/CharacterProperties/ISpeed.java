package com.game.Entities.CharacterProperties;

import com.badlogic.gdx.physics.box2d.Body;

public interface ISpeed {
    Float getSpeed();
    void setSpeed(Float speed);
    void update(Body body, Float delta, Float accelX, Float accelY, String action);
}
