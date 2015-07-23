package com.tutorial.maro.framework.com.tutorial.maro.framework.implementation;

import android.content.Context;
import android.os.Build;
import android.view.View;

import com.tutorial.maro.framework.Input;

import java.util.List;

/**
 * Created by maro on 7/23/15.
 */
public class AndroidInput  implements Input {
    TouchHandler touchHandler;

    public AndroidInput(Context context, View view, float scaleX, float scaleY) {
        if(Integer.parseInt(Build.VERSION.SDK) < 5)
            touchHandler = new SingleTouchHandler(view, scaleX, scaleY);
        else
            touchHandler = new MultiTouchHandler(view, scaleX, scaleY);
    }


    @Override
    public boolean isTouchDown(int pointer) {
        return touchHandler.isTouchDown(pointer);
    }

    @Override
    public int getTouchX(int pointer) {
        return touchHandler.getTouchX(pointer);
    }

    @Override
    public int getTouchY(int pointer) {
        return touchHandler.getTouchY(pointer);
    }



    @Override
    public List<TouchEvent> getTouchEvents() {
        return touchHandler.getTouchEvents();
    }

}
