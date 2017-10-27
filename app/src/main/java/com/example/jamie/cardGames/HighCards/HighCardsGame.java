package com.example.jamie.cardGames.HighCards;

import com.example.jamie.cardGames.CardGame;
import com.example.jamie.cardGames.Deck;
import com.example.jamie.cardGames.Player;

/**
 * Created by jamie on 26/10/2017.
 */

public class HighCardsGame extends CardGame {
  public HighCardsUI highCardsUi = new HighCardsUI();

  public HighCardsGame(String player1, String player2) {
    super();
    players.add(new Player(player1));
    players.add(new Player(player2));
  }

  public Deck getDeck() {
    return super.deck;
  }

  public void allPlayersBurn() {
    for (Player player : players) {
      player.burnHand();
    }
  }

  public Player whoWinsHighCards() {
    Player winner = players.get(0);
    int highScore = 0;

    for (Player player : players) {
      if (player.totalHand() > highScore) {
        highScore = player.totalHand();
        winner = player;
      }
    }
    return winner;
  }

  public void playHighCards(int numberOfCards) {

    dealToEveryone(numberOfCards);

    for(Player player : players) {
      highCardsUi.printTotal(player);
    }

    Player winner = whoWinsHighCards();
    highCardsUi.printWin(winner);
    allPlayersBurn();
  }
}
