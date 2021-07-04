package com.sinav.sazan;

import java.util.ArrayList;
import java.util.List;

public class Card {
    String card_name;
    List<String> cards = new ArrayList<String>();

    public Card(String card_name, List<String> cards) {
        this.card_name = card_name;
        this.cards = cards;
    }
}
