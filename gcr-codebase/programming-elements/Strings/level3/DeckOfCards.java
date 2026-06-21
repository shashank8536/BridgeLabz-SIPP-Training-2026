package Strings.level3;

import java.util.Scanner;

public class DeckOfCards {

    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        
        String[] deck = new String[numOfCards];
        int index = 0;
        
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = ranks[j] + " of " + suits[i];
                index++;
            }
        }
        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    public static String[][] distributeCards(String[] deck, int n, int x) {
        if (n * x > deck.length) {
            return null;
        }
        String[][] players = new String[x][n];
        int cardIndex = 0;
        
        for (int player = 0; player < x; player++) {
            for (int card = 0; card < n; card++) {
                players[player][card] = deck[cardIndex++];
            }
        }
        return players;
    }

    public static void printPlayers(String[][] players) {
        if (players == null) {
            System.out.println("Not enough cards to distribute.");
            return;
        }
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + " cards:");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  - " + players[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);
        
        System.out.print("Enter number of players: ");
        int x = sc.nextInt();
        System.out.print("Enter number of cards per player: ");
        int n = sc.nextInt();
        
        String[][] players = distributeCards(deck, n, x);
        printPlayers(players);
        
        sc.close();
    }
}
