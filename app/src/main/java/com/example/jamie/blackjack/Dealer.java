package com.example.jamie.blackjack;

import java.util.Scanner;

/**
 * Created by jamie on 31/10/2017.
 */

public class Dealer extends Player {
  private Deck deck;

  public Dealer(Deck deck) {
    super("Dealer");
    this.deck = deck;
    shuffle();
  }

  public void shuffle() {
    deck.shuffle();
  }

  public Card deal() {
    return deck.deal();
  }

  @Override
  public boolean stickOrTwist(Scanner sc) {
    if (totalHand() > 15) {
      return false;
    } else {
      return true;
    }
  }

}
