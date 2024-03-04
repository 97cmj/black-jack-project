package org.example.domain;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CardDeckTest {

    private static CardDeck cardDeck;
    private static List<Card> cards;

    @BeforeAll
    public static void setup() {
        cardDeck = new CardDeck();
        cards = cardDeck.getCards();
    }

    @Test
    public void test_denomination_포인트확인() {

        assertEquals(Denomination.A.getPoint(), 1);
        assertEquals(Denomination.K.getPoint(), 13);

    }

    @Test
    public void test_카드덱생성() {
        assertEquals(cards.size(), 52);
    }

}