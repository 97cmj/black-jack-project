package org.example.domain;

import java.util.Collections;
import java.util.Stack;

public class CardDeck {
    private Stack<Card> cards;

    public CardDeck() {
        cards = this.generateCards();
        Collections.shuffle(this.cards);
    }

    private Stack<Card> generateCards() {
        Stack<Card> cards = new Stack<>();

        for (Pattern pattern : Pattern.values()) {
            for (Denomination denomination : Denomination.values()) {
                Card card = new Card(pattern, denomination);
                cards.push(card);
            }
        }

        return cards;
    }

    public Stack<Card> getCards() {
        return cards;
    }

    public Card draw() {
        return this.cards.pop();
    }
}