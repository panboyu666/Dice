package pan.bu.yu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.myapplication.R;

import pan.bu.yu.MainActivity;

public class MainActivity0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main0);


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                tourist();
            }
        },3000);

    }



    public void tourist() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}