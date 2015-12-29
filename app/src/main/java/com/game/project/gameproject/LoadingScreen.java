package com.game.project.gameproject;

/**
 * Created by fruitware on 12/19/15.
 */

import com.game.project.gameproject.interfaces.Game;
import com.game.project.gameproject.interfaces.Graphics;
import com.game.project.gameproject.interfaces.Graphics.PixmapFormat;
import com.game.project.gameproject.interfaces.Screen;

public class LoadingScreen extends Screen {
    public static final int TYPE_NORMAL = 0;
    public static final int TYPE_CUSTOM = 1;
    int styleType = TYPE_NORMAL;

    public LoadingScreen(Game game) {
        super(game);
    }

    public void setStyle(int type){
        if(type >= 0 || type <=1){
            styleType = type;
        }
    }

    @Override
    public void update(float deltaTime) {
        Graphics g = game.getGraphics();
        if(((AndroidGame) game).styleType == TYPE_NORMAL){
            Assets.background = g.newPixmap("background.png", Graphics.PixmapFormat.RGB565);
            Assets.logo = g.newPixmap("logo.png", PixmapFormat.ARGB4444);
            Assets.mainMenu = g.newPixmap("mainmenu.png", PixmapFormat.ARGB4444);
            Assets.buttons = g.newPixmap("buttons.png", PixmapFormat.ARGB4444);
            Assets.help1 = g.newPixmap("help1.png", PixmapFormat.ARGB4444);
            Assets.help2 = g.newPixmap("help2.png", PixmapFormat.ARGB4444);
            Assets.help3 = g.newPixmap("help3.png", PixmapFormat.ARGB4444);
            Assets.numbers = g.newPixmap("numbers.png", PixmapFormat.ARGB4444);
            Assets.ready = g.newPixmap("ready.png", PixmapFormat.ARGB4444);
            Assets.pause = g.newPixmap("pausemenu.png", PixmapFormat.ARGB4444);
            Assets.gameOver = g.newPixmap("gameover.png", PixmapFormat.ARGB4444);
            Assets.headUp = g.newPixmap("headup.png", PixmapFormat.ARGB4444);
            Assets.headLeft = g.newPixmap("headleft.png", PixmapFormat.ARGB4444);
            Assets.headDown = g.newPixmap("headdown.png", PixmapFormat.ARGB4444);
            Assets.headRight = g.newPixmap("headright.png", PixmapFormat.ARGB4444);
            Assets.tail = g.newPixmap("tail.png", PixmapFormat.ARGB4444);
            Assets.stain1 = g.newPixmap("stain1.png", PixmapFormat.ARGB4444);
            Assets.stain2 = g.newPixmap("stain2.png", PixmapFormat.ARGB4444);
            Assets.stain3 = g.newPixmap("stain3.png", PixmapFormat.ARGB4444);
        }else if(((AndroidGame) game).styleType == TYPE_CUSTOM){
            Assets.background = g.newPixmap("fir-tree.jpg", Graphics.PixmapFormat.RGB565);
            Assets.logo = g.newPixmap("logo.png", PixmapFormat.ARGB4444);
            Assets.mainMenu = g.newPixmap("mainmenu.png", PixmapFormat.ARGB4444);
            Assets.buttons = g.newPixmap("buttons.png", PixmapFormat.ARGB4444);
            Assets.help1 = g.newPixmap("help1.png", PixmapFormat.ARGB4444);
            Assets.help2 = g.newPixmap("help2.png", PixmapFormat.ARGB4444);
            Assets.help3 = g.newPixmap("help3.png", PixmapFormat.ARGB4444);
            Assets.numbers = g.newPixmap("numbers.png", PixmapFormat.ARGB4444);
            Assets.ready = g.newPixmap("ready.png", PixmapFormat.ARGB4444);
            Assets.pause = g.newPixmap("pausemenu.png", PixmapFormat.ARGB4444);
            Assets.gameOver = g.newPixmap("gameover.png", PixmapFormat.ARGB4444);
            Assets.headUp = g.newPixmap("head-up.png", PixmapFormat.ARGB4444);
            Assets.headLeft = g.newPixmap("head-left.png", PixmapFormat.ARGB4444);
            Assets.nail = g.newPixmap("nail.png", PixmapFormat.ARGB4444);
            Assets.headDown = g.newPixmap("head-down.png", PixmapFormat.ARGB4444);
            Assets.headRight = g.newPixmap("head-right.png", PixmapFormat.ARGB4444);
            Assets.tail = g.newPixmap("ytail.png", PixmapFormat.ARGB4444);
            Assets.stain1 = g.newPixmap("cookie1.png", PixmapFormat.ARGB4444);
            Assets.stain2 = g.newPixmap("cookie2.png", PixmapFormat.ARGB4444);
            Assets.stain3 = g.newPixmap("cookie3.png", PixmapFormat.ARGB4444);
        }
        Assets.click = game.getAudio().newSound("click.ogg");
        Assets.eat = game.getAudio().newSound("eat.ogg");
        Assets.bitten = game.getAudio().newSound("bitten.ogg");
        Settings.load(game.getFileIO());
        game.setScreen(new MainMenuScreen(game));
    }

    @Override
    public void present(float deltaTime) {
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
}