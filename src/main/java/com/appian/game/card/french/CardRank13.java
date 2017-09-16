package com.appian.game.card.french;

/**
 * Represent the rank of a card in a standard 52 card deck.
 */
public enum CardRank13 {
    // Forgoing the (admittedly strong) temptation to use unicode chars for suits, ranks or cards, because it would
    // impose unneeded pain on users/developers who want to edit text files with card stuff in them.
    ACE("Ace"), R2("2"), R3("3"), R4("4"), R5("5"), R6("6"), R7("7"), R8("8"), R9("9"), R10("10"),
    JACK("Jack"), QUEEN("Queen"), KING("King");

    private final String name;

    CardRank13(String displayName) {
        this.name = displayName;
    }

    @Override
    public String toString() {
        return name;
    }
}
