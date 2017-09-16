/**
 * Classes that represent playing cards.  These classes represent physical cards, but not the interpretations placed on
 * them (for example whether Aces are high).  The classes in this directory define interfaces for some commonly used
 * features like decks and suits, but it does not restrict cards to be poker/French style. Uno, Tarot or Magic the
 * Gathering cards could be modeled by implementing these classes.  Note not all cards are for playing games.  Sometimes
 * they are for telling fortunes, or doing magic tricks (though this last might not be very exciting in a
 * computer!).<p>
 *
 * There is currently no class or interface representing a card instance.  For example there are no distinct
 * <tt>Objects</tt> representing two occurrences of an Ace of Spades.  Two Aces of Spades would be represented by having
 * the one {@link com.appian.game.card.french.Card52#ACE_SPADE Ace of Spades} card more than once in the set of
 * collections which comprise the data model of a game.  For example in Russian Bank a deck is composed of two 52 card
 * decks.  So a, theoretical, <tt>RussianBankDeck</tt> would start with two copies of each card in {@link
 * com.appian.game.card.french.Card52 Card52}.
 */
package com.appian.game.card;
