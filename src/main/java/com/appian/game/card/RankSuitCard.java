package com.appian.game.card;

/**
 * This class represents a card that has both a rank and a suit.
 *
 * @param <R> the rank
 * @param <S> the suit
 */
public interface RankSuitCard<R, S> {
    /**
     * Returns the rank of a card
     */
    R getRank();

    /**
     * Returns the suit of a card
     */
    S getSuit();
}
