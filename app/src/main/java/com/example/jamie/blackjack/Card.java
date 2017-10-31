package com.example.jamie.blackjack;

/**
 * Created by jamie on 26/10/2017.
 */

public class Card {
  private Suit suit;
  private Rank rank;

  Card(Suit suit, Rank rank) {
    this.suit = suit;
    this.rank = rank;
  }

  public Suit getSuit() {
    return suit;
  }

  public Rank getRank() {
    return rank;
  }

  public int getValue() {
    return rank.getValue();
  }

  public int beats(Card otherCard) {
    int thisCardValue = this.rank.getValue();
    int otherCardValue = otherCard.rank.getValue();

    if (thisCardValue > otherCardValue) {
      return 1;
    } else if (thisCardValue < otherCardValue) {
      return -1;
    } else {
      return 0;
    }
  }
}
