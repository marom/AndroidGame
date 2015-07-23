package com.tutorial.maro.framework;

/**
 * Created by maro on 7/23/15.
 */
public interface Image {

    public int getWidth();
    public int getHeight();
    public Graphics.ImageFormat getFormat();
    public void dispose();

}
