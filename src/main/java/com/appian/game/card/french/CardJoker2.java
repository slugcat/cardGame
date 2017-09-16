package com.appian.game.card.french;

import com.appian.game.card.RankSuitCard;

import java.util.Collection;
import java.util.EnumSet;

/**
 * This class is provisional, since not specified by architect.
 */
public enum CardJoker2 implements RankSuitCard<JokerRank, JokerSuit> {
    BLACK(JokerSuit.BLACK), RED(JokerSuit.RED);

    private final JokerRank rank = JokerRank.JOKER;
    private final JokerSuit suit;

    CardJoker2(JokerSuit suit) {
        this.suit = suit;
    }

    /**
     * Returns the <tt>EnumSet</tt> for this class.
     */
    public static Collection<CardJoker2> getCards() {
        return EnumSet.allOf(CardJoker2.class);
    }

    @Override
    public JokerRank getRank() {
        return rank;
    }

    @Override
    public JokerSuit getSuit() {
        return suit;
    }
}


