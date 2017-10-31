package com.example.jamie.cardGames;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jamie on 31/10/2017.
 */

public class BlackjackRunner {
  public static void main(String[] args) {
    Deck deck = new Deck();
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the number of players");
    int numPlayers = Integer.parseInt(scan.nextLine());

    ArrayList<Player> playerArray = new ArrayList<>();
    for (int i = 1; i <= numPlayers; i++) {
      System.out.println("What's your name player " + i + "?");
      playerArray.add(new Player(scan.nextLine()));
    }
    playerArray.add(new Dealer(deck));

    BlackjackGame game = new BlackjackGame(playerArray);

    game.start();
  }
}
