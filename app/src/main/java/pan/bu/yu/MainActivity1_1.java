package pan.bu.yu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import com.example.myapplication.R;

import pl.droidsonroids.gif.GifImageView;

import static pan.bu.yu.MainActivity.intent;
import static pan.bu.yu.MainActivity.playMusic;
import static com.example.myapplication.R.drawable.down;
import static com.example.myapplication.R.drawable.five;
import static com.example.myapplication.R.drawable.four;
import static com.example.myapplication.R.drawable.np10;
import static com.example.myapplication.R.drawable.np11;
import static com.example.myapplication.R.drawable.np12;
import static com.example.myapplication.R.drawable.np2;
import static com.example.myapplication.R.drawable.np3;
import static com.example.myapplication.R.drawable.np4;
import static com.example.myapplication.R.drawable.np5;
import static com.example.myapplication.R.drawable.np6;
import static com.example.myapplication.R.drawable.np7;
import static com.example.myapplication.R.drawable.np8;
import static com.example.myapplication.R.drawable.np9;
import static com.example.myapplication.R.drawable.npc1;
import static com.example.myapplication.R.drawable.one;
import static com.example.myapplication.R.drawable.six;
import static com.example.myapplication.R.drawable.three;
import static com.example.myapplication.R.drawable.top;
import static com.example.myapplication.R.drawable.two;
import static pan.bu.yu.ServiceA.mp;

public class MainActivity1_1 extends AppCompatActivity {
    int i =0;
    int rundom,rundom2;
    private GifImageView gifImageView ,gifImageView2,viewGif ;
    SoundPool soundPool;
    int soundID1;
    TextView textView;
    String s;
    int x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1_1);
        intent=getIntent();
        s =intent.getStringExtra("key1");
        gifImageView=findViewById(R.id.gif1);
        gifImageView2=findViewById(R.id.gif2);
        viewGif=findViewById(R.id.viewGif);
        soundPool = new SoundPool.Builder().build();
        soundID1 =soundPool.load(MainActivity1_1.this,R.raw.dice,1);
        textView= findViewById(R.id.text_1);


    }



    public void roll_method(View view) {

        if(i==0){
            soundPool.play(soundID1,0.5f,0.5f,1,0,1);
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {

                    gifImageView.setImageResource(top);
                    gifImageView2.setImageResource(down);
                     rundom = (int) (Math.random() * 6 + 1);
                     rundom2 = (int) (Math.random() * 6 + 1);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {


                          if(rundom==1){
                              gifImageView.setImageResource(one);
                          }
                            if(rundom==2){
                                gifImageView.setImageResource(two);
                            }
                            if(rundom==3){
                                gifImageView.setImageResource(three);
                            }
                            if(rundom==4){
                                gifImageView.setImageResource(four);
                            }
                            if(rundom==5){
                                gifImageView.setImageResource(five);
                            }
                            if(rundom==6){
                                gifImageView.setImageResource(six);
                            }


                         if(rundom2==1){
                            gifImageView2.setImageResource(one);
                        }
                            if(rundom2==2){
                            gifImageView2.setImageResource(two);
                        }
                            if(rundom2==3){
                            gifImageView2.setImageResource(three);
                        }
                            if(rundom2==4){
                            gifImageView2.setImageResource(four);
                        }
                            if(rundom2==5){
                            gifImageView2.setImageResource(five);
                        }
                            if(rundom2==6){
                            gifImageView2.setImageResource(six);
                        }
                            x = rundom2+rundom;
                            textView.setText(""+s);

                                viewGif.setImageResource(npc1);
                          switch (x){
                              case 1:
                                  viewGif.setImageResource(npc1);
                                  break;
                              case 2:
                                  viewGif.setImageResource(np2);
                                  break;
                              case 3:
                                  viewGif.setImageResource(np3);
                                  break;
                              case 4:
                                  viewGif.setImageResource(np4);
                                  break;
                              case 5:
                                  viewGif.setImageResource(np5);
                                  break;
                              case 6:
                                  viewGif.setImageResource(np6);
                                  break;
                              case 7:
                                  viewGif.setImageResource(np7);
                                  break;
                              case 8:
                                  viewGif.setImageResource(np8);
                                  break;
                              case 9:
                                  viewGif.setImageResource(np9);
                                  break;
                              case 10:
                                  viewGif.setImageResource(np10);
                                  break;
                              case 11:
                                  viewGif.setImageResource(np11);
                                  break;
                              case 12:
                                  viewGif.setImageResource(np12);
                                  break;

                          }


                        }




                    },2000);


                }
            },100);




        }
        i++;
    }

    public void nextMethod(View view) {
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("key10",x);
        startActivity(intent);
    }



    @Override
    protected  void onStart() {
        super.onStart();
        playMusic=true;
        startService(intent);
    }
    @Override
    protected void onPause() {
        super.onPause();
        playMusic =false;

    }
    @Override
    protected void onStop() {
        super.onStop();
        if(!playMusic) {
            mp.pause();
        }
    }


}