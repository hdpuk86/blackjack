package com.example.jamie.cardGames.Pontoon;

import com.example.jamie.cardGames.CardGame;
import com.example.jamie.cardGames.Player;

/**
 * Created by jamie on 26/10/2017.
 */

public class PontoonGame extends CardGame {
  PontoonUI ui = new PontoonUI();

  public PontoonGame(String player) {
    super();
    players.add(new Player(player));
    players.add(new Player("Banker"));
  }

  public void playerTakesCard() {

  }

  public void playPontoon() {
    dealToEveryone(2);

    ui.printHand(players.get(1));
  }
}
