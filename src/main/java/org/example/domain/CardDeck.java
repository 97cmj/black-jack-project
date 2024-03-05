package org.example.domain;

import java.util.Collections;
import java.util.Stack;

public class CardDeck {
    private final Stack<Card> cards;

    /*
     * 카드덱을 생성하고 카드를 섞는다.
     */
    public CardDeck() {
        cards = this.generateCards();
        Collections.shuffle(this.cards);
    }

    /*
     * 카드를 생성한다.
     */
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