package com.azmar.animationone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = (ImageView) findViewById(R.id.imgFlower);
    }

    public void clockwise(View view){
        android.view.animation.Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        img.startAnimation(animation);
    }

    public void blink(View view){
        android.view.animation.Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        img.startAnimation(animation);
    }

    public void slide(View view){
        android.view.animation.Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);
        img.startAnimation(animation);
    }
}
