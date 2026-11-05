package com.pluralsight.workbook4a.cardgame.solutions;

public class CardGameDemo {

    public static void main(String[] args) {
        // Workbook 4a p. 94 (the workbook names this class MainApp)
        Deck deck = new Deck();
        System.out.println(deck.getSize()); // 52

        Hand hand1 = new Hand();

        // deal 5 cards
        for (int count = 1; count <= 5; count = count + 1) {
            // get a card from the deck
            Card card = deck.deal();
            // deal that card to the hand
            hand1.deal(card);
        }

        System.out.println(deck.getSize()); // 47
        System.out.println(hand1.getSize()); // 5

        int handValue = hand1.getValue();
        System.out.println("This hand is worth " + handValue); // This hand is worth 0
    }
}
