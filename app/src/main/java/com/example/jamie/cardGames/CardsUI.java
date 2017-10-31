package com.example.jamie.cardGames;

import java.sql.SQLOutput;

/**
 * Created by jamie on 26/10/2017.
 */

public class CardsUI {
  public void printCard(Card card) {
    System.out.println("a " + card.getRank() + " of " + card.getSuit());
  }

  public void printPlayerForCard(Player player) {
    System.out.print(player.name + "'s card is ");
  }

  public void printTotal(Player player) {
    System.out.println(player.name + "'s total is " + player.totalHand());
  }

  public void printNameRequest(String number) {
    System.out.println("Player " + number + "'s name?");
  }

  public void printSingleNameRequest() {
    System.out.println("Player's name?");
  }

  public void printBlankLine() {
    System.out.println("");
  }

  public void printNoCards() {
    System.out.println("You've not got enough cards left for that.");
  }

  public void printWin(Player winner) {
    System.out.println(winner.name + " is the winner!");
  }

  public void printHand(Player player) {
    System.out.println(player.hand);
  }

}
