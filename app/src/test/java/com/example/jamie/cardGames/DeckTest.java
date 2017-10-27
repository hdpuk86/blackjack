package com.example.jamie.cardGames;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by jamie on 26/10/2017.
 */

public class DeckTest {
  Deck deck;

  @Before
  public void before() {
    deck = new Deck();
  }

  @Test
  public void contains52Cards() {
    assertEquals(52, deck.cards.size());
  }

  @Test
  public void firstCardBeatsSecond() {
    assertEquals(1, deck.cards.get(0).beats(deck.cards.get(1)));
  }

  @Test
  public void canShuffleCards() {
    Card firstCard = deck.cards.get(0);
    deck.shuffle();
    Card newFirstCard = deck.cards.get(0);
    assertNotEquals(firstCard, newFirstCard);
  }

  @Test
  public void canDealCard() {
    assertEquals(Card.class, deck.deal().getClass());
  }

  @Test
  public void canDealTwoCards() {
    ArrayList<Card> hand = new ArrayList<>();
    hand.add(deck.deal());
    hand.add(deck.deal());
    assertEquals(Card.class, hand.get(0).getClass());
    assertEquals(Card.class, hand.get(1).getClass());
  }

  @Test
  public void deckGetsSmaller() {
    assertEquals(52, deck.cards.size());
    deck.deal();
    deck.deal();
    assertEquals(50, deck.cards.size());
  }
}
