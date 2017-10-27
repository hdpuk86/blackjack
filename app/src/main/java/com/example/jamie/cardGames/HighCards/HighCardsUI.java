package com.example.jamie.cardGames.HighCards;

import com.example.jamie.cardGames.CardsUI;

/**
 * Created by jamie on 26/10/2017.
 */

public class HighCardsUI extends CardsUI {
  public void printHighCardsPrompt() {
    System.out.println("Type a number to pick hand size, or q to quit.");
  }

  public void printNaN() {
    System.out.println("That's not a number or a q.");
  }
}
