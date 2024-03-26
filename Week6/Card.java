package Week6;
import java.util.Random;

public class Card {
    private String suit;
    private String faceValue;

    public Card(String suit, String faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public String getSuit() {
        return suit;
    }

    public String getFaceValue() {
        return faceValue;
    }

    public static Card getRandomCard() {
        Random random = new Random();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] faceValues = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String randomSuit = suits[random.nextInt(suits.length)];
        String randomFaceValue = faceValues[random.nextInt(faceValues.length)];
        return new Card(randomSuit, randomFaceValue);
    }

    public String toString() {
        return faceValue + " of " + suit;
    }

    public static void main(String[] args) {
        System.out.println("Dealt Cards:");
        for (int i = 0; i < 5; i++) {
            Card card = Card.getRandomCard();
            System.out.println(card);
        }
    }
}
