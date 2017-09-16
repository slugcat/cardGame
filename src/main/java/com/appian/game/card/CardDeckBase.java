package com.appian.game.card;


import com.appian.util.collection.AppianCollectionUtils;

import java.util.*;

/**
 * This provides a base implementation of CardDeck.
 */
public abstract class CardDeckBase<C> implements CardDeck<C> {
    private final Random random;
    private final List<C> deck;

    protected CardDeckBase(Collection<C> cards, Random random) {
        deck = new ArrayList<>(cards);
        this.random = random;
    }

    @Override
    public List<C> getUnmodifiableCards() {
        return Collections.unmodifiableList(deck);
    }

    @Override
    public C pop() {
        return deck.remove(deck.size() - 1);
    }

    @Override
    public void shuffle() {
        AppianCollectionUtils.shuffle(deck, random);
    }

    @Override
    public Optional<C> dealOneCard() {
        if (deck.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(deck.remove(deck.size() - 1));
    }
}
