package com.appian.game.card.french;

import com.appian.game.card.RankSuitCard;

import java.util.Collection;
import java.util.EnumSet;

/**
 * @see <a href=https://en.wikipedia.org/wiki/Standard_52-card_deck>standard deck description</a>
 */
public enum Card52 implements RankSuitCard<CardRank13, CardSuit4> {

    ACE_CLUB(CardRank13.ACE, CardSuit4.CLUB),
    R2_CLUB(CardRank13.R2, CardSuit4.CLUB),
    R3_CLUB(CardRank13.R3, CardSuit4.CLUB),
    R4_CLUB(CardRank13.R4, CardSuit4.CLUB),
    R5_CLUB(CardRank13.R5, CardSuit4.CLUB),
    R6_CLUB(CardRank13.R6, CardSuit4.CLUB),
    R7_CLUB(CardRank13.R7, CardSuit4.CLUB),
    R8_CLUB(CardRank13.R8, CardSuit4.CLUB),
    R9_CLUB(CardRank13.R9, CardSuit4.CLUB),
    R10_CLUB(CardRank13.R10, CardSuit4.CLUB),
    JACK_CLUB(CardRank13.JACK, CardSuit4.CLUB),
    QUEEN_CLUB(CardRank13.QUEEN, CardSuit4.CLUB),
    KING_CLUB(CardRank13.KING, CardSuit4.CLUB),

    ACE_DIAMOND(CardRank13.ACE, CardSuit4.DIAMOND),
    R2_DIAMOND(CardRank13.R2, CardSuit4.DIAMOND),
    R3_DIAMOND(CardRank13.R3, CardSuit4.DIAMOND),
    R4_DIAMOND(CardRank13.R4, CardSuit4.DIAMOND),
    R5_DIAMOND(CardRank13.R5, CardSuit4.DIAMOND),
    R6_DIAMOND(CardRank13.R6, CardSuit4.DIAMOND),
    R7_DIAMOND(CardRank13.R7, CardSuit4.DIAMOND),
    R8_DIAMOND(CardRank13.R8, CardSuit4.DIAMOND),
    R9_DIAMOND(CardRank13.R9, CardSuit4.DIAMOND),
    R10_DIAMOND(CardRank13.R10, CardSuit4.DIAMOND),
    JACK_DIAMOND(CardRank13.JACK, CardSuit4.DIAMOND),
    QUEEN_DIAMOND(CardRank13.QUEEN, CardSuit4.DIAMOND),
    KING_DIAMOND(CardRank13.KING, CardSuit4.DIAMOND),

    ACE_HEART(CardRank13.ACE, CardSuit4.HEART),
    R2_HEART(CardRank13.R2, CardSuit4.HEART),
    R3_HEART(CardRank13.R3, CardSuit4.HEART),
    R4_HEART(CardRank13.R4, CardSuit4.HEART),
    R5_HEART(CardRank13.R5, CardSuit4.HEART),
    R6_HEART(CardRank13.R6, CardSuit4.HEART),
    R7_HEART(CardRank13.R7, CardSuit4.HEART),
    R8_HEART(CardRank13.R8, CardSuit4.HEART),
    R9_HEART(CardRank13.R9, CardSuit4.HEART),
    R10_HEART(CardRank13.R10, CardSuit4.HEART),
    JACK_HEART(CardRank13.JACK, CardSuit4.HEART),
    QUEEN_HEART(CardRank13.QUEEN, CardSuit4.HEART),
    KING_HEART(CardRank13.KING, CardSuit4.HEART),

    ACE_SPADE(CardRank13.ACE, CardSuit4.SPADE),
    R2_SPADE(CardRank13.R2, CardSuit4.SPADE),
    R3_SPADE(CardRank13.R3, CardSuit4.SPADE),
    R4_SPADE(CardRank13.R4, CardSuit4.SPADE),
    R5_SPADE(CardRank13.R5, CardSuit4.SPADE),
    R6_SPADE(CardRank13.R6, CardSuit4.SPADE),
    R7_SPADE(CardRank13.R7, CardSuit4.SPADE),
    R8_SPADE(CardRank13.R8, CardSuit4.SPADE),
    R9_SPADE(CardRank13.R9, CardSuit4.SPADE),
    R10_SPADE(CardRank13.R10, CardSuit4.SPADE),
    JACK_SPADE(CardRank13.JACK, CardSuit4.SPADE),
    QUEEN_SPADE(CardRank13.QUEEN, CardSuit4.SPADE),
    KING_SPADE(CardRank13.KING, CardSuit4.SPADE);

    private final CardRank13 rank;
    private final CardSuit4 suit;

    Card52(CardRank13 rank, CardSuit4 suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * Returns the <tt>EnumSet</tt> for this class.
     */
    public static Collection<Card52> getCards() {
        return EnumSet.allOf(Card52.class);
    }

    @Override
    public CardRank13 getRank() {
        return rank;
    }

    @Override
    public CardSuit4 getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        // Note camelcase looks bad when rank is a number.  7
        return rank.toString() + "_of_" + suit.toString() + "s";
    }

}
