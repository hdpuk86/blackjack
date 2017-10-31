package com.example.jamie.blackjack;

import java.util.ArrayList;

/**
 * Created by jamie on 31/10/2017.
 */

public class BlackjackUI {
  public void goesBust(Player player) {
    System.out.println("\n" + player.name + " goes bust." + "\n");
  }

  public void twisted(Player player) {
    System.out.println(player.name + " twisted.\n");
  }

  public void stuck(Player player) {
    System.out.println(player.name + " stuck.\n");
  }

  public void blackjack(Player player) {
    System.out.println("Blackjack!");
    System.out.println("\n" + player.name + " wins!");
  }

  public void allBust() {
    System.out.println("You're all bust. Dealer wins!");
  }

  public void wins(Player player) {
    System.out.println(player.name + " wins!");
  }

  public void printMultipleWinners(ArrayList<Player> winners) {
    for(Player player : winners) {
      System.out.println(player.name + " wins!");
    }
  }

  public void printScores(ArrayList<Player> players) {
    ArrayList<String> scores = new ArrayList<>();

    for(Player player : players) {
      scores.add(player.name + " scored: " + player.totalHand());
    }
    for(String playerScore : scores) {
      System.out.println(playerScore);
    }

  }

  public void printDealerTopCard(Dealer dealer) {
    System.out.println("Dealer's face-up card is:");
    Card card = dealer.hand.get(1);
    System.out.println(card.getRank() + " of " + card.getSuit() + "\n");
  }

  public void printHand(Player player) {
    System.out.println(player.name + "'s cards are:");
    for (Card card : player.hand) {
      System.out.println(card.getRank() + " of " + card.getSuit());
    }
  }

}
