package com.game.project.gameproject.test;

/**
 * Created by fruitware on 12/14/15.
 */
import	android.app.ListActivity;
import	android.content.Intent;
import	android.os.Bundle;
import	android.view.View;
import	android.widget.ArrayAdapter;
import	android.widget.ListView;
public class	AndroidBasicsStarter	extends	ListActivity	{
    public final static String STRING_ARRAY_EXTRA = "string_extra_arr_names";

    String	tests[]	=	{"GameStart","LifeCycleTest",	"SingleTouchTest",	"MultiTouchTest",
            "KeyTest",	"AccelerometerTest",	"AssetsTest",
            "ExternalStorageTest",	"SoundPoolTest",	"MusicPlayerTest",
            "FullScreenTest",	"RenderViewTest",	"ShapeTest",	"BitmapTest",
            "FontTest",	"SurfaceViewTest"	};
    public void	onCreate(Bundle	savedInstanceState)	{
        super.onCreate(savedInstanceState);
        setListAdapter(new	ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,	tests));
    }
    @Override
    protected void onListItemClick(ListView list, View view, int position, long	id)	{
        super.onListItemClick(list,	view, position, id);
        String	testName	=	tests[position];
        try	{
            Class clazz	= Class.forName("com.game.project.gameproject."	+	testName);
            Intent	intent	=	new	Intent(this,	clazz);
            intent.putExtra(STRING_ARRAY_EXTRA, tests);
            startActivity(intent);
        }	catch	(ClassNotFoundException	e)	{
            e.printStackTrace();
        }
    }
}