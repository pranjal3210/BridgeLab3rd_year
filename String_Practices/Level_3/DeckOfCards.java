package String_Practices.Level_3;

import java.util.Scanner;

public class DeckOfCards {
    public static String[] initDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffle(String[] deck) {
        for (int i=0;i<deck.length;i++) {
            int r = i + (int)(Math.random()*(deck.length-i));
            String temp = deck[i]; deck[i] = deck[r]; deck[r] = temp;
        }
    }

    public static String[][] distribute(String[] deck, int n, int players) {
        if (n % players != 0) {
            System.out.println("Cards cannot be evenly distributed!");
            return null;
        }
        String[][] hands = new String[players][n/players];
        int index = 0;
        for (int i=0;i<players;i++) {
            for (int j=0;j<n/players;j++) {
                hands[i][j] = deck[index++];
            }
        }
        return hands;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] deck = initDeck();
        shuffle(deck);

        System.out.print("How many cards to distribute? ");
        int n = sc.nextInt();
        System.out.print("How many players? ");
        int players = sc.nextInt();

        String[][] hands = distribute(deck, n, players);
        if (hands != null) {
            for (int i=0;i<players;i++) {
                System.out.println("Player " + (i+1) + ": ");
                for (String card : hands[i]) {
                    System.out.println(card);
                }
                System.out.println();
            }
        }
    }
}
