package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView textViewHelloWorld;//定义了一个组件
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewHelloWorld=findViewById(R.id.text_view_hello_world);
        textViewHelloWorld.setText("你好！你好！");
    }
}
