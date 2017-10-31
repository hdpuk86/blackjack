package com.example.jamie.cardGames;

import java.util.ArrayList;
import java.util.Scanner;

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

  public void takeCard(Card card) {
    this.hand.add(card);
  }

  public int totalHand() {
    int total = 0;
    for (Card card : hand) {
      total += card.getRank().getValue();
    }

    int aceCount = 0;
    for (Card card : hand) {
      if (card.getRank() == Rank.ACE) {
        aceCount += 1;
      }
    }

    if (total > 21) {
      total -= 10 * aceCount;
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

  public boolean stickOrTwist(Scanner sc) {
    System.out.println("Stick or twist?");
    String answer = sc.nextLine();

    if (answer.equals("s")) {
      return false;
    } else if (answer.equals("t")) {
      return true;
    } else {
      System.out.println("na.");
    }
    return true;
  }

  public void printHand() {
    System.out.println(name + "'s cards are:");
    for (Card card : hand) {
      System.out.println(card.getRank() + " of " + card.getSuit());
    }
  }
}
