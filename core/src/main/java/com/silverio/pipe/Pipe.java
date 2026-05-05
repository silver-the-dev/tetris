package com.silverio.pipe;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.Pool;

public class Pipe {
    private static final float screenHeight = Gdx.graphics.getHeight();
    private static final float screenWidth = Gdx.graphics.getWidth();
    private final ShapeRenderer sprite = new ShapeRenderer();
    private final static int gap = 100;
    private final static float width = 70;
    private final static float height = screenHeight / 2;
    private float positionX = screenWidth;
    private float positionY;


    public void render(){
        move();
        sprite.begin(ShapeRenderer.ShapeType.Filled);
        sprite.setColor(Color.GREEN);
        sprite.rect(positionX, screenHeight, width, -height+gap);
        sprite.rect(positionX, 0, width, height-gap);
        sprite.end();
    }
    public void move(){
        positionX -= Gdx.graphics.getDeltaTime() * 100;
    }
}
