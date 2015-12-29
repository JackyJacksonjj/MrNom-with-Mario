package com.game.project.gameproject.test;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by fruitware on 12/15/15.
 */
public class FullScreenTest extends SingleTouchTest {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
    }
}
