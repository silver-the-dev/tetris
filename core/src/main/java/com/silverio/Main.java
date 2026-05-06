package com.silverio;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.silverio.pipe.Pipe;
import com.silverio.player.Player;

public class Main extends ApplicationAdapter {
    public BitmapFont font;
    public SpriteBatch batch;
    public Pipe pipe;

    @Override
    public void create() {
        font = new BitmapFont();
        batch = new SpriteBatch();
        pipe = new Pipe();
        System.out.println(pipe.positionY);
    }

    @Override
    public void render() {
        batch.begin();
        font.draw(batch, "X: " + Player.posX, 100, 100);
        batch.end();
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        pipe.render();
        Player.render();
    }

    @Override
    public void dispose() {

    }
}
