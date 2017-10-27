package com.example.jamie.cardGames;

import com.example.jamie.cardGames.HighCards.HighCardsUI;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by jamie on 26/10/2017.
 */

public class Deck {
  public ArrayList<Card> cards;
  public HighCardsUI highCardsUi = new HighCardsUI();

  public Deck() {
    this.cards = generateDeck();
  }

  public ArrayList<Card> generateDeck() {
    ArrayList<Card> pack = new ArrayList<>();

    for (Suit suit : Suit.values()) {
      for (Rank rank : Rank.values()) {
        pack.add(new Card(suit, rank));
      }
    }
    return pack;
  }

  public void shuffle() {
    Collections.shuffle(cards);
  }

  public Card deal() {
    Card card = cards.remove(0);
    return card;
  }
}
