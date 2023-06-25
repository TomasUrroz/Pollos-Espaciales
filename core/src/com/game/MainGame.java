package com.game;

import com.badlogic.gdx.Game;

public class MainGame extends Game {

    @Override
    public void create() {
        AssetsGame.loadFonts();
        setScreen(new MainMenuScreen(this));
    }
}
