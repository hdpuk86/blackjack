package com.example.jamie.cardGames;

import java.util.ArrayList;

/**
 * Created by jamie on 26/10/2017.
 */

public class Player {
  String name;
  ArrayList<Card> hand;

  public Player(String name) {
    this.name = name;
    this.hand = new ArrayList<>();
  }

  public void takeCard(Deck deck) {
    this.hand.add(deck.deal());
  }

  public int totalHand() {
    int total = 0;
    for (Card card : hand) {
      total += card.getRank().getValue();
    }
    return total;
  }

  public void burnHand() {
    hand.clear();
  }

  public Deck returnHandToDeck(Deck deck) {
    ArrayList<Card> tempHand = hand;
    burnHand();
    deck.cards.addAll(tempHand);
    return deck;
  }

  public Card playFirstCard() {
    return hand.remove(0);
  }
}
