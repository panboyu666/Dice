package pan.bu.yu;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;


import com.example.myapplication.R;

import static pan.bu.yu.ServiceA.mp;


public class MainActivity extends AppCompatActivity {

    public static boolean playMusic =true;
    public static Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         intent = new Intent(this, ServiceA.class);


    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
// 按下鍵盤上返回按鈕
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            new AlertDialog.Builder(this)
                    .setMessage("確定退出系統嗎？")
                    .setNegativeButton("取消",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,
                                                    int which) {
                                }
                            })
                    .setPositiveButton("確定",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,
                                                    int whichButton) {
                                    finish();
                                }
                            }).show();
            return true;
        } else {
            return super.onKeyDown(keyCode, event);
        }
    }

    @Override
    protected  void onStart() {
        super.onStart();

        startService(intent);
        playMusic =true;

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


    @Override
    protected void onDestroy() {
        super.onDestroy();
        // 或者下面這種方式
        //System.exit(0);
        //建議用這種
        android.os.Process.killProcess(android.os.Process.myPid());
    }


        public void tourist(View view) {

        Intent intent = new Intent(this, MainActivity1.class);
        startActivity(intent);
    }


    public void signinMethod(View view) {
        Toast.makeText(this, "登入方法尚未開放 請遊客試玩", Toast.LENGTH_SHORT).show();
    }

    public void signupMethod(View view) {
        Toast.makeText(this,"註冊方法尚未開放 請遊客試玩",Toast.LENGTH_SHORT).show();
    }
}