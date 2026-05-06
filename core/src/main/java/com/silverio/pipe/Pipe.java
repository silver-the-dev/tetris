package com.silverio.pipe;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import java.util.Random;

public class Pipe {
    private static final float screenHeight = Gdx.graphics.getHeight();
    private static final float screenWidth = Gdx.graphics.getWidth();
    private final ShapeRenderer upperPipe = new ShapeRenderer();
    private final ShapeRenderer lowerPipe = new ShapeRenderer();
    private final static int gap = 200;
    private final static float width = 70;
    private final Random rand = new Random(System.currentTimeMillis());
    public final float positionY = rand.nextFloat() * (screenHeight / 2);
    public float positionX = screenWidth /*+ (width * 3)*/ / 2;


    public void render(){
//        move();
        lowerPipe.begin(ShapeRenderer.ShapeType.Filled);
        lowerPipe.setColor(Color.GREEN);
        lowerPipe.rect(positionX, positionY, width, -screenHeight);
        lowerPipe.end();
        upperPipe.begin(ShapeRenderer.ShapeType.Filled);
        upperPipe.setColor(Color.GREEN);
        upperPipe.rect(positionX, positionY + gap, width, screenHeight);
        upperPipe.end();
    }
    public void move(){
        positionX -= Gdx.graphics.getDeltaTime() * 100;
    }
}
