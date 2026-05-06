package com.silverio.utils;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class DebugInformations {
    public List<Supplier<String>> infos = new ArrayList<>();
    public SpriteBatch batch = new SpriteBatch();
    public BitmapFont font = new BitmapFont();
    public float lastY;

    public void render(){
        lastY = ScreenUtils.getScreenHeight()-20;

        batch.begin();
        for (Supplier<String> info : infos){
            font.draw(batch, info.get(), 100, lastY - 100);
            lastY += 20;
        }
        batch.end();
    }


}
