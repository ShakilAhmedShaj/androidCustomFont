package com.t3ch.shaj.androidcustomfont;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView1, textView2, textView3;
    private Typeface typeface1, typeface2, typeface3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.TV_1);
        textView2 = findViewById(R.id.TV_2);
        textView3 = findViewById(R.id.TV_3);

        typeface1 = Typeface.createFromAsset(getAssets(), "fonts/hilton.ttf");
        typeface2 = Typeface.createFromAsset(getAssets(), "fonts/batman.ttf");
        typeface3 = Typeface.createFromAsset(getAssets(), "fonts/humana.ttf");

        textView1.setTypeface(typeface1);
        textView2.setTypeface(typeface2);
        textView3.setTypeface(typeface3);


    }
}
