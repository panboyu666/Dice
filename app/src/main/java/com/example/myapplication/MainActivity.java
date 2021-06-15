package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private Button buttonsignin,buttonsignup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonsignin =findViewById(R.id.signin);
        buttonsignup =findViewById(R.id.signup);
    }


    public void buttonchangein(View view) {
        Toast.makeText(this, "你點選了登入", Toast.LENGTH_SHORT).show();
    }

    public void buttonchangeup(View view) {
        Toast.makeText(this, "你點選了註冊", Toast.LENGTH_SHORT).show();
    }

}