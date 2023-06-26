package com.game.utils;

import com.game.Game;
import com.game.Screens;

public enum Menus {
    LEARN_8("Poolos espaciales!", Game.class);

    public final String name;
    public final Class<? extends Screens> clazz;

    Menus(String label, Class<? extends Screens> clazz) {
        this.name = label;
        this.clazz = clazz;
    }
}
