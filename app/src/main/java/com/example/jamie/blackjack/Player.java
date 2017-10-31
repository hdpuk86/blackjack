package com.example.jamie.blackjack;

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
        boolean valid;
        valid = false;

        while(!valid) {
            System.out.println("Stick or twist? Enter T to twist or S to stick");
            String answer = sc.nextLine();
            if (answer.toLowerCase().equals("s")) {
                valid = true;
                return false;
            } else if (answer.toLowerCase().equals("t")) {
                valid = true;
                return true;
            } else {
                valid = false;
                System.out.println("not valid");
            }
        }
        return true;
    }

}
