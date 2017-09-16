package com.appian.game.card;

import java.util.List;
import java.util.Optional;

/**
 * A deck is a stack of objects, typically playing cards.  It exists to support a deck of cards that have not entered
 * play.  In some games there may be duplicate cards (Russian Bank, Magic the Gathering).  In some games all the cards
 * are of the same leaf type (e.g., Hearts uses only standard French 52 cards).  In some games all the cards of a leaf
 * type are in the deck at start of play (e.g., Uno, French).  In others (Pokemon, Euchre) a deck starts with a subset
 * of cards. None of this is prohibited by this interface.<p>
 *
 * This interface allows multiple occurrences of the same card.
 */
public interface CardDeck<C> {

    /**
     * Returns an unmodifiable view of the cards in the deck.
     */
    List<C> getUnmodifiableCards();

    /**
     * Returns the top card of the deck.
     *
     * @throws IndexOutOfBoundsException if deck is empty.
     * @see #dealOneCard()
     */
    C pop();

    /**
     * Rearanges the deck to be in a random order.
     */
    void shuffle();

    /**
     * Pops the top card off the deck in a null-safe way.
     *
     * Returns the top card on the deck, or an empty <tt>Optional</tt> if the deck is empty.
     *
     * @see #pop()
     */
    Optional<C> dealOneCard();
}
