package com.pluralsight.workbook4a.cardgame;

public class CardGameDemo {

    public static void main(String[] args) {
        // Workbook 4a p. 94 (the workbook names this class MainApp)
        Deck deck = new Deck();
        System.out.println(deck.getSize());

        Hand hand1 = new Hand();

        // deal 5 cards
        for (int count = 1; count <= 5; count = count + 1) {
            // TODO: get a card from the deck, then deal that card to the hand
        }

        System.out.println(deck.getSize());
        System.out.println(hand1.getSize());

        int handValue = hand1.getValue();
        System.out.println("This hand is worth " + handValue);
    }
}
