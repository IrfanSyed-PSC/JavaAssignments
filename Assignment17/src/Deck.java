package com.testing.games;

import java.util.Random;

/**
 *  Class that represents a deck of cards
 */
public class Deck {

    // There can only be 52 cards in a deck
    private Card[] cards = new Card[52];

    // the current number of cards in the deck
    private int current;


    // Constructor to set the cards based on the array of cards
    public Deck(Card[] cards) {

        this.cards = cards;
    }



    // Default constructor that would create a deck of 52 cards
    public Deck() {


        Card defaultcard = new Card();
        int doc_count = 0;

        for (int i=1; i < defaultcard.rankStrings.length; i++)
        {

            cards[doc_count++] = new Card(i,Card.HEARTS);
            cards[doc_count++] = new Card(i,Card.CLUBS);
            cards[doc_count++] = new Card(i,Card.DIAMONDS);
            cards[doc_count++] = new Card(i,Card.SPADES);


        }


    }

    // Return a card from the deck of cards and increment it every time

    public Card draw() {

        if (current == cards.length )
            return null;

        current++;
        return cards[current-1];
    }

    // Return array of cards
    public Card[] getcards() {

        return this.cards;
    }

    // Return remaining number of deck of cards
    public int remaining() {

        return this.cards.length - current;
    }


    // Shuffle the cards and reset the current value
    public void shuffle() {

        this.current = 0;

        // Shuffle the cards based on Fisher-Yates Algorithm
        for (int i = cards.length-1; i > 0; i--) {

            int j = new Random().nextInt(i+1);

            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }

    }


    // Return all the cards rank and suit as string
    @Override
    public String toString() {
        String result = "";

        for(int i=0; i < getcards().length; i++ ) {
            result = result + cards[i] + "\n";
        }


        return result;
    }
}
