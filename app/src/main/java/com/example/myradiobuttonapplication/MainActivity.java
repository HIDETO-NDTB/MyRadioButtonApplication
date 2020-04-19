package com.example.myradiobuttonapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // idがgroupのRadioGroupを取得
        radioGroup =findViewById(R.id.group);
        // radioGroupの選択値が変更された時の処理を設定
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            public void onCheckedChanged(RadioGroup group, int checkedId){
                // checkedIdには選択された項目のidがわたってくるので、そのidのRadioButtonを取得
                radioButton = findViewById(checkedId);
                // 表示する文字列を選択値によって変える
                String displayChar = "";
                switch (checkedId){
                    case R.id.radio_yes:
                        displayChar = "Yes Clicked";
                        break;
                    case R.id.radio_no:
                        displayChar = "No Clicked";
                        break;
                }
                Toast.makeText(MainActivity.this, displayChar, Toast.LENGTH_SHORT).show();

            }
        });

    }

}
