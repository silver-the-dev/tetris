package com.silverio.utils;

import com.badlogic.gdx.Gdx;

public class ScreenUtils {
    private static float screenHeight = Gdx.graphics.getHeight();
    private static float screenWidth = Gdx.graphics.getWidth();

    public static float getScreenHeight() {
        return screenHeight;
    }

    public static float getScreenWidth() {
        return screenWidth;
    }
}
