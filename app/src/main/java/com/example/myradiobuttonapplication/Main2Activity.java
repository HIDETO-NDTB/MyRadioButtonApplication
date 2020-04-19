package com.example.myradiobuttonapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Main2Activity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    Button button;

    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        radioGroup = findViewById(R.id.group);

        button = findViewById(R.id.btn_submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                id = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(id);


                switch (id) {
                    case R.id.radio_yes:
                        Intent intent = new Intent(Main2Activity.this, LoginActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.radio_no:
                        Intent intent2 = new Intent(Main2Activity.this, RegisterActivity.class);
                        startActivity(intent2);
                        break;
                }
            }
        });
    }
}
