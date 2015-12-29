package com.game.project.gameproject.test;

import com.game.project.gameproject.AndroidGame;
import com.game.project.gameproject.interfaces.Screen;

/**
 * Created by fruitware on 12/14/15.
 */
public	class	MyGame	extends AndroidGame {

    public Screen getStartScreen	()	{
        return	new	GameStart(this);
    }
}
