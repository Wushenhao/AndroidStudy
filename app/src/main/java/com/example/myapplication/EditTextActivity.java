package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EditTextActivity extends AppCompatActivity {

    private Button buttonChange;
    private TextView textViewLanguage;
    private TextView editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        textViewLanguage=this.findViewById(R.id.text_view_language);
        editText = this.findViewById(R.id.edit_text_country);
        buttonChange = (Button)this.findViewById(R.id.button_change_language);  //一定要转换为Button，不然OnClickListener不会生效

        //添加点击事件
        buttonChange.setOnClickListener(new MyOnClickListener());

    }

    private class MyOnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            String my_string = editText.getText().toString();

            switch (my_string) {
                case "cn":
                    textViewLanguage.setText(getString(R.string.language_cn));
                    buttonChange.setText(getString(R.string.change_language_cn));
                    break;
                case "en":
                    textViewLanguage.setText(getString(R.string.language_en));
                    buttonChange.setText(getString(R.string.change_language_en));
                    break;
                case "jp":
                    textViewLanguage.setText(getString(R.string.language_jp));
                    buttonChange.setText(getString(R.string.change_language_jp));
                    break;
                case "kr":
                    textViewLanguage.setText(getString(R.string.language_kr));
                    buttonChange.setText(getString(R.string.change_language_kr));
                    break;
            }
        }
    }
}
