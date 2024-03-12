package org.example.domain;

public enum Pattern {

    SPADE("스페이드"),
    HEART("하트"),
    DIAMOND("다이아몬드"),
    CLUB("클로버");

    private String value;

    Pattern(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
