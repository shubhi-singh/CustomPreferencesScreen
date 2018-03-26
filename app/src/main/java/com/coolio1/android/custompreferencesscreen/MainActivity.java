package com.coolio1.android.custompreferencesscreen;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.crystal.crystalrangeseekbar.widgets.CrystalRangeSeekbar;

public class MainActivity extends AppCompatActivity {
    Toolbar mToolbar;
    CrystalRangeSeekbar seekbar;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Preferences");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        seekbar = (CrystalRangeSeekbar)findViewById(R.id.rangeSeekbar1);





    }

}
