package com.sinav.sazan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutAcitivity extends AppCompatActivity {
    Button aboutToMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_acitivity);

        aboutToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( AboutAcitivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}