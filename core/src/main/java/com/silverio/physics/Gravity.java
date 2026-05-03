package com.silverio.physics;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class Gravity {
    public static float gravity = 5;

    public static float calc(){
        gravity += Gdx.graphics.getDeltaTime() * 10;
        if(Gdx.input.isKeyJustPressed(Input.Keys.SPACE)) gravity = -3;
        return gravity;
    }
}
