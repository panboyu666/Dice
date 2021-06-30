package pan.bu.yu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.R;

import static pan.bu.yu.MainActivity.playMusic;
import static pan.bu.yu.MainActivity.intent;
import static pan.bu.yu.ServiceA.mp;

public class MainActivity1 extends AppCompatActivity {

    EditText editText;
    String string = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        editText = findViewById(R.id.edit);


    }

    public void nextMethod(View view) {

            string = ""+editText.getText();
            if(string==""){
                Toast.makeText(this, "請輸入ID", Toast.LENGTH_SHORT).show();
            }
            if(string!="") {
            Intent intent = new Intent(this, MainActivity1_1.class);
            intent.putExtra("key1",string);
            startActivity(intent);
            }
    }

    public void checkingID(View view) {
        string = ""+editText.getText();
        Toast.makeText(this, string+"可以使用", Toast.LENGTH_SHORT).show();
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