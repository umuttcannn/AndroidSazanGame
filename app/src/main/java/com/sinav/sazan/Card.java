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

    public String getCard_name() {
        return card_name;
    }

    public void setCard_name(String card_name) {
        this.card_name = card_name;
    }

    public List<String> getCards() {
        return cards;
    }

    public void setCards(List<String> cards) {
        this.cards = cards;
    }
}
