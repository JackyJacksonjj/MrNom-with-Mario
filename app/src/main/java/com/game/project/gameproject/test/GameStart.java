package com.game.project.gameproject.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.game.project.gameproject.interfaces.Game;
import com.game.project.gameproject.interfaces.Graphics;
import com.game.project.gameproject.interfaces.Pixmap;
import com.game.project.gameproject.interfaces.Screen;

public	class	GameStart	extends Screen {
    Pixmap awesomePic;
    float	x;

    public GameStart(){}

    public	GameStart(Game game)	{
        super	(game);
        awesomePic	=	game.getGraphics().newPixmap("",
                Graphics.PixmapFormat.RGB565);
    }
    @Override
    public	void	update(float	deltaTime)	{
        x	+=	15*deltaTime;
        if	(x	>	100)
            x	=	0;				}
    @Override
    public	void	present(float	deltaTime)	{
        game.getGraphics().clear(0);
        game.getGraphics().drawPixmap(awesomePic,	(int) x,	0,	0,	0,
                awesomePic.getWidth(),	awesomePic.getHeight());
    }
    @Override
    public	void	pause()	{
        //	nothing	to	do	here
    }
    @Override
    public	void	resume()	{
        //	nothing	to	do	here
    }
    @Override
    public	void	dispose()	{
        awesomePic.dispose();
    }
}