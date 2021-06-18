package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import pl.droidsonroids.gif.GifImageView;
import static com.example.myapplication.R.drawable.*;


public class MainActivity2 extends AppCompatActivity {

    private GifImageView gif,gif2,gif3,gif4;
    private Button bt;
    int i,i2,i3,i4;
    private TextView text;
    private int x ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        gif = findViewById(R.id.gif);
        gif2 = findViewById(R.id.gif2);
        gif3 = findViewById(R.id.gif3);
        gif4 = findViewById(R.id.gif4);
        text=findViewById(R.id.textView2);
        bt =findViewById(R.id.button);

    }



    public void method(View view) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                x =0;
                text.setText("");
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
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                x =0;
                                text.setText("");
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

                    }//if結尾


            }


        },100);







    }




}