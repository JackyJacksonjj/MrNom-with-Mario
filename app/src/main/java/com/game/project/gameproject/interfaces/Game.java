package com.game.project.gameproject.interfaces;

import com.game.project.gameproject.LoadingScreen;

/**
 * Created by fruitware on 12/14/15.
 */
public	interface	Game	{
    public	Input	getInput();
    public	FileIO	getFileIO();
    public	Graphics	getGraphics();
    public	Audio	getAudio();
    public	void	setScreen(Screen	screen);
    public	Screen	getCurrentScreen();
    public	Screen	getStartScreen();
}