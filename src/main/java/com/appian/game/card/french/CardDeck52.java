package com.appian.game.card.french;

import com.appian.game.card.CardDeckBase;

import java.util.Random;

public class CardDeck52 extends CardDeckBase<Card52> {

    CardDeck52() {
        this(new Random());
    }

    CardDeck52(Random rand) {
        super(Card52.getCards(), rand);
    }

}
