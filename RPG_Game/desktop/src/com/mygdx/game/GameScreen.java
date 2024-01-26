package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;

public class GameScreen implements Screen {
    private World world;
    private GameRenderer renderer;

    public GameScreen(World world) {
        this.world = world;
        this.renderer = new GameRenderer(world);
    }

    @Override
    public void show() {
        loadAssets();
    }

    private void loadAssets() {
        // Carga de recursos (texturas, sonidos, etc.)
        // Ejemplo: world.getAssetManager().load("texture.png", Texture.class);
        // world.getAssetManager().finishLoading();
    }

    @Override
    public void render(float delta) {
        world.update(delta);

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        renderer.render(delta);
    }

    @Override
    public void resize(int width, int height) {
        renderer.resize(width, height);
    }

    @Override
    public void pause() {
        // Lógica cuando el juego se pausa
    }

    @Override
    public void resume() {
        // Lógica cuando el juego se reanuda
    }

    @Override
    public void hide() {
        // Lógica cuando la pantalla se oculta
    }

    @Override
    public void dispose() {
        renderer.dispose();
        unloadAssets();
    }

    private void unloadAssets() {
        // Liberación de recursos (texturas, sonidos, etc.)
        // Ejemplo: world.getAssetManager().unload("texture.png");
    }
}
