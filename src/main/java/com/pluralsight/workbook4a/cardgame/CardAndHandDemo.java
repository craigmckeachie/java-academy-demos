package com.pluralsight.workbook4a.cardgame;

public class CardAndHandDemo {

    public static void main(String[] args) {
        // Workbook 4a pp. 89-91
        Card card = new Card("Hearts", "K");

        System.out.println(card.getValue() + " of " + card.getSuit());
        card.flip();
        System.out.println(card.getValue() + " of " + card.getSuit());

        Hand hand = new Hand();
        System.out.println(hand.getSize());
        hand.deal(card);
        hand.deal(new Card("Spades", "7"));
        System.out.println(hand.getSize());
    }
}
