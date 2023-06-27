package com.game;

import com.badlogic.gdx.*;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.game.utils.State;


public abstract class Screens extends InputAdapter implements Screen {
    public static final float SCREEN_WIDTH = 800;
    public static final float SCREEN_HEIGHT = 480;
    private State state = State.RUN;
    public static final float WORLD_WIDTH = 8f;
    public static final float WORLD_HEIGHT = 4.8f;

    public MainGame game;

    public OrthographicCamera oCamUI;
    public OrthographicCamera oCamBox2D;
    public SpriteBatch spriteBatch;
    public Stage stage;

    public Screens(MainGame game) {
        this.game = game;

        // We will add UI elements to the stage
        stage = new Stage(new StretchViewport(Screens.SCREEN_WIDTH, Screens.SCREEN_HEIGHT));

        // Create the UI Camera and center it on the screen
        oCamUI = new OrthographicCamera(SCREEN_WIDTH, SCREEN_HEIGHT);
        oCamUI.position.set(SCREEN_WIDTH / 2f, SCREEN_HEIGHT / 2f, 0);

        // Create the Game Camera and center it on the screen
        oCamBox2D = new OrthographicCamera(WORLD_WIDTH, WORLD_HEIGHT);
        oCamBox2D.position.set(WORLD_WIDTH / 2f, WORLD_HEIGHT / 2f, 0);

        // We need it to tell the InputAdapter and stage when we receive events
        InputMultiplexer input = new InputMultiplexer(this, stage);
        Gdx.input.setInputProcessor(input);

        spriteBatch = new SpriteBatch();
    }

    public void setGameState(State s){
        this.state = s;
    }
    public State getGameState(){
        return this.state;
    }
    @Override
    public void render(float delta) {
        switch (state)
        {
            case RUN:
                update(delta);

                stage.act(delta);

                if(this.state != State.PAUSE){
                    draw(delta);
                }

                stage.draw();

                break;
            case PAUSE:
                Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
                if(Gdx.input.isKeyJustPressed(Input.Keys.ESCAPE) && getGameState() == State.PAUSE)
                    resume();
                break;
            case RESUME:

                break;

            default:
                break;
        }
    }

    public abstract void draw(float delta);

    public abstract void update(float delta);

    @Override
    public void resize(int width, int height) {
        // If the screen size change we adjust the stage
        stage.getViewport().update(width, height, true);
    }

    @Override
    public void show() {
    }

    @Override
    public void hide() {

    }

    @Override
    public void pause() {
        this.state = State.PAUSE;
    }

    @Override
    public void resume() {
        this.state = State.RUN;
    }

    @Override
    public void dispose() {
    }


}
