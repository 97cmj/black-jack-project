package org.example.domain;

import java.util.ArrayList;
import java.util.List;

public class Gamer implements Player {

    private List<Card> hand;

    public Gamer() {
        this.hand = new ArrayList<>();
    }

    @Override
    public Card drawCard(CardDeck cardDeck) {
        Card card = cardDeck.draw();
        hand.add(card);
        return card;
    }

    @Override
    public List<Card> openCards() {
        return hand;
    }
}
