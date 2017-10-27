package com.example.jamie.cardGames.Snap;

import com.example.jamie.cardGames.Card;
import com.example.jamie.cardGames.CardGame;
import com.example.jamie.cardGames.CardsUI;
import com.example.jamie.cardGames.Player;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by jamie on 27/10/2017.
 */

public class SnapGame extends CardGame {
  CardsUI ui = new CardsUI();

  public SnapGame(String player1, String player2) {
    super();
    players.add(new Player(player1));
    players.add(new Player(player2));
  }

  public void playSnap(Scanner sc) {
    dealToEveryone(26);

    Card topCard = null;
    Card nextCard;
    boolean won = false;
    while (!won) {
      for (Player player : players) {
        nextCard = player.playFirstCard();
        ui.printPlayerForCard(player);
        ui.printCard(nextCard);
        try {
          TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
          System.out.println("...");
        }

        if (topCard == null || nextCard.getValue() != topCard.getValue()) {
          topCard = nextCard;
        } else {
          System.out.println("Snap!");
          won = true;
          break;
        }
      }
    }
  }
}
