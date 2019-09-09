package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.view.View.*;

public class ButtonMainActivity extends AppCompatActivity {

    private Button buttonCn,buttonEn;
    private android.widget.TextView textViewHelloWorld;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_main);

        buttonCn=this.findViewById(R.id.button_cn);
        buttonEn=this.findViewById(R.id.button_en);

        textViewHelloWorld=this.findViewById(R.id.helloworld_cnen);

        buttonCn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                textViewHelloWorld.setText(buttonCn.getText());
             }
        });
        buttonEn.setOnClickListener (new ButtonCnOnClick());
    }


    private class ButtonCnOnClick implements OnClickListener {
        @Override
        public void onClick(View view) {
            textViewHelloWorld.setText(((Button)view).getText());
        }
    }
}
