package com.silverio;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;
import com.silverio.physics.Gravity;

import static com.badlogic.gdx.graphics.Color.BLUE;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
    private ShapeRenderer shapeRend;
    private final int VELOCITY = 10;
    private float posX;
    private float posY;

    @Override
    public void create() {
        shapeRend = new ShapeRenderer();
        posX = 0;
        posY = 200;
    }

    @Override
    public void render() {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        posX += ((Gdx.input.isKeyPressed(Input.Keys.D) ? 1 : 0) - (Gdx.input.isKeyPressed(Input.Keys.A) ? 1 : 0)) * VELOCITY;
        posY -= Gravity.calc();
        shapeRend.begin(ShapeRenderer.ShapeType.Filled);
        shapeRend.setColor(BLUE);
        shapeRend.rect(posX, posY, 100, 100);
        shapeRend.end();
    }

    @Override
    public void dispose() {
        shapeRend.dispose();
    }
}
