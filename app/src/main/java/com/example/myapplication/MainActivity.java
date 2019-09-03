package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView textViewHelloWorld; //定义TextView控件
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //通过id找到TextView控件对象;findViewById()从已有的xml布局文件中提取已经写好的View对象
        textViewHelloWorld=findViewById(R.id.text_view_hello_world); //在actibity_main中通过@+id在R.java文件中自动生成了int型变量R.id.text_view_hello_world,即View对象的id
        textViewHelloWorld.setText("你好Android！");

        //通过资源id获得字符串
        textViewHelloWorld.setText(this.getString(R.string.hello_world));

        //通过资源名获得字符串，如何通过"hello_world"获得R.string.hello_world
        Context context=this.getApplicationContext();
        String resName="hello_world";
        int helloWorldId=context.getResources().getIdentifier(resName,"string",context.getPackageName());
        textViewHelloWorld.setText(this.getString(helloWorldId));


    }
}
