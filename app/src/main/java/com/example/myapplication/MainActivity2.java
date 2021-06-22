package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import pl.droidsonroids.gif.GifImageView;
import static com.example.myapplication.R.drawable.*;


public class MainActivity2 extends AppCompatActivity {

    private GifImageView gif,gif2,gif3,gif4;
    private GifImageView gif11,gif22,gif33,gif44;
    private Button bt,bt2,bt3;
    int i,i2,i3,i4;
    int ii,ii2,ii3,ii4;
    private TextView text,text2,textbet,textmoney,text5;
    private int x ,x2;
    private RelativeLayout relative;
    private int money=100000;
    private int bet=0;
    SoundPool soundPool,soundPool2,soundPool3,soundPool4,soundPool5,soundPool6;
    int soundID1,soundID2,soundID3,soundID4,soundID5,soundID6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initialize();

    }

    private void initialize() {

        gif = findViewById(R.id.gif);
        gif2 = findViewById(R.id.gif2);
        gif3 = findViewById(R.id.gif3);
        gif4 = findViewById(R.id.gif4);
        text=findViewById(R.id.textView2);
        bt =findViewById(R.id.button);
        bt2 =findViewById(R.id.button2);
        gif11 = findViewById(R.id.gif11);
        gif22 = findViewById(R.id.gif22);
        gif33 = findViewById(R.id.gif33);
        gif44 = findViewById(R.id.gif44);
        text2=findViewById(R.id.textView3);
        relative=findViewById(R.id.relative);
        textbet=findViewById(R.id.textbet);
        textmoney=findViewById(R.id.textmoney);
        textmoney.setText("錢包:"+money);
        bt3=findViewById(R.id.button3);
        text5=findViewById(R.id.text5);

        soundPool = new SoundPool.Builder().build();
        soundPool2 = new SoundPool.Builder().build();
        soundPool3 = new SoundPool.Builder().build();
        soundPool4 = new SoundPool.Builder().build();
        soundPool5 = new SoundPool.Builder().build();
        soundPool6 = new SoundPool.Builder().build();
        soundID1 =soundPool.load(MainActivity2.this,R.raw.dice,1);
        soundID2=soundPool2.load(MainActivity2.this,R.raw.win,1);
        soundID3= soundPool3.load(MainActivity2.this,R.raw.goldwin,1);
        soundID4 =soundPool4.load(MainActivity2.this,R.raw.goldone,1);
        soundID5 =soundPool5.load(MainActivity2.this,R.raw.goldtwo,1);
        soundID6 =soundPool6.load(MainActivity2.this,R.raw.moneyone,1);


    }


    public void mtehodText(View view){

        soundID1();

    }


    public void soundID1(){
        soundPool.play(soundID1,0.5f,0.5f,1,0,1);
    }
    public void soundID2(){
        soundPool2.play(soundID2,0.5f,0.5f,1,0,1);
    }
    public void soundID3(){
        soundPool3.play(soundID3,0.5f,0.5f,1,0,1);
    }
    public void soundID4(){
        soundPool4.play(soundID4,0.5f,0.5f,1,0,2);
    }
    public void soundID5(){
        soundPool5.play(soundID5,0.5f,0.5f,1,0,1);
    }
    public void soundID6(){
        soundPool6.play(soundID6,0.5f,0.5f,1,0,3);
    }
    public void soundID7(){
        soundPool6.play(soundID6,0.5f,0.5f,1,0,0);

    }


    public void method(View view) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                soundID1();
                text5.setText("");
                x =0;
                x2=0;
                text.setText("");
                text2.setText("");
                int rundom ,rundom2 ,rundom3 ,rundom4  ;
                rundom = (int) (Math.random() * 4 + 1);
                rundom2 = (int) (Math.random() * 4 + 1);
                rundom3 = (int) (Math.random() * 4 + 1);
                rundom4 = (int) (Math.random() * 4 + 1);
                if (rundom==1){
                    gif.setImageResource(top);
                }
                if (rundom==2){
                    gif.setImageResource(down);
                }
                if (rundom==3){
                    gif.setImageResource(lift);
                }
                if (rundom==4){
                    gif.setImageResource(right);
                }
                //
                if (rundom2==1){
                    gif2.setImageResource(top);
                }
                if (rundom2==2){
                    gif2.setImageResource(down);
                }
                if (rundom2==3){
                    gif2.setImageResource(lift);
                }
                if (rundom2==4){
                    gif2.setImageResource(right);
                }
                //
                if (rundom3==1){
                    gif3.setImageResource(top);
                }
                if (rundom3==2){
                    gif3.setImageResource(down);
                }
                if (rundom3==3){
                    gif3.setImageResource(lift);
                }
                if (rundom3==4){
                    gif3.setImageResource(right);
                }
                //
                if (rundom4==1){
                    gif4.setImageResource(top);
                }
                if (rundom2==2){
                    gif4.setImageResource(down);
                }
                if (rundom2==3){
                    gif4.setImageResource(lift);
                }
                if (rundom2==4){
                    gif4.setImageResource(right);
                }



                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        int rundom ,rundom2 ,rundom3 ,rundom4  ;
                        rundom = (int) (Math.random() * 4 + 1);
                        rundom2 = (int) (Math.random() * 4 + 1);
                        rundom3 = (int) (Math.random() * 4 + 1);
                        rundom4 = (int) (Math.random() * 4 + 1);
                        if (rundom==1){
                            gif.setImageResource(top);
                        }
                        if (rundom==2){
                            gif.setImageResource(down);
                        }
                        if (rundom==3){
                            gif.setImageResource(lift);
                        }
                        if (rundom==4){
                            gif.setImageResource(right);
                        }
                        //
                        if (rundom2==1){
                            gif2.setImageResource(top);
                        }
                        if (rundom2==2){
                            gif2.setImageResource(down);
                        }
                        if (rundom2==3){
                            gif2.setImageResource(lift);
                        }
                        if (rundom2==4){
                            gif2.setImageResource(right);
                        }
                        //
                        if (rundom3==1){
                            gif3.setImageResource(top);
                        }
                        if (rundom3==2){
                            gif3.setImageResource(down);
                        }
                        if (rundom3==3){
                            gif3.setImageResource(lift);
                        }
                        if (rundom3==4){
                            gif3.setImageResource(right);
                        }
                        //
                        if (rundom4==1){
                            gif4.setImageResource(top);
                        }
                        if (rundom2==2){
                            gif4.setImageResource(down);
                        }
                        if (rundom2==3){
                            gif4.setImageResource(lift);
                        }
                        if (rundom2==4){
                            gif4.setImageResource(right);
                        }


                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                int rundom ,rundom2 ,rundom3 ,rundom4  ;
                                rundom = (int) (Math.random() * 4 + 1);
                                rundom2 = (int) (Math.random() * 4 + 1);
                                rundom3 = (int) (Math.random() * 4 + 1);
                                rundom4 = (int) (Math.random() * 4 + 1);
                                if (rundom==1){
                                    gif.setImageResource(top);
                                }
                                if (rundom==2){
                                    gif.setImageResource(down);
                                }
                                if (rundom==3){
                                    gif.setImageResource(lift);
                                }
                                if (rundom==4){
                                    gif.setImageResource(right);
                                }
                                //
                                if (rundom2==1){
                                    gif2.setImageResource(top);
                                }
                                if (rundom2==2){
                                    gif2.setImageResource(down);
                                }
                                if (rundom2==3){
                                    gif2.setImageResource(lift);
                                }
                                if (rundom2==4){
                                    gif2.setImageResource(right);
                                }
                                //
                                if (rundom3==1){
                                    gif3.setImageResource(top);
                                }
                                if (rundom3==2){
                                    gif3.setImageResource(down);
                                }
                                if (rundom3==3){
                                    gif3.setImageResource(lift);
                                }
                                if (rundom3==4){
                                    gif3.setImageResource(right);
                                }
                                //
                                if (rundom4==1){
                                    gif4.setImageResource(top);
                                }
                                if (rundom2==2){
                                    gif4.setImageResource(down);
                                }
                                if (rundom2==3){
                                    gif4.setImageResource(lift);
                                }
                                if (rundom2==4){
                                    gif4.setImageResource(right);
                                }


                                Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        int rundom ,rundom2 ,rundom3 ,rundom4  ;
                                        rundom = (int) (Math.random() * 4 + 1);
                                        rundom2 = (int) (Math.random() * 4 + 1);
                                        rundom3 = (int) (Math.random() * 4 + 1);
                                        rundom4 = (int) (Math.random() * 4 + 1);
                                        if (rundom==1){
                                            gif.setImageResource(top);
                                        }
                                        if (rundom==2){
                                            gif.setImageResource(down);
                                        }
                                        if (rundom==3){
                                            gif.setImageResource(lift);
                                        }
                                        if (rundom==4){
                                            gif.setImageResource(right);
                                        }
                                        //
                                        if (rundom2==1){
                                            gif2.setImageResource(top);
                                        }
                                        if (rundom2==2){
                                            gif2.setImageResource(down);
                                        }
                                        if (rundom2==3){
                                            gif2.setImageResource(lift);
                                        }
                                        if (rundom2==4){
                                            gif2.setImageResource(right);
                                        }
                                        //
                                        if (rundom3==1){
                                            gif3.setImageResource(top);
                                        }
                                        if (rundom3==2){
                                            gif3.setImageResource(down);
                                        }
                                        if (rundom3==3){
                                            gif3.setImageResource(lift);
                                        }
                                        if (rundom3==4){
                                            gif3.setImageResource(right);
                                        }
                                        //
                                        if (rundom4==1){
                                            gif4.setImageResource(top);
                                        }
                                        if (rundom2==2){
                                            gif4.setImageResource(down);
                                        }
                                        if (rundom2==3){
                                            gif4.setImageResource(lift);
                                        }
                                        if (rundom2==4){
                                            gif4.setImageResource(right);
                                        }

                                        Handler handler = new Handler();
                                        handler.postDelayed(new Runnable() {
                                            @Override
                                            public void run() {

                                               i = (int) (Math.random() * 6 + 1);;
                                               i2 = (int) (Math.random() * 6 + 1);
                                               i3 = (int) (Math.random() * 6 + 1);;
                                               i4 = (int) (Math.random() * 6 + 1);;

                                                if(i==1){
                                                    gif.setImageResource(one);
                                                }
                                                if(i==2){
                                                    gif.setImageResource(two);
                                                }
                                                if(i==3){
                                                    gif.setImageResource(three);
                                                }
                                                if(i==4){
                                                    gif.setImageResource(four);
                                                }
                                                if(i==5){
                                                    gif.setImageResource(five);
                                                }
                                                if(i==6){
                                                    gif.setImageResource(six);
                                                }
                                                //
                                                if(i2==1){
                                                    gif2.setImageResource(one);
                                                }
                                                if(i2==2){
                                                    gif2.setImageResource(two);
                                                }
                                                if(i2==3){
                                                    gif2.setImageResource(three);
                                                }
                                                if(i2==4){
                                                    gif2.setImageResource(four);
                                                }
                                                if(i2==5){
                                                    gif2.setImageResource(five);
                                                }
                                                if(i2==6){
                                                    gif2.setImageResource(six);
                                                }
                                                //
                                                if(i3==1){
                                                    gif3.setImageResource(one);
                                                }
                                                if(i3==2){
                                                    gif3.setImageResource(two);
                                                }
                                                if(i3==3){
                                                    gif3.setImageResource(three);
                                                }
                                                if(i3==4){
                                                    gif3.setImageResource(four);
                                                }
                                                if(i3==5){
                                                    gif3.setImageResource(five);
                                                }
                                                if(i3==6){
                                                    gif3.setImageResource(six);
                                                }

                                                //
                                                if(i4==1){
                                                    gif4.setImageResource(one);
                                                }
                                                if(i4==2){
                                                    gif4.setImageResource(two);
                                                }
                                                if(i4==3){
                                                    gif4.setImageResource(three);
                                                }
                                                if(i4==4){
                                                    gif4.setImageResource(four);
                                                }
                                                if(i4==5){
                                                    gif4.setImageResource(five);
                                                }
                                                if(i4==6){
                                                    gif4.setImageResource(six);
                                                }



                                                methodtotal();




                                            }
                                        },500);




                                    }
                                },500);

                            }
                        },500);

                    }
                },500);

//                gif.setImageResource(R.drawable.gif);
//                gif2.setImageResource(R.drawable.gif);
//                gif3.setImageResource(R.drawable.gif);
//                gif4.setImageResource(R.drawable.gif);
            }
        },100);


    }

    public void method02(View view){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                soundID1();
                x2 =0;
                text2.setText("");
                int rundom ,rundom2 ,rundom3 ,rundom4  ;
                rundom = (int) (Math.random() * 4 + 1);
                rundom2 = (int) (Math.random() * 4 + 1);
                rundom3 = (int) (Math.random() * 4 + 1);
                rundom4 = (int) (Math.random() * 4 + 1);
                if (rundom==1){
                    gif11.setImageResource(top);
                }
                if (rundom==2){
                    gif11.setImageResource(down);
                }
                if (rundom==3){
                    gif11.setImageResource(lift);
                }
                if (rundom==4){
                    gif11.setImageResource(right);
                }
                //
                if (rundom2==1){
                    gif22.setImageResource(top);
                }
                if (rundom2==2){
                    gif22.setImageResource(down);
                }
                if (rundom2==3){
                    gif22.setImageResource(lift);
                }
                if (rundom2==4){
                    gif22.setImageResource(right);
                }
                //
                if (rundom3==1){
                    gif33.setImageResource(top);
                }
                if (rundom3==2){
                    gif33.setImageResource(down);
                }
                if (rundom3==3){
                    gif33.setImageResource(lift);
                }
                if (rundom3==4){
                    gif33.setImageResource(right);
                }
                //
                if (rundom4==1){
                    gif44.setImageResource(top);
                }
                if (rundom2==2){
                    gif44.setImageResource(down);
                }
                if (rundom2==3){
                    gif44.setImageResource(lift);
                }
                if (rundom2==4){
                    gif44.setImageResource(right);
                }



                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        int rundom ,rundom2 ,rundom3 ,rundom4  ;
                        rundom = (int) (Math.random() * 4 + 1);
                        rundom2 = (int) (Math.random() * 4 + 1);
                        rundom3 = (int) (Math.random() * 4 + 1);
                        rundom4 = (int) (Math.random() * 4 + 1);
                        if (rundom==1){
                            gif11.setImageResource(top);
                        }
                        if (rundom==2){
                            gif11.setImageResource(down);
                        }
                        if (rundom==3){
                            gif11.setImageResource(lift);
                        }
                        if (rundom==4){
                            gif11.setImageResource(right);
                        }
                        //
                        if (rundom2==1){
                            gif22.setImageResource(top);
                        }
                        if (rundom2==2){
                            gif22.setImageResource(down);
                        }
                        if (rundom2==3){
                            gif22.setImageResource(lift);
                        }
                        if (rundom2==4){
                            gif22.setImageResource(right);
                        }
                        //
                        if (rundom3==1){
                            gif33.setImageResource(top);
                        }
                        if (rundom3==2){
                            gif33.setImageResource(down);
                        }
                        if (rundom3==3){
                            gif33.setImageResource(lift);
                        }
                        if (rundom3==4){
                            gif33.setImageResource(right);
                        }
                        //
                        if (rundom4==1){
                            gif44.setImageResource(top);
                        }
                        if (rundom2==2){
                            gif44.setImageResource(down);
                        }
                        if (rundom2==3){
                            gif44.setImageResource(lift);
                        }
                        if (rundom2==4){
                            gif44.setImageResource(right);
                        }


                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                int rundom ,rundom2 ,rundom3 ,rundom4  ;
                                rundom = (int) (Math.random() * 4 + 1);
                                rundom2 = (int) (Math.random() * 4 + 1);
                                rundom3 = (int) (Math.random() * 4 + 1);
                                rundom4 = (int) (Math.random() * 4 + 1);
                                if (rundom==1){
                                    gif11.setImageResource(top);
                                }
                                if (rundom==2){
                                    gif11.setImageResource(down);
                                }
                                if (rundom==3){
                                    gif11.setImageResource(lift);
                                }
                                if (rundom==4){
                                    gif11.setImageResource(right);
                                }
                                //
                                if (rundom2==1){
                                    gif22.setImageResource(top);
                                }
                                if (rundom2==2){
                                    gif22.setImageResource(down);
                                }
                                if (rundom2==3){
                                    gif22.setImageResource(lift);
                                }
                                if (rundom2==4){
                                    gif22.setImageResource(right);
                                }
                                //
                                if (rundom3==1){
                                    gif33.setImageResource(top);
                                }
                                if (rundom3==2){
                                    gif33.setImageResource(down);
                                }
                                if (rundom3==3){
                                    gif33.setImageResource(lift);
                                }
                                if (rundom3==4){
                                    gif33.setImageResource(right);
                                }
                                //
                                if (rundom4==1){
                                    gif44.setImageResource(top);
                                }
                                if (rundom2==2){
                                    gif44.setImageResource(down);
                                }
                                if (rundom2==3){
                                    gif44.setImageResource(lift);
                                }
                                if (rundom2==4){
                                    gif44.setImageResource(right);
                                }


                                Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        int rundom ,rundom2 ,rundom3 ,rundom4  ;
                                        rundom = (int) (Math.random() * 4 + 1);
                                        rundom2 = (int) (Math.random() * 4 + 1);
                                        rundom3 = (int) (Math.random() * 4 + 1);
                                        rundom4 = (int) (Math.random() * 4 + 1);
                                        if (rundom==1){
                                            gif11.setImageResource(top);
                                        }
                                        if (rundom==2){
                                            gif11.setImageResource(down);
                                        }
                                        if (rundom==3){
                                            gif11.setImageResource(lift);
                                        }
                                        if (rundom==4){
                                            gif11.setImageResource(right);
                                        }
                                        //
                                        if (rundom2==1){
                                            gif22.setImageResource(top);
                                        }
                                        if (rundom2==2){
                                            gif22.setImageResource(down);
                                        }
                                        if (rundom2==3){
                                            gif22.setImageResource(lift);
                                        }
                                        if (rundom2==4){
                                            gif22.setImageResource(right);
                                        }
                                        //
                                        if (rundom3==1){
                                            gif33.setImageResource(top);
                                        }
                                        if (rundom3==2){
                                            gif33.setImageResource(down);
                                        }
                                        if (rundom3==3){
                                            gif33.setImageResource(lift);
                                        }
                                        if (rundom3==4){
                                            gif33.setImageResource(right);
                                        }
                                        //
                                        if (rundom4==1){
                                            gif44.setImageResource(top);
                                        }
                                        if (rundom2==2){
                                            gif44.setImageResource(down);
                                        }
                                        if (rundom2==3){
                                            gif44.setImageResource(lift);
                                        }
                                        if (rundom2==4){
                                            gif44.setImageResource(right);
                                        }

                                        Handler handler = new Handler();
                                        handler.postDelayed(new Runnable() {
                                            @Override
                                            public void run() {

                                                ii = (int) (Math.random() * 6 + 1);;
                                                ii2 = (int) (Math.random() * 6 + 1);
                                                ii3 = (int) (Math.random() * 6 + 1);;
                                                ii4 = (int) (Math.random() * 6 + 1);;

                                                if(ii==1){
                                                    gif11.setImageResource(one);
                                                }
                                                if(ii==2){
                                                    gif11.setImageResource(two);
                                                }
                                                if(ii==3){
                                                    gif11.setImageResource(three);
                                                }
                                                if(ii==4){
                                                    gif11.setImageResource(four);
                                                }
                                                if(ii==5){
                                                    gif11.setImageResource(five);
                                                }
                                                if(ii==6){
                                                    gif11.setImageResource(six);
                                                }
                                                //
                                                if(ii2==1){
                                                    gif22.setImageResource(one);
                                                }
                                                if(ii2==2){
                                                    gif22.setImageResource(two);
                                                }
                                                if(ii2==3){
                                                    gif22.setImageResource(three);
                                                }
                                                if(ii2==4){
                                                    gif22.setImageResource(four);
                                                }
                                                if(ii2==5){
                                                    gif22.setImageResource(five);
                                                }
                                                if(ii2==6){
                                                    gif22.setImageResource(six);
                                                }
                                                //
                                                if(ii3==1){
                                                    gif33.setImageResource(one);
                                                }
                                                if(ii3==2){
                                                    gif33.setImageResource(two);
                                                }
                                                if(ii3==3){
                                                    gif33.setImageResource(three);
                                                }
                                                if(ii3==4){
                                                    gif33.setImageResource(four);
                                                }
                                                if(ii3==5){
                                                    gif33.setImageResource(five);
                                                }
                                                if(ii3==6){
                                                    gif33.setImageResource(six);
                                                }

                                                //
                                                if(ii4==1){
                                                    gif44.setImageResource(one);
                                                }
                                                if(ii4==2){
                                                    gif44.setImageResource(two);
                                                }
                                                if(ii4==3){
                                                    gif44.setImageResource(three);
                                                }
                                                if(ii4==4){
                                                    gif44.setImageResource(four);
                                                }
                                                if(ii4==5){
                                                    gif44.setImageResource(five);
                                                }
                                                if(ii4==6){
                                                    gif44.setImageResource(six);
                                                }



                                                methodtotal2();




                                            }
                                        },500);




                                    }
                                },500);

                            }
                        },500);

                    }
                },500);

//                gif.setImageResource(R.drawable.gif);
//                gif2.setImageResource(R.drawable.gif);
//                gif3.setImageResource(R.drawable.gif);
//                gif4.setImageResource(R.drawable.gif);
            }
        },100);




    }
    private void methodtotal2() {

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(ii==ii2 & ii!=ii3 &ii!=ii4  &ii3!=ii4){
                    x2 =ii3+ii4;
                    text2.setText("你得"+x2+"點");

                }
                if(ii==ii3 & ii!=ii2 &ii!=i4  &ii2!=ii4){
                    x2 =ii2+ii4;
                    text2.setText("你得"+x2+"點");

                }
                if(ii==ii4 & ii!=ii2 &ii!=ii3 &ii2!=ii3){
                    x2 =ii2+ii3;
                    text2.setText("你得"+x2+"點");
                }

                if(ii2==ii3 &ii2!=ii &ii2!=ii4 &ii!=ii4){
                     x2 =ii+ii4;
                    text2.setText("你得"+x2+"點");
                }
                if(ii2==ii4 &ii2!=ii &ii2!=ii3 &ii!=ii3){
                  x2 =ii+ii3;
                    text2.setText("你得"+x2+"點");
                }

                if (ii3 == ii4 & ii3 !=ii & ii3 != ii2 &ii!=ii2) {
                     x2 = ii +ii2;
                    text2.setText("你得"+x2+"點");
                }


                if(ii==ii2 & ii3==ii4){
                    if(ii>ii3){
                         x2 = ii+ii2;
                        text2.setText("你得"+x2+"點");
                    }
                    if(ii<ii3){
                         x2 = ii3+ii4;
                        text2.setText("你得"+x2+"點");
                    }
                }

                if(ii==ii3 & ii2==ii4){
                    if(ii>ii2){
                        x2 = ii+ii3;
                        text2.setText("你得"+x2+"點");
                    }
                    if(ii<ii2){
                        x2 = ii2+ii4;
                        text2.setText("你得"+x2+"點");
                    }
                }

                if(ii==ii4 & ii2==ii3){
                    if(ii>ii2){
                        x2 = ii+ii4;
                        text2.setText("你得"+x2+"點");
                    }
                    if(ii<ii2){
                       x2 = ii2+ii3;
                        text2.setText("你得"+x2+"點");
                    }
                }
                    if(x2==0) {
                        text2.setText("沒有");
                        bt2.performClick();
                    }//if結尾

                if(x2!=0){
                    bt3.performClick();
                }  //自己的骰子 結算

            }


        },100);







    }

    private void methodtotal() {

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(i==i2 & i!=i3 &i!=i4  &i3!=i4){
                    x =i3+i4;
                    text.setText("莊家"+x+"點");

                }
                if(i==i3 & i!=i2 &i!=i4  &i2!=i4){
                    x =i2+i4;
                    text.setText("莊家"+x+"點");

                }
                if(i==i4 & i!=i2 &i!=i3 &i2!=i3){
                    x =i2+i3;
                    text.setText("莊家"+x+"點");
                }

                if(i2==i3 &i2!=i &i2!=i4 &i!=i4){
                    x =i+i4;
                    text.setText("莊家"+x+"點");
                }
                if(i2==i4 &i2!=i &i2!=i3 &i!=i3){
                    x =i+i3;
                    text.setText("莊家"+x+"點");
                }

                if (i3 == i4 & i3 !=i & i3 != i2 &i!=i2) {
                    x = i +i2;
                    text.setText("莊家"+x+"點");
                }


                if(i==i2 & i3==i4){
                    if(i>i3){
                        x = i+i2;
                        text.setText("莊家"+x+"點");
                    }
                    if(i<i3){
                        x = i3+i4;
                        text.setText("莊家"+x+"點");
                    }
                }

                if(i==i3 & i2==i4){
                    if(i>i2){
                        x = i+i3;
                        text.setText("莊家"+x+"點");
                    }
                    if(i<i2){
                        x = i2+i4;
                        text.setText("莊家"+x+"點");
                    }
                }

                if(i==i4 & i2==i3){
                    if(i>i2){
                        x = i+i4;
                        text.setText("莊家"+x+"點");
                    }
                    if(i<i2){
                        x = i2+i3;
                        text.setText("莊家"+x+"點");
                    }
                }
                if(x==0) {
                    text.setText("沒有");
                    bt.performClick();

                }//if結尾
                if(x!=0){
                    bt2.performClick();
                }


            }


        },100);

    } //methodtotal() end

    public void methodaddGold(View view){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                text5.setText("");
            }
        },100);

        if(money>99) {
            soundID4();
            money = money - 100;
            bet = bet + 100;
            ImageView iv = new ImageView(getApplicationContext());
            iv.setImageResource(R.drawable.gold);
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(55, 55);
            int x, y;  //滿TOP約400  左邊約530
            x = (int) (Math.random() * 400 + 1);
            y = (int) (Math.random() * 530 + 1);
            params.topMargin = x;
            params.leftMargin = y;
            relative.addView(iv, params);
            textbet.setText("投注金額:" + bet + "元");
            textmoney.setText("錢包:" + money);
        }
    }
    public void methodaddGold2(View view){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                text5.setText("");
            }
        },100);

        if(money>999) {
            soundID5();
            money = money - 1000;
            bet = bet + 1000;
            ImageView iv = new ImageView(getApplicationContext());
            iv.setImageResource(R.drawable.gold66);
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(165, 165);
            int x, y;  //滿TOP約400  左邊約530
            x = (int) (Math.random() * 400 + 1);
            y = (int) (Math.random() * 530 + 1);
            params.topMargin = x;
            params.leftMargin = y;
            relative.addView(iv, params);
            textbet.setText("投注金額:" + bet + "元");
            textmoney.setText("錢包:" + money);
        }
    }

    public void methodaddGold3(View view){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                text5.setText("");
            }
        },100);

        if(money>9999) {
            soundID6();
            money = money - 10000;
            bet = bet + 10000;
            ImageView iv = new ImageView(getApplicationContext());
            iv.setImageResource(R.drawable.money);
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(180, 180);
            int x, y;  //滿TOP約400  左邊約530
            x = (int) (Math.random() * 400 + 1);
            y = (int) (Math.random() * 530 + 1);
            params.topMargin = x;
            params.leftMargin = y;
            relative.addView(iv, params);
            textbet.setText("投注金額:" + bet + "元");
            textmoney.setText("錢包:" + money);
        }
    }
    public void methodaddGold4(View view){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                text5.setText("");
            }
        },100);

        if(money>49999){
            soundID7();
        money =money-50000;
        bet = bet+50000;
        ImageView iv = new ImageView(getApplicationContext());
        iv.setImageResource(R.drawable.money2);
        RelativeLayout.LayoutParams params =new RelativeLayout.LayoutParams(180,180);
        int x ,y;  //滿TOP約400  左邊約530
        x = (int) (Math.random() * 400 + 1);
        y = (int) (Math.random() * 530 + 1);
        params.topMargin=x;
        params.leftMargin=y;
        relative.addView(iv,params);
        textbet.setText("投注金額:"+bet+"元");
        textmoney.setText("錢包:"+money);
        }
    }

    public void result(View view){

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {


                if(x>x2){
                    bet=0;
                    textbet.setText("投注金額:"+bet+"元");
                    text5.setText("You are a loser");
                    textmoney.setText("錢包:"+money+"元");

                }
                if(x2>x){

                    soundID3();
                    soundID2();
                    bet= bet*2;
                    money =money+bet;
                    text5.setText("你贏得:"+bet+"元");
                    bet=0;
                    textmoney.setText("錢包:"+money+"元");

                }
                if(x==x2){
                    money=money+bet;
                    bet=0;
                    text5.setText("平手 , 走");
                    textbet.setText("投注金額:"+bet+"元");
                    textmoney.setText("錢包:"+money+"元");
                }


                relative.removeAllViews();


            }
        },100);


    }


}