// Clase que representa un encuentro en el juego
package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Encounter {
    private String name;
    private Texture texture;
    private float x, y, width, height;

    public Encounter(String name, Texture texture, float x, float y, float width, float height) {
        this.name = name;
        this.texture = texture;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void render(SpriteBatch spriteBatch) {
        spriteBatch.draw(texture, x, y, width, height);
    }
}
