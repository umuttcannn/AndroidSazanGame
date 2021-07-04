package com.sinav.sazan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class PlayActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Card> List = new ArrayList<Card>();
    ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        listView = findViewById(R.id.listView);
        List<String> cards = new ArrayList<String>();
        cards.add("galleria");
        cards.add("mies");
        cards.add("Bilkent");
        cards.add("ankuva");
        List<String> cards2 = new ArrayList<String>();
        cards2.add("asdasd");
        cards2.add("asd");
        cards2.add("fasfadsas");
        cards2.add("fasdasd");
        Card card1 = new Card("first card",cards);
        Card card2 = new Card("SecondCard",cards2);
        List.add(card1);
        List.add(card2);
        CardAdapter cardAdapter = new CardAdapter(this,R.layout.adapter_card,List);
        listView.setAdapter(cardAdapter);
    }
}