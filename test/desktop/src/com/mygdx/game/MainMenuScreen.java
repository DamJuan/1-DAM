package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class MainMenuScreen implements Screen {
    private SpriteBatch batch;
    private Stage stage;

    public MainMenuScreen() {
        batch = new SpriteBatch();
        stage = new Stage();

        Gdx.input.setInputProcessor(stage);

        // Carga de texturas para los botones
        Skin skin = new Skin();
        skin.add("playButton", new Texture("play_button.png"));
        skin.add("exitButton", new Texture("exit_button.png"));

        // Configuración del botón "Jugar"
        ImageButton playButton = new ImageButton(skin.getDrawable("playButton"));
        playButton.setPosition(Gdx.graphics.getWidth() / 2f - playButton.getWidth() / 2f, Gdx.graphics.getHeight() / 2f);
        playButton.addListener(new ClickListener() {
            @Override
            public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
                // Inicia el juego al hacer clic en el botón "Jugar"
                PixelArtGame.getInstance().setScreen(new GameScreen(new World()));
            }
        });

        // Configuración del botón "Salir"
        ImageButton exitButton = new ImageButton(skin.getDrawable("exitButton"));
        exitButton.setPosition(Gdx.graphics.getWidth() / 2f - exitButton.getWidth() / 2f, Gdx.graphics.getHeight() / 2f - 100);
        exitButton.addListener(new ClickListener() {
            @Override
            public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
                // Cierra la aplicación al hacer clic en el botón "Salir"
                Gdx.app.exit();
            }
        });

        // Agrega los botones al escenario
        stage.addActor(playButton);
        stage.addActor(exitButton);
    }

    @Override
    public void show() {
        // Puedes realizar inicializaciones de recursos aquí si es necesario
    }

    @Override
    public void render(float delta) {
        // Limpia la pantalla y dibuja el escenario
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        stage.draw();
        batch.end();

        // Si se presiona Enter, inicia el juego
        if (Gdx.input.isKeyJustPressed(Input.Keys.ENTER)) {
            PixelArtGame.getInstance().setScreen(new GameScreen(new World()));
        }
    }

    @Override
    public void resize(int width, int height) {
        // Puedes manejar el cambio de tamaño de pantalla aquí si es necesario
    }

    @Override
    public void pause() {
        // Puedes implementar la lógica cuando el juego se pausa (opcional)
    }

    @Override
    public void resume() {
        // Puedes implementar la lógica cuando el juego se reanuda (opcional)
    }

    @Override
    public void hide() {
        // Puedes implementar la lógica cuando la pantalla se oculta
    }

    @Override
    public void dispose() {
        // Libera los recursos aquí
        batch.dispose();
        stage.dispose();
    }
}
