package com.appian.game.card.french;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Card52Test {

    @Test
    public void getCardsTest() throws Exception {
        List<Card52> expectedCards = Arrays.asList(
                Card52.ACE_CLUB,
                Card52.R2_CLUB,
                Card52.R3_CLUB,
                Card52.R4_CLUB,
                Card52.R5_CLUB,
                Card52.R6_CLUB,
                Card52.R7_CLUB,
                Card52.R8_CLUB,
                Card52.R9_CLUB,
                Card52.R10_CLUB,
                Card52.JACK_CLUB,
                Card52.QUEEN_CLUB,
                Card52.KING_CLUB,

                Card52.ACE_DIAMOND,
                Card52.R2_DIAMOND,
                Card52.R3_DIAMOND,
                Card52.R4_DIAMOND,
                Card52.R5_DIAMOND,
                Card52.R6_DIAMOND,
                Card52.R7_DIAMOND,
                Card52.R8_DIAMOND,
                Card52.R9_DIAMOND,
                Card52.R10_DIAMOND,
                Card52.JACK_DIAMOND,
                Card52.QUEEN_DIAMOND,
                Card52.KING_DIAMOND,

                Card52.ACE_HEART,
                Card52.R2_HEART,
                Card52.R3_HEART,
                Card52.R4_HEART,
                Card52.R5_HEART,
                Card52.R6_HEART,
                Card52.R7_HEART,
                Card52.R8_HEART,
                Card52.R9_HEART,
                Card52.R10_HEART,
                Card52.JACK_HEART,
                Card52.QUEEN_HEART,
                Card52.KING_HEART,

                Card52.ACE_SPADE,
                Card52.R2_SPADE,
                Card52.R3_SPADE,
                Card52.R4_SPADE,
                Card52.R5_SPADE,
                Card52.R6_SPADE,
                Card52.R7_SPADE,
                Card52.R8_SPADE,
                Card52.R9_SPADE,
                Card52.R10_SPADE,
                Card52.JACK_SPADE,
                Card52.QUEEN_SPADE,
                Card52.KING_SPADE
        );
        Assert.assertEquals(expectedCards, new ArrayList<>(Card52.getCards()));
    }

    @Test
    public void getSuitTest() throws Exception {
        Assert.assertEquals(Card52.ACE_CLUB.getSuit(), CardSuit4.CLUB);
        Assert.assertEquals(Card52.R2_DIAMOND.getSuit(), CardSuit4.DIAMOND);
        Assert.assertEquals(Card52.QUEEN_HEART.getSuit(), CardSuit4.HEART);
        Assert.assertEquals(Card52.KING_SPADE.getSuit(), CardSuit4.SPADE);
    }

    @Test
    public void getRankTest() throws Exception {
        Assert.assertEquals(Card52.JACK_CLUB.getRank(), CardRank13.JACK);
        Assert.assertEquals(Card52.R10_DIAMOND.getRank(), CardRank13.R10);
        Assert.assertEquals(Card52.QUEEN_HEART.getRank(), CardRank13.QUEEN);
        Assert.assertEquals(Card52.KING_SPADE.getRank(), CardRank13.KING);
    }

}