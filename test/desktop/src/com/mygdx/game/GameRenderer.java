package com.mygdx.game;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameRenderer {
    private World world;
    private OrthographicCamera camera;
    private SpriteBatch batch;

    public GameRenderer(World world) {
        this.world = world;
        this.camera = new OrthographicCamera();
        this.camera.setToOrtho(false, 800, 600); // Ajusta según tus necesidades
        this.batch = new SpriteBatch();
    }

    public void render(float delta) {
        // Renderizar el juego aquí (jugador, escenario, encuentros, etc.)
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        // Renderizar elementos del juego usando batch.draw(), etc.
        batch.end();
    }

    public void dispose() {
        batch.dispose();
    }

    public void resize(int width, int height) {
    }
}
