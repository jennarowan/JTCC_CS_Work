/* Programmer: Jenna Rowan
Date: February 15th, 2021
Course: CSC 201 Z01S
Assignment: Group Assignment 4 (Chapter 3 Exercise03_05Extra)
Description: This program generates a random number between
                0 and 51, and assigns it to the corresponding
                card from a deck of cards.
*/

public class Exercise03_05Extra {

    public static void main(String[] args) {

        // A deck has 52 cards, but we count from 0, so we'll generate a random number between 0 and 51
        int theCard = (int)(Math.random() * 51);
    
        // We determine the card number as the random int + 2.  0 is the 2, 1 is the 3...8 is the 10.  9 is the Jack, and so forth to the Ace (Ace being high)
        switch (theCard % 13) {
            case 9: System.out.print("The card is the Jack"); break;
            case 10: System.out.print("The card is the Queen"); break;
            case 11: System.out.print("The card is the King"); break;
            case 12: System.out.print("The card is the Ace"); break;
            default: System.out.print("The card is the " + ((theCard % 13) + 2));
        }
    
        // Here we determine suit.  The first 13 cards (numbers 0 to 12) are Spades, 13 to 25 are Hearts, etc.
        switch (theCard / 13) {
            case 0: System.out.print(" of Spades"); break;
            case 1: System.out.print(" of Hearts"); break;
            case 2: System.out.print(" of Diamonds"); break;
            case 3: System.out.print(" of Clubs");
        }

        // Pretties up the terminal
        System.out.print("\n");
    
    }
    
}
