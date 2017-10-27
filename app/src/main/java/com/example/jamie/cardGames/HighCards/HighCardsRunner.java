package com.example.jamie.cardGames.HighCards;

import java.util.Scanner;

/**
 * Created by jamie on 26/10/2017.
 */

public class HighCardsRunner {
  static HighCardsUI highCardsUi = new HighCardsUI();

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    highCardsUi.printNameRequest("1");
    String player1 = sc.nextLine();
    highCardsUi.printNameRequest("2");
    String player2 = sc.nextLine();

    HighCardsGame highCardsGame = new HighCardsGame(player1, player2);

    boolean stillKeen = true;
    while (stillKeen) {
      highCardsUi.printHighCardsPrompt();
      String input = sc.nextLine();

      stillKeen = playHand(input, highCardsGame, sc);
      highCardsUi.printBlankLine();
    }
  }

  private static boolean playHand(String input, HighCardsGame highCardsGame, Scanner sc) {
    if (input.equals("q")) {
      return false;
    } else {
      int handSize;
      try {
        handSize = Integer.parseInt(input);
      } catch (NumberFormatException e) {
        highCardsUi.printNaN();
        return true;
      }
      if (highCardsGame.deck.cards.size() < handSize * 2) {
        highCardsUi.printNoCards();
        return false;
      } else {
        highCardsGame.playHighCards(handSize);
        return true;
      }
    }
  }
}
