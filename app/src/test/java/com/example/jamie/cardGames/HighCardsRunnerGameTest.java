package com.example.jamie.cardGames;

import com.example.jamie.cardGames.HighCards.HighCardsGame;

import org.junit.Before;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

/**
 * Created by jamie on 26/10/2017.
 */

public class HighCardsRunnerGameTest {
  HighCardsGame highCardsGame;
  HighCardsGame spyHighCardsGame;

  @Before
  public void before() {
    highCardsGame = new HighCardsGame("Jamie", "Alistair");
    spyHighCardsGame = Mockito.spy(highCardsGame);
  }
}
