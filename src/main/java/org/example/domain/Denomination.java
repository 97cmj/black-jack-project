package org.example.domain;

public enum Denomination {
    A("A", 1),
    TWO("2", 2),
    THREE("3", 3),
    FOUR("4", 4),
    FIVE("5", 5),
    SIX("6", 6),
    SEVEN("7", 7),
    EIGHT("8", 8),
    NINE("9", 9),
    TEN("10", 10),
    J("J", 11),
    Q("Q", 12),
    K("K", 13);

    private String mark;
    private int point;

    Denomination(String mark, int point) {
        this.mark = mark;
        this.point = point;
    }

    public int getPoint() {
        return point;
    }
}
