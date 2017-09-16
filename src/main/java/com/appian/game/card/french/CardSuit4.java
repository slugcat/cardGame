package com.appian.game.card.french;

/**
 * Represent the suit of a card in a standard 52 card deck.
 */
public enum CardSuit4 {
    CLUB("Club"), DIAMOND("Diamond"), HEART("Heart"), SPADE("Spade");

    final String name;

    CardSuit4(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
