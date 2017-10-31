package com.example.jamie.cardGames;

import java.util.ArrayList;

/**
 * Created by jamie on 26/10/2017.
 */

public abstract class CardGame {
  public ArrayList<Player> players;
  public Deck deck;
  CardsUI ui = new CardsUI();

  public CardGame() {
    this.players = new ArrayList<Player>();
    this.deck = new Deck();
    deck.shuffle();
    this.ui = new CardsUI();
  }

  public void deal(Player player) {
    player.takeCard(deck.deal());
  }

  public void dealToEveryone(int numberOfCards) {
    for (int i = 0; i < numberOfCards; i++) {
      for (Player player : players) {
        deal(player);
      }
    }
  }
}
