package com.game.project.gameproject;

import android.graphics.Bitmap;

import com.game.project.gameproject.interfaces.Graphics;
import com.game.project.gameproject.interfaces.Pixmap;

/**
 * Created by fruitware on 12/18/15.
 */
public class AndroidPixmap implements Pixmap {
    Bitmap bitmap;
    Graphics.PixmapFormat format;

    public AndroidPixmap(Bitmap bitmap, Graphics.PixmapFormat format) {
        this.bitmap = bitmap;
        this.format = format;
    }
    @Override
    public int getWidth() {
        return bitmap.getWidth();
    }
    @Override
    public int getHeight() {
        return bitmap.getHeight();
    }
    @Override
    public Graphics.PixmapFormat getFormat() {
        return format;
    }
    @Override
    public void dispose() {
        bitmap.recycle();
    }
}
