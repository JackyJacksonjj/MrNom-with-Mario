package com.game.project.gameproject.interfaces;

import android.view.View;

import com.game.project.gameproject.interfaces.Input;

import java.util.List;

/**
 * Created by fruitware on 12/17/15.
 */
public interface TouchHandler extends View.OnTouchListener {
    public boolean isTouchDown(int pointer);
    public int getTouchX(int pointer);
    public int getTouchY(int pointer);
    public List<Input.TouchEvent> getTouchEvents();
}
