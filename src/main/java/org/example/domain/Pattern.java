package org.example.domain;

public enum Pattern {

    SPADE("spade"),
    HEART("heart"),
    DIAMOND("diamond"),
    CLUB("club");

    private String value;

    Pattern() {
    }

    Pattern(String value) {
        this.value = value;
    }
}
