package com.silverio;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.utils.Pool;
import com.badlogic.gdx.utils.ScreenUtils;
import com.silverio.pipe.Pipe;
import com.silverio.player.Player;

public class Main extends ApplicationAdapter {
    Pipe pipe;
    @Override
    public void create() {
        pipe = new Pipe();
    }

    @Override
    public void render() {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        pipe.render();
        Player.render();
    }

    @Override
    public void dispose() {

    }
}
