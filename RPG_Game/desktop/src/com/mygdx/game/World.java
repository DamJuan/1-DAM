// Clase que representa el mundo del juego
package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;
import java.util.List;

public class World {
    private Player player;
    private List<Scene> scenes;
    private int currentSceneIndex;

    public World() {
        this.scenes = initializeScenes();
        this.currentSceneIndex = 0;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void explore() {
        Scene currentScene = getCurrentScene();
        currentScene.explore(player);
    }

    public void showPlayerStatus() {
        player.displayStatus();
    }

    public void showInventory() {
        player.displayInventory();
    }

    public void showQuests() {
        player.displayQuests();
    }

    public void showMap() {
        System.out.println("Mapa del Mundo:");
        // Implementar la visualización del mapa aquí
    }

    public Scene getCurrentScene() {
        return scenes.get(currentSceneIndex);
    }

    private List<Scene> initializeScenes() {
        List<Scene> scenes = new ArrayList<>();
        scenes.add(new Scene("Ciudad inicial"));
        scenes.add(new Scene("Bosque encantado"));
        scenes.add(new Scene("Cueva oscura"));
        return scenes;
    }

    public void update(float delta) {
        // Implementa la lógica de actualización del mundo con delta aquí
    }

    public void render(SpriteBatch spriteBatch) {
        // Implementa la lógica de renderizado del mundo aquí
        for (Scene scene : scenes) {
            scene.render(spriteBatch);
        }
    }
}
