package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView textViewHelloWorld;//定义了一个TextView组件
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewHelloWorld=findViewById(R.id.text_view_hello_world); //在actibity_main中通过@+id在R.java文件中自动生成了int型变量text_view_hello_world
        textViewHelloWorld.setText("你好Android！");
    }
}
