package org.example.domain;

import java.util.List;
import java.util.Stack;

//Dealer와 Gamer 공통점을 추상화한 인터페이스
public interface Player {

    //카드를 뽑는다.
    Card drawCard(CardDeck cardDeck);

    //카드를 오픈한다.
    List<Card> openCards();




}
