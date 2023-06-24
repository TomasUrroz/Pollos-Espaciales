package com.game.utils;

import com.badlogic.gdx.Game;
import com.game.tutoriales.learn8.Learn8;
import com.game.Screens;
import com.game.Screens;

public enum Learn {
    LEARN_8("The world, bodies, figures and fixtures", Learn8.class);

    public final String name;
    public final Class<? extends Screens> clazz;

    Learn(String label, Class<? extends Screens> clazz) {
        this.name = label;
        this.clazz = clazz;
    }
}
