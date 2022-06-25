package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button result;
    EditText edt;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result=findViewById(R.id.button);
        edt=findViewById(R.id.editText);
        tv=findViewById(R.id.textView);

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double convert= Double.parseDouble(edt.getText().toString());
                tv.setText(String.valueOf(convert*100));               //Just put the formula here accordingly!!!
                tv.setTextColor(Color.RED);
            }
        });


    }
}