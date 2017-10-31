package com.example.jamie.cardGames;

/**
 * Created by jamie on 31/10/2017.
 */

public class BlackjackUI {
  public void goesBust(Player player) {
    System.out.println("\n" + player.name + " goes bust.\n");
  }

  public void twisted(Player player) {
    System.out.println(player.name + " twisted.\n");
  }

  public void stuck(Player player) {
    System.out.println(player.name + " stuck.\n");
  }

  public void blackjack(Player player) {
    System.out.println("Blackjack!");
    System.out.println(player.name + " wins!");
  }

  public void allBust() {
    System.out.println("You're all bust.");
  }

  public void playerBust() {
    System.out.println("You were bust. Dealer wins. You suck.");
  }

  public void dealerBust(Player player) {
    System.out.println("Dealer went bust. " + player.name + " wins!");
  }

  public void wins(Player player) {
    System.out.println(player.name + " wins!");
  }

  public void printScore(Player player, Dealer dealer) {
    System.out.println(player.name + "'s hand:");
    for (Card card : player.hand) {
      System.out.println(card.getRank() + " of " + card.getSuit());
    }
    System.out.println("\nDealer's hand:");
    for (Card card : dealer.hand) {
      System.out.println(card.getRank() + " of " + card.getSuit());
    }
    System.out.println("\nPlayer " + player.totalHand() + " : " + dealer.totalHand() + " Dealer\n");
  }

}
