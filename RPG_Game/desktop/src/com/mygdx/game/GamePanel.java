package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

public class GamePanel {

    private World world;
    private BitmapFont font;

    public GamePanel(World world) {
        this.world = world;
        this.font = new BitmapFont();
    }

    public void render(SpriteBatch batch) {
        int scale = 4;

        batch.begin();
        batch.setColor(Color.BLACK);
        batch.draw(TextureLoader.createTexture(Color.BLACK), 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

        Player player = world.getPlayer();
        batch.setColor(Color.BLUE);
        int playerSize = 30;
        batch.draw(TextureLoader.createTexture(Color.BLUE), player.getX() * scale, player.getY() * scale, playerSize * scale, playerSize * scale);

        batch.setColor(Color.WHITE);
        font.draw(batch, "Nombre: " + player.getName(), 10, 20);
        font.draw(batch, "Clase: " + player.getPlayerClass().getClassName(), 10, 40);
        font.draw(batch, "Salud: " + player.getPlayerClass().getBaseHealth(), 10, 60);

        Scene currentScene = world.getCurrentScene();
        batch.setColor(Color.GREEN);
        batch.draw(TextureLoader.createTexture(Color.GREEN), 200 * scale, 200 * scale, 400 * scale, 300 * scale);

        for (int i = 0; i < currentScene.getEncounters().size(); i++) {
            Encounter encounter = currentScene.getEncounters().get(i);
            int x = 250 + i * 150;
            int y = 250;
            batch.setColor(Color.RED);
            batch.draw(TextureLoader.createTexture(Color.RED), x * scale, y * scale, 100 * scale, 100 * scale);
            batch.setColor(Color.WHITE);
            font.draw(batch, encounter.getName(), x * scale + 10, y * scale + 20);
        }

        batch.end();
    }
}
