package com.game.project.gameproject.interfaces;

import android.app.Activity;

/**
 * Created by fruitware on 12/14/15.
 */
public	abstract	class	Screen extends Activity {
    protected	final	Game	game;

    public Screen(){
        game = null;
    }

    public	Screen(Game	game)	{
        this.game	=	game;
    }

    public	abstract	void	update(float	deltaTime);
    public	abstract	void	present(float	deltaTime);
    public	abstract	void	pause();
    public	abstract	void	resume();
    public	abstract	void	dispose();
}
