package com.appian.game.card.french;

/**
 * This class is provisional, since not specified by architect.
 */
public enum JokerSuit {
    RED("Red"), BLACK("Black");

    private final String name;

    JokerSuit(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
