package com.testing.games;


import java.util.Scanner;

/**
 *  Tests to verify Card class is functioning as expected
 */
public class CardTest {

    public static void main(String[] args) {

        // Creae a Card Object
        Card newcard = new Card();
        char suitval;
        int rankval;

        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        do {

            // Read input as suit
            System.out.println("Please enter the suit of the card");
            suitval = scanner.next().charAt(0);

            // Check if the input is not valid and print error
            if (!newcard.setSuit(suitval))
                System.out.println("Invalid suit. Try again");

        }
        // loop until the input is valid
        while (!newcard.setSuit(suitval));


        // Use the same scanner object to read the rank
        scanner = new Scanner(System.in);

        do {

            // Read input as rank
            System.out.println("Please enter the rank of the card");
            rankval = scanner.nextInt();

            // Check if the input is not valid and print error
            if (!newcard.setRank(rankval))
                System.out.println("Invalid rank. Try again");


        }
        // loop until the input is valid
        while (!newcard.setRank(rankval));

        // Check if the input is not Joker and print the output accordingly
        if (newcard.getSuit() != 'J' && newcard.getRank() != 0)
            System.out.println("Your card is the " + newcard.getRankString() + " of " + newcard.getSuitString());
        else
            System.out.println("Your card is Joker");

    }


    public void testdefaultcontructor() {

        Card newcard = new Card();

        System.out.println(newcard);


    }

}
