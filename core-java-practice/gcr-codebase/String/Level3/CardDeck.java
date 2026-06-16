import java.util.Scanner;

public class CardDeck {
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {
        String[] shuffled = deck.clone();
        int n = shuffled.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = shuffled[i];
            shuffled[i] = shuffled[randomCardNumber];
            shuffled[randomCardNumber] = temp;
        }
        return shuffled;
    }

    public static String[][] distributeCards(String[] deck, int cardsPerPlayer, int players) {
        if (cardsPerPlayer * players > deck.length) return new String[0][];
        String[][] hands = new String[players][cardsPerPlayer];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                hands[i][j] = deck[index++];
            }
        }
        return hands;
    }

    public static void printHands(String[][] hands) {
        for (int i = 0; i < hands.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (String card : hands[i]) {
                System.out.println("  " + card);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        System.out.print("Enter cards per player: ");
        int cardsPerPlayer = sc.nextInt();

        String[] deck = initializeDeck();
        String[] shuffled = shuffleDeck(deck);
        String[][] hands = distributeCards(shuffled, cardsPerPlayer, players);

        if (hands.length == 0) {
            System.out.println("Cannot distribute " + cardsPerPlayer + " cards to " + players + " players.");
        } else {
            printHands(hands);
        }
        sc.close();
    }
}
