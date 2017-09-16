package com.appian.game.card.french;

/**
 * This class is provisional, since not specified by architect.
 */
public enum JokerRank {
    JOKER;

    private final String name = "Joker";

    JokerRank() {
    }

    @Override
    public String toString() {
        return name;
    }

}
