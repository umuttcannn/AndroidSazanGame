package com.sinav.sazan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class SelectionActivity extends AppCompatActivity {
    private Integer[] nofplayer={3,4,5,6,7,8,9,10,11,12,13,14,15};
    private Integer[] nofspy = {1,2,3,4,5,6};

    private ArrayAdapter<Integer> adapternofp;
    private ArrayAdapter<Integer> adapternofS;
    private int numberofPlayer,numberofSpy;

    Spinner spinnerNumberofPlayer,spinnerNumberofSpy;
    Button startButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        tanimla();

        adapternofp = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item, nofplayer);
        adapternofS = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item, nofspy);

        adapternofp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapternofS.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerNumberofPlayer.setAdapter(adapternofp);
        spinnerNumberofSpy.setAdapter(adapternofS);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectionActivity.this,GameActivity.class);
                intent.putExtra("numberofplayer",numberofPlayer);
                intent.putExtra("numberofspy",numberofSpy);
                startActivity(intent);
            }
        });

        spinnerNumberofSpy.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                numberofSpy = Integer.valueOf(parent.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinnerNumberofPlayer.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                numberofPlayer = Integer.valueOf(parent.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    private void tanimla() {
        spinnerNumberofPlayer = findViewById(R.id.spinnerNumberofPlayer);
        spinnerNumberofSpy = findViewById(R.id.spinnerNumberofSpy);
        startButton = findViewById(R.id.startButton);
    }
}