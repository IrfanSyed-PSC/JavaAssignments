package com.testing.games;


import java.util.HashMap;

/**
 *  Class representing a playing card version-1 for Assignment-16
 */

public class Card {

    private int rank=0;
    private char suit='J';
    private String[] rankStrings = {"Joker","Ace","Two","Three","Four","Five","Six",
            "Seven","Eight","Nine","Ten","Jack","Queen","King"};

    // Set rank based on the input
    public boolean setRank(int rank) {

        if (rank < 0 || rank > rankStrings.length)
            return false;

        this.rank = rank;
        return true;
    }

    // Return the value of rank that is set for the instance variable
    public int getRank() {

        return this.rank;
    }

    // Set the value of suit based on the input value
    public boolean setSuit(Character suit) {

        char[] suitTypes = {'J', 'H', 'C', 'D', 'S'};

        for (int i = 0; i < suitTypes.length; i++) {

            if (suitTypes[i] == suit){

                this.suit = suit;
                return true;

            }


        }

        return false;
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

            case 'J':
                suitString = "Joker";
                break;

            case 'H':
                suitString = "Hearts";
                break;

            case 'C':
                suitString = "Clubs";
                break;

            case 'D':
                suitString = "Diamonds";
                break;

            case 'S':
                suitString = "Spades";
                break;

        }

        return suitString;

        // If the above code need to run differently, then I would choose a HashMap like below
        /**

        HashMap<Character,String> suitlist = new HashMap<>();

        suitlist.put('J',"Joker");
        suitlist.put('H',"Hearts");
        suitlist.put('C',"Clubs");
        suitlist.put('D',"Diamonds");
        suitlist.put('S',"Spades");

        return suitlist.get(this.suit);

         **/
    }



}
