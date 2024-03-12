package org.example.domain;

import java.util.List;

public class Dealer implements Player {
    private final CardDeck cardDeck;

    public Dealer(CardDeck cardDeck) {
        this.cardDeck = cardDeck;
    }

    @Override
    public Card drawCard(CardDeck cardDeck) {
        return cardDeck.draw();
    }

    @Override
    public List<Card> openCards() {
        return null;
    }
}
