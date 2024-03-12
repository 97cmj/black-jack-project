package org.example.domain;

public record Card(Pattern pattern, Denomination denomination) {

    @Override
    public String toString() {
        return  pattern.getValue() + " " + denomination.getPoint();
    }

}
