// Clase principal del juego
package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class PixelArtGame extends Game {
    private static PixelArtGame instance;

    private OrthographicCamera camera;
    private SpriteBatch batch;
    private World world;

    // Método estático para obtener la instancia del juego
    public static PixelArtGame getInstance() {
        return instance;
    }

    @Override
    public void create() {
        // Configuración inicial del juego
        instance = this;
        setScreen(new MainMenuScreen());
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 600);
        batch = new SpriteBatch();
        world = new World();
        Player player = createPlayer();
        world.setPlayer(player);
    }

    private Player createPlayer() {
        // Crea un jugador con la clase Warrior (puedes ajustar esto según tus necesidades)
        return new Player("Jugador", new Warrior());
    }

    @Override
    public void render() {
        // Limpia la pantalla y renderiza la pantalla actual
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        super.render(); // Esto manejará la lógica de cambio de pantalla y llamará al método render de la pantalla actual
    }

    @Override
    public void dispose() {
        // Libera recursos al cerrar el juego
        batch.dispose();
    }
}
