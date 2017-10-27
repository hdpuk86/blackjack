package com.example.jamie.cardGames.Pontoon;

import java.util.Scanner;

/**
 * Created by jamie on 26/10/2017.
 */

public class PontoonRunner {
  static PontoonUI ui = new PontoonUI();

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ui.printSingleNameRequest();
    String player = sc.nextLine();

    PontoonGame pontoonGame = new PontoonGame(player);

    boolean stillKeen = true;
    while (stillKeen) {
      ui.printHand(pontoonGame.players.get(1));
      ui.printPontoonPrompt();
      String input = sc.nextLine();

      stillKeen = playHand(input, pontoonGame, sc);
      ui.printBlankLine();
    }
  }

  private static boolean playHand(String input, PontoonGame pontoonGame, Scanner sc) {
    if (input.equals("stick")) {
      return false;
    } else if (input.equals("twist")) {

    }
    return true;
  }
}
