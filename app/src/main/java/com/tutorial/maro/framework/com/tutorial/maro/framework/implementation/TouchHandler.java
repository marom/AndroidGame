package com.tutorial.maro.framework.com.tutorial.maro.framework.implementation;

import android.view.View;

import com.tutorial.maro.framework.Input;

import java.util.List;

/**
 * Created by maro on 7/23/15.
 */
public interface TouchHandler extends View.OnTouchListener {
    public boolean isTouchDown(int pointer);

    public int getTouchX(int pointer);

    public int getTouchY(int pointer);

    public List<Input.TouchEvent> getTouchEvents();
}
