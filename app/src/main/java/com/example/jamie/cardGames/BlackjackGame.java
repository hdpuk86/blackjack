package com.example.jamie.cardGames;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jamie on 31/10/2017.
 */

public class BlackjackGame {
  Player player;
  Dealer dealer;
  ArrayList<Player> players;
  Scanner sc = new Scanner(System.in);
  BlackjackUI ui = new BlackjackUI();

  Boolean isWon;

  public BlackjackGame(ArrayList<Player> players) {
    this.players = players;
    this.dealer = (Dealer) players.get(players.size() - 1);
    isWon = false;
  }


  public void start() {
    dealToAll();

    dealer.printTopCard();
    for (Player player : players) {
      evaluateHand(player);
    }
    compareHands();
  }

  private void dealToAll() {
    for (int i = 0; i < 2; i++) {
      for (Player player : players) {
        player.takeCard(dealer.deal());
      }
    }
  }

  private void evaluateHand(Player player) {
    player.printHand();

    if (checkBust(player)) {
      ui.goesBust(player);
      return;
    }

    if (player.stickOrTwist(sc)) {
      ui.twisted(player);
      twist(player);
    } else {
      ui.stuck(player);
    }
  }

  private boolean checkBust(Player player) {
    return player.totalHand() > 21;
  }

  private void twist(Player player) {
    player.takeCard(dealer.deal());
    evaluateHand(player);
  }

  private void compareHands() {
    if (checkAllBlackjack()) {
    } else if (ifDealerBustWinners()) {
    } else if (whoBeatDealer()) {
    } else {
      checkIfDealerWins();
    }
  }

  private boolean checkAllBlackjack() {
    if (checkBlackjack(dealer)) {
      ui.blackjack(dealer);
      return true;
    }

    boolean someoneBlackjack = false;
    for (Player player : players) {
      if (player.totalHand() == 21 && player.hand.size() == 2) {
        ui.blackjack(player);
        someoneBlackjack = true;
      }
    }
    return someoneBlackjack;
  }

  private boolean checkBlackjack(Player player) {
    return player.totalHand() == 21 && player.hand.size() == 2;
  }

  private boolean ifDealerBustWinners() {
    boolean somebodyWon = false;

    if (checkBust(dealer)) {
      for (Player player : players) {
        if (!checkBust(player)) {
          ui.wins(player);
          somebodyWon = true;
        }
      }
    }
    return somebodyWon;
  }

  private boolean whoBeatDealer() {
    boolean somebodyWon = false;

    int dealerTotal = dealer.totalHand();
    for (Player player : players) {
      if (player.totalHand() > dealerTotal && !checkBust(player)) {
        ui.wins(player);
        somebodyWon = true;
      }
    }

    return somebodyWon;
  }

  private void checkIfDealerWins() {
    if (!checkBust(dealer)) {
      ui.wins(dealer);
    } else {
      ui.allBust();
    }
  }
}
