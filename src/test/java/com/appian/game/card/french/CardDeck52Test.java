package com.appian.game.card.french;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.*;

import static com.appian.game.card.french.Card52.*;

public class CardDeck52Test {

    @Rule
    public final ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shuffleTest() throws Exception {
        List<Card52> expectedCards = Arrays.asList(QUEEN_DIAMOND, ACE_DIAMOND, R8_SPADE, R5_CLUB, R7_HEART, R5_SPADE,
                R5_HEART, QUEEN_HEART, R9_HEART, R3_HEART, R5_DIAMOND, R3_DIAMOND, R10_DIAMOND, R3_CLUB, ACE_HEART,
                JACK_HEART, R9_SPADE, R10_HEART, R7_SPADE, KING_SPADE, R9_CLUB, KING_DIAMOND, R6_HEART, JACK_CLUB,
                R4_CLUB, R10_SPADE, R8_DIAMOND, R8_CLUB, R2_DIAMOND, R4_HEART, R10_CLUB, KING_HEART, R8_HEART,
                QUEEN_CLUB, R9_DIAMOND, ACE_CLUB, QUEEN_SPADE, JACK_DIAMOND, R4_DIAMOND, R6_SPADE, KING_CLUB,
                R3_SPADE, R6_CLUB, R2_SPADE, R2_HEART, JACK_SPADE, R6_DIAMOND, R7_CLUB, R7_DIAMOND, R4_SPADE,
                ACE_SPADE, R2_CLUB);
        CardDeck52 deck = new CardDeck52(new Random(17));
        deck.shuffle();
        List<Card52> cards = deck.getUnmodifiableCards();
        Assert.assertEquals(expectedCards, cards);
    }

    @Test
    public void dealTest() throws Exception {
        testDealAndPop(true);
    }

    @Test
    public void popTest() throws Exception {
        testDealAndPop(false);
    }

    @Test
    public void toStringTest() throws Exception {
        String expected = "[Ace_of_Clubs, 2_of_Clubs, 3_of_Clubs, 4_of_Clubs, 5_of_Clubs, 6_of_Clubs, 7_of_Clubs, 8_of_Clubs, 9_of_Clubs, 10_of_Clubs, Jack_of_Clubs, Queen_of_Clubs, King_of_Clubs, Ace_of_Diamonds, 2_of_Diamonds, 3_of_Diamonds, 4_of_Diamonds, 5_of_Diamonds, 6_of_Diamonds, 7_of_Diamonds, 8_of_Diamonds, 9_of_Diamonds, 10_of_Diamonds, Jack_of_Diamonds, Queen_of_Diamonds, King_of_Diamonds, Ace_of_Hearts, 2_of_Hearts, 3_of_Hearts, 4_of_Hearts, 5_of_Hearts, 6_of_Hearts, 7_of_Hearts, 8_of_Hearts, 9_of_Hearts, 10_of_Hearts, Jack_of_Hearts, Queen_of_Hearts, King_of_Hearts, Ace_of_Spades, 2_of_Spades, 3_of_Spades, 4_of_Spades, 5_of_Spades, 6_of_Spades, 7_of_Spades, 8_of_Spades, 9_of_Spades, 10_of_Spades, Jack_of_Spades, Queen_of_Spades, King_of_Spades]";
        Assert.assertEquals(expected, new CardDeck52().getUnmodifiableCards().toString());
    }

    private void testDealAndPop(boolean isDeal) {
        CardDeck52 deck = new CardDeck52();
        List<Card52> cards = deck.getUnmodifiableCards();
        List<Card52> expectedCards = new ArrayList<>(cards);
        Collections.reverse(expectedCards);
        List<Card52> actualCards = new ArrayList<>(52);

        // Up to the end should get a card

        for (int i = 0; cards.size() > 0; ++i) {
            if (isDeal) {
                Optional<Card52> optCard = deck.dealOneCard();
                Assert.assertTrue("the " + i + "th card should be present", optCard.isPresent());
                actualCards.add(optCard.get());
            } else {
                actualCards.add(deck.pop());
            }
        }
        Assert.assertEquals(expectedCards, actualCards);
        if (isDeal) {
            Assert.assertFalse("the after last card should not be present", deck.dealOneCard().isPresent());
        } else {
            expectedException.expect(IndexOutOfBoundsException.class);
            deck.pop();
        }
    }
}