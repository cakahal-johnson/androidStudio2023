package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntentClass extends AppCompatActivity {

    Button btn, btnWeb, btn_dail, btn_sms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_class);

        btn = findViewById(R.id.btn);
        btnWeb = findViewById(R.id.btnWeb);
        btn_dail = findViewById(R.id.btn_dail);
        btn_sms = findViewById(R.id.btn_sms);

// here is for the Intent class
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IntentClass.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        // here is for the web btn
        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
                startActivity(intent);
            }
        });

        // here for dail btn
        btn_dail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:07062119521"));
                startActivity(intent);
            }
        });

        // here for the sms btn
        btn_sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                intent.setType("vnd.android-dir/mms-sms");
                intent.putExtra("sms_body", "Hi there! Java is awesome");
                intent.setData(Uri.parse("sms:0706119521"));

                startActivity(intent);
//                finish();
            }
        });


    }
}