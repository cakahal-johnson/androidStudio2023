package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button intent_btn, layout_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//            here is where we bind id
        intent_btn = findViewById(R.id.intent_btn);
        layout_btn = findViewById(R.id.layout_btn);

        // here is the layout intent class Btn
        layout_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, layoutClass.class);
                startActivity(intent);
            }
        });

//            here is the intent class Btn
        intent_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, IntentClass.class);
                startActivity(intent);
            }
        });
    }
}