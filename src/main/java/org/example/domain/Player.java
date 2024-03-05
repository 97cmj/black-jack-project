package org.example.domain;

//Dealer와 Gamer 공통점을 추상화한 인터페이스
public interface Player {

    //카드를 뽑는다.
    void drawCard(CardDeck cardDeck);

    //카드를 오픈한다.
    void openCards();




}
