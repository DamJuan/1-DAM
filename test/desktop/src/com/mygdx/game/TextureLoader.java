package com.mygdx.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class TextureLoader {

    public static Texture createTexture(Color color) {
        Pixmap pixmap = createPixmap(color);
        Texture texture = new Texture(new TextureData() {
            @Override
            public TextureDataType getType() {
                return TextureDataType.Pixmap;
            }

            @Override
            public boolean isPrepared() {
                return false;
            }

            @Override
            public void prepare() {

            }

            @Override
            public Pixmap consumePixmap() {
                return pixmap;
            }

            @Override
            public boolean disposePixmap() {
                pixmap.dispose();
                return true;
            }

            @Override
            public void consumeCustomData(int target) {

            }

            @Override
            public int getWidth() {
                return pixmap.getWidth();
            }

            @Override
            public int getHeight() {
                return pixmap.getHeight();
            }

            @Override
            public Pixmap.Format getFormat() {
                return pixmap.getFormat();
            }

            @Override
            public boolean useMipMaps() {
                return false;
            }

            @Override
            public boolean isManaged() {
                return true;
            }

        });

        return texture;
    }

    private static Pixmap createPixmap(Color color) {
        Pixmap pixmap = new Pixmap(1, 1, Pixmap.Format.RGBA8888);
        pixmap.setColor(color);
        pixmap.fill();
        return pixmap;
    }
}
