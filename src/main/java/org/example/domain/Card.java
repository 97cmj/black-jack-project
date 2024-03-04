package org.example.domain;

public class Card {
    private final Pattern pattern;
    private final Denomination denomination;

    public Card(Pattern pattern, Denomination denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public Pattern getPattern() {
        return pattern;
    }

    public Denomination getDenomination() {
        return denomination;
    }


    @Override
    public String toString() {
        return pattern + " " + denomination;
    }
}
