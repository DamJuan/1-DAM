// Clase que representa una escena en el juego
package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    private String name;
    private List<Encounter> encounters;

    public Scene(String name) {
        this.name = name;
        this.encounters = new ArrayList<>();
        // Agrega los encuentros según sea necesario
    }

    public void explore(Player player) {
        // Implementa la lógica de exploración de la escena aquí
    }

    public void render(SpriteBatch spriteBatch) {
        // Implementa la lógica de renderizado de la escena aquí
        for (Encounter encounter : encounters) {
            encounter.render(spriteBatch);
        }
    }

    public List<Encounter> getEncounters() {
        return encounters;
    }

    public String getName() {
        return name;
    }
}
