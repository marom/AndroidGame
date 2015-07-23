package com.tutorial.maro.androidgame;

import com.tutorial.maro.framework.Game;
import com.tutorial.maro.framework.Graphics;
import com.tutorial.maro.framework.Input.TouchEvent;
import com.tutorial.maro.framework.Screen;

import java.util.List;


public class MainMenuScreen extends Screen {

    public MainMenuScreen(Game game) {
        super(game);
    }

    @Override
    public void update(float deltaTime) {
        Graphics g = game.getGraphics();
        List<TouchEvent> touchEvents = game.getInput().getTouchEvents();

        int len = touchEvents.size();
        for (int i = 0; i < len; i++) {
            TouchEvent event = touchEvents.get(i);
            if (event.type == TouchEvent.TOUCH_UP) {

                if (inBounds(event, 50, 350, 250, 450)) {
                    game.setScreen(new GameScreen(game));
                }

            }
        }
    }

    private boolean inBounds(TouchEvent event, int x, int y, int width,
                             int height) {
        return event.x > x && event.x < x + width - 1 && event.y > y
                && event.y < y + height - 1;
    }

    @Override
    public void paint(float deltaTime) {
        Graphics g = game.getGraphics();
        g.drawImage(Assets.menu, 0, 0);
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }

    @Override
    public void backButton() {
        android.os.Process.killProcess(android.os.Process.myPid());

    }
}
