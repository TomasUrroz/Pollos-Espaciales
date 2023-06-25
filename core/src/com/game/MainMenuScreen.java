package com.game;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.game.utils.Menus;


public class MainMenuScreen extends Screens {

    ScrollPane scroll;

    public MainMenuScreen(MainGame game) {
        super(game);

        Table menu = new Table();
        menu.defaults().expandY().fillY();

        for (final Menus menus : Menus.values()) {
            TextButton bt = new TextButton(menus.name, AssetsGame.txButtonStyle);
            bt.addListener(new ClickListener() {
                @Override
                public void clicked(InputEvent event, float x, float y) {
                    setScreen(menus);
                }
            });

            menu.row().padTop(15).height(50);
            menu.add(bt).fillX();
        }
        scroll = new ScrollPane(menu, AssetsGame.scrollPaneStyle);
        scroll.setSize(500, SCREEN_HEIGHT);
        scroll.setPosition(150, 0);
        stage.addActor(scroll);
    }

    private void setScreen(Menus menus) {
        try {
            Screens newScreen = menus.clazz.getConstructor(MainGame.class).newInstance(game);
            game.setScreen(newScreen);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(float delta) {
    }

    @Override
    public void update(float delta) {
    }

}
