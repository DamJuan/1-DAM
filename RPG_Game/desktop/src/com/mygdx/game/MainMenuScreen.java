package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import pl.mkonrad.gdx.GifDecoder;


public class MainMenuScreen extends ScreenAdapter {
    private SpriteBatch batch;
    private Stage stage;
    private Texture gifTexture; // Textura para el gif
    private float gifTimer = 0; // Temporizador para el gif
    private float buttonWidth = 100; // Ajusta el ancho del botón según tus necesidades
    private float buttonHeight = 50; // Ajusta la altura del botón según tus necesidades
    private Skin skin; // Instancia de Skin para los botones

    public MainMenuScreen() {
        batch = new SpriteBatch();
        stage = new Stage();
        Gdx.input.setInputProcessor(stage);

        // Carga de texturas para los botones
        skin = new Skin();
        skin.add("playButton", new Texture("play_button.png"));
        skin.add("exitButton", new Texture("exit_button.png"));

        // Carga de la textura para el gif
        gifTexture = GifDecoder.loadGIF(Gdx.files.internal("fondo_inicio.gif"));

        // Configuración del botón "Jugar"
        ImageButton playButton = createButton("playButton", 50, Gdx.graphics.getHeight() / 2f - buttonHeight / 2f);

        // Configuración del botón "Salir"
        ImageButton exitButton = createButton("exitButton", 170, Gdx.graphics.getHeight() / 2f - buttonHeight / 2f);

        // Agrega los botones al escenario
        stage.addActor(playButton);
        stage.addActor(exitButton);
    }

    private ImageButton createButton(String drawableName, float x, float y) {
        ImageButton button = new ImageButton(skin.getDrawable(drawableName));
        button.setSize(buttonWidth, buttonHeight);
        button.setPosition(x, y);

        button.addListener(new ClickListener() {
            @Override
            public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
                handleButtonClick(drawableName);
            }
        });

        return button;
    }

    private void handleButtonClick(String buttonName) {
        if (buttonName.equals("playButton")) {
            PixelArtGame.getInstance().setScreen(new GameScreen(new World()));
        } else if (buttonName.equals("exitButton")) {
            Gdx.app.exit();
        }
    }

    @Override
    public void show() {
        // Puedes realizar inicializaciones de recursos aquí si es necesario
    }

    @Override
    public void render(float delta) {
        // Actualiza el temporizador para el gif
        gifTimer += delta;

        // Limpia la pantalla y dibuja el fondo
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        // Dibuja el fondo de todo el tamaño de la pantalla
        batch.begin();
        float gifScale = Gdx.graphics.getWidth() / (float) gifTexture.getWidth(); // Escala para ajustar el tamaño del gif
        batch.draw(new TextureRegion(gifTexture), 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.end();

        // Dibuja el escenario con los botones
        batch.begin();
        stage.draw();
        batch.end();

        // Si se presiona Enter, inicia el juego
        if (Gdx.input.isKeyJustPressed(Input.Keys.ENTER)) {
            handleButtonClick("playButton");
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
        gifTexture.dispose(); // Libera la textura del gif
        skin.dispose(); // Libera la instancia de Skin
    }
}
