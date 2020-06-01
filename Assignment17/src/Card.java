package com.testing.games;

/**
 *  Class representing a playing card
 */
public class Card {


    // Default constructor initializing rank and suit to defaults
    public Card() {

        this.rank = 0;
        this.suit = JOKER;
    }


    // Constructor that takes input as rank and suit and sets them to the instance variables
    public Card(int rank, char suit) {

        this.setRank(rank);
        this.setSuit(suit);

    }


    // Instance Variables
    private int rank = 0;
    private char suit = 'J';
    public  String[] rankStrings = {"Joker", "Ace", "Two", "Three", "Four", "Five", "Six",
            "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};


    // Static variables for different suit types
    public final static char JOKER = 'J';
    public final static char HEARTS = 'H';
    public final static char CLUBS = 'C';
    public final static char DIAMONDS = 'D';
    public final static char SPADES = 'S';


    // Set rank based on the input
    public boolean setRank(int rank) {

        // If the input rank value does not match the condition then return false
        if (rank < 0 || rank > rankStrings.length)
            return false;

        // Otherwise, set rank to instance variable and return true
        this.rank = rank;
        return true;
    }

    // Return the value of rank that is set for the instance variable
    public int getRank() {

        return this.rank;
    }

    // Set the value of suit based on the input value
    public boolean setSuit(Character suit) {

        switch (suit) {

            case JOKER:
                break;

            case HEARTS:
                break;

            case CLUBS:
                break;

            case DIAMONDS:
                break;

            case SPADES:
                break;

            default:
                return false;
        }


        // Set the suit value and return true if the input is valid
        this.suit = suit;
        return true;


    }

    // Return the suit value
    public char getSuit() {

        return this.suit;
    }

    // Return the rankString based on the rank value
    public String getRankString() {

        return this.rankStrings[this.rank];

    }

    // Get the SuitString based on the suit value set
    public String getSuitString() {

        String suitString = null;

        switch (this.suit) {

            case JOKER:
                suitString = "Joker";
                break;

            case HEARTS:
                suitString = "Hearts";
                break;

            case CLUBS:
                suitString = "Clubs";
                break;

            case DIAMONDS:
                suitString = "Diamonds";
                break;

            case SPADES:
                suitString = "Spades";
                break;

        }

        return suitString;


        // If I had to write it differently, then I would prefer to write a hashmap than a switch case

        /**

        HashMap<Character, String> suitlist = new HashMap<>();

        suitlist.put(JOKER, "Joker");
        suitlist.put(HEARTS, "Hearts");
        suitlist.put(CLUBS, "Clubs");
        suitlist.put(DIAMONDS, "Diamonds");
        suitlist.put(SPADES, "Spades");

        return suitlist.get(this.suit);

         **/


    }


    // Return string based on the suit and rank
    public String toString() {

        if (this.suit != JOKER && this.rank != 0)
            return this.getRankString() + " of " + this.getSuitString();
        else
            return "Joker";


    }


}
