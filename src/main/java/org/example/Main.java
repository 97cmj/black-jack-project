package org.example;

import org.example.domain.Card;
import org.example.domain.CardDeck;
import org.example.domain.Dealer;
import org.example.domain.Gamer;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        CardDeck cardDeck = new CardDeck();
        System.out.println("덱이 완성되었습니다.");

        Gamer gamer = new Gamer();
        Card gamerCard = gamer.drawCard(cardDeck);

        System.out.println("첫번째 카드 : " + gamerCard);

        Card gamerCard2 = gamer.drawCard(cardDeck);

        System.out.println("두번째 카드 : " + gamerCard2);

        System.out.println("게이머 카드 오픈 : " + gamer.openCards());


    }
}