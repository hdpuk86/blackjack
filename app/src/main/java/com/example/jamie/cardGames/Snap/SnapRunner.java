package com.example.jamie.cardGames.Snap;

import java.util.Scanner;

/**
 * Created by jamie on 27/10/2017.
 */

public class SnapRunner {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    SnapGame game = new SnapGame("Jim", "Bob");

    game.playSnap(sc);
  }
}
