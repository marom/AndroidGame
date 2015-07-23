package com.tutorial.maro.androidgame;

import com.tutorial.maro.framework.Image;
import com.tutorial.maro.framework.Music;
import com.tutorial.maro.framework.Sound;

/**
 * Created by maro on 7/23/15.
 */
public class Assets {

    public static Image menu, splash, background, character, character2, character3, heliboy, heliboy2, heliboy3, heliboy4, heliboy5;
    public static Image tiledirt, tilegrassTop, tilegrassBot, tilegrassLeft, tilegrassRight, characterJump, characterDown;
    public static Image button;
    public static Sound click, shoot, jump;
    public static Music theme;

    public static void load(SampleGame sampleGame) {
        // TODO Auto-generated method stub
        theme = sampleGame.getAudio().createMusic("menutheme.mp3");
        theme.setLooping(true);
        theme.setVolume(0.85f);
        theme.play();
    }
}
