package com.silverio.player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.silverio.physics.Gravity;

import static com.badlogic.gdx.graphics.Color.BLUE;

public class Player  {
    private static ShapeRenderer sprite = new ShapeRenderer();;
    private static final int VELOCITY = 10;
    public float posX;
    public float posY;

    public void init(){
        posX = 100;
        posY = 100;
    }

    public void render(){
        move();
        sprite.begin(ShapeRenderer.ShapeType.Filled);
        sprite.setColor(BLUE);
        sprite.rect(posX, posY, 50, 50);
        sprite.end();
    }

    public void move(){
        posX += ((Gdx.input.isKeyPressed(Input.Keys.D) ? 1 : 0) - (Gdx.input.isKeyPressed(Input.Keys.A) ? 1 : 0)) * VELOCITY;
        posY -= Gravity.calc(Gdx.input.isKeyJustPressed(Input.Keys.SPACE));
    }
}
