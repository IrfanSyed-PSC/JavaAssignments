package com.testing.games;


/**
 *  Class to test the Deck class
 */
public class DeckTest {

    public static void main(String[] args) {

        // Create 5 instances of Card Objects
        Card card1 = new Card(3,'C');
        Card card2 = new Card(2,'H');
        Card card3 = new Card(6,'S');
        Card card4 = new Card(9,'J');
        Card card5 = new Card(1,'D');

        // Create a Card array
        Card[] mycards = new Card[]{card1, card2, card3, card4, card5};


        // Create a Deck instance with the input of cards array
        Deck mydeck = new Deck(mycards);

        // Print the cards before shuffle
        System.out.println(mydeck);

        // Reset the rank of the last card
        mydeck.getcards()[4].setRank(11);
        System.out.println("");

        // Shuffle it
        mydeck.shuffle();

        // Print the cards
        System.out.println(mydeck);


    }
}
