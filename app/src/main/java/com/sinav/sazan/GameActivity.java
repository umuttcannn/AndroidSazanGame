package com.sinav.sazan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Random;

public class GameActivity extends AppCompatActivity {

    private int numberofPlayer,numberofSpy;
    Button gameButton;
    int i = 0;
    private boolean aBoolean = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Random r=new Random(); //random sınıfı

        gameButton = findViewById(R.id.gameButton);

        final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);

        Intent intent = getIntent();
        numberofPlayer = intent.getExtras().getInt("numberofplayer");
        numberofSpy = intent.getExtras().getInt("numberofspy");

        String[] cards = getResources().getStringArray(R.array.card1);

        int c=r.nextInt(cards.length);
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (numberofSpy>0)
        {
            int a=r.nextInt(numberofPlayer);
            arrayList.add(a);
            numberofSpy--;
        }

        int b=r.nextInt(numberofPlayer);// 10 dahil değil

        //butonu kapatma
        gameButton.setAlpha(1);
        gameButton.setText("TAP TO START");

        gameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aBoolean==false)
                {
                    if(numberofPlayer>0)
                    {

                        if(arrayList.contains(i)){
                            gameButton.setText("YOU ARE CARP");
                        }
                        else{
                            gameButton.setText(cards[c]);
                        }
                        v.setAlpha(1);
                        aBoolean=true;
                        i++;
                        numberofPlayer--;
                    }
                    else{
                        v.setAlpha(1);
                        gameButton.setText("LET THE CARP HUNT BEGİN");
                    }

                }
                else{
                    v.setAlpha(0);
                    aBoolean=false;

                }

            }
        });

    }
}