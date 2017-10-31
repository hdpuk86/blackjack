package com.example.jamie.blackjack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by jamie on 26/10/2017.
 */

public class CardTest {
  Card card;
  Card sameValueCard;
  Card lowerValueCard;
  Card higherValueCard;

  @Before
  public void before() {
    card = new Card(Suit.HEARTS, Rank.KING);
    sameValueCard = new Card(Suit.CLUBS, Rank.KING);
    lowerValueCard = new Card(Suit.CLUBS, Rank.QUEEN);
    higherValueCard = new Card(Suit.CLUBS, Rank.ACE);
  }

  @Test
  public void testSameValue() {
    assertEquals(0, sameValueCard.beats(card));
  }

  @Test
  public void testLowerValue() {
    assertEquals(1, card.beats(lowerValueCard));
  }

  @Test
  public void testHigherValue() {
    assertEquals(-1, card.beats(higherValueCard));
  }
}
