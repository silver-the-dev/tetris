package com.silverio.physics;

import com.badlogic.gdx.Gdx;

public class Gravity {
    public static float gravity = 5;

    public static float calc(boolean jump){
        gravity += Gdx.graphics.getDeltaTime() * 10;
        if(jump) gravity = -3;
        return gravity;
    }
}
