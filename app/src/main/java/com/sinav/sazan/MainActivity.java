package com.sinav.sazan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mainPlayButton,mainRulesButton,mainAboutButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();

        mainRulesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RulesActivity.class);
                startActivity(intent);
            }
        });


    }

    private void tanimla() {
        mainAboutButton = findViewById(R.id.mainAboutButton);
        mainPlayButton = findViewById(R.id.mainPlayButton);
        mainRulesButton = findViewById(R.id.mainRulesButton);
    }
}