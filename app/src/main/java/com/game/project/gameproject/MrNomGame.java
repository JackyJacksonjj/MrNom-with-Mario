package com.game.project.gameproject;

import com.game.project.gameproject.interfaces.Screen;

/**
 * Created by fruitware on 12/19/15.
 */
public class MrNomGame extends AndroidGame {
    @Override
    public Screen getStartScreen() {
        return new LoadingScreen(this);
    }
}