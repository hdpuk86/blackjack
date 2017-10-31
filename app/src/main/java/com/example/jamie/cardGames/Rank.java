package com.example.jamie.cardGames;

/**
 * Created by jamie on 26/10/2017.
 */

public enum Rank {
  ACE(11),
  KING(10),
  QUEEN(10),
  JACK(10),
  TEN(10),
  NINE(9),
  EIGHT(8),
  SEVEN(7),
  SIX(6),
  FIVE(5),
  FOUR(4),
  THREE(3),
  TWO(2);

  int value;

  Rank(int i) {
    this.value = i;
  }

  public int getValue() {
    return value;
  }
}
