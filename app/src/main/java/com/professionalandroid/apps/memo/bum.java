package com.professionalandroid.apps.memo;

import android.app.AppComponentFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class bum extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnsave = findViewById(R.id.btn_save);
        btnsave.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                final TextView text_save = findViewById(R.id.text_save);
                final EditText edit_edit = findViewById(R.id.edit_edit);
                text_save.setText(edit_edit.getText());


            }
        });


        
    }
}
