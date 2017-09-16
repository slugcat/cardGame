package com.appian.game.card.french;

import com.appian.game.card.CardDeckBase;
import com.appian.game.card.RankSuitCard;

import java.util.*;

/**
 * This class implements a standard 52 card deck plus two jokers.<p>
 *
 * This class is provisional pending architect approval as it was not specified.  It exists because some mechanism of
 * having jokers will probably be needed, and it serves as a demonstration for how to make fancier decks with added
 * kinds of cards, duplicates of cards, and removed cards all of with are used by some popular card games.<p>
 *
 * It isn't clear whether is is better to have an entirely distinct 54 card enum, with 15 ranks and 6 suits.
 */
public class CardDeck54 extends CardDeckBase<RankSuitCard> {

    private static final Collection<RankSuitCard> cards = makeCards();

    public CardDeck54() {
        this(new Random());
    }

    public CardDeck54(Random rand) {
        super(cards, rand);
    }

    private static Collection<RankSuitCard> makeCards() {
        List<RankSuitCard> retval = new ArrayList<>(Card52.getCards());
        retval.addAll(CardJoker2.getCards());
        return Collections.unmodifiableList(retval);
    }
}
