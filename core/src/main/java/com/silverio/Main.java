package com.silverio;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.silverio.pipe.Pipe;
import com.silverio.player.Player;
import com.silverio.utils.DebugInformations;

public class Main extends ApplicationAdapter {
    public Player player;
    public BitmapFont font;
    public SpriteBatch batch;
    public Pipe pipe;
    public DebugInformations debug;

    @Override
    public void create() {
        player = new Player();
        font = new BitmapFont();
        batch = new SpriteBatch();
        pipe = new Pipe();
        debug = new DebugInformations();
        debug.infos.add(() -> "X: " + player.posX);
        debug.infos.add(() -> "Y: " + player.posY);
    }

    @Override
    public void render() {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        pipe.render();
        player.render();
        debug.render();
    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}
