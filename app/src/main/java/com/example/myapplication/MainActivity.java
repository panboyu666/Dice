package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    public MediaPlayer mp ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp =MediaPlayer.create(this, R.raw.background);
        mp.setLooping(true);
        mp.start();

    }


    public void tourist(View view) {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }


}