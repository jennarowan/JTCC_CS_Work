/* Programmer: Jenna Rowan
Date: February 27th, 2021
Course: CSC 201 Z01S
Assignment: Group Assignment 5
Description: This program accepts a four digit binary string from 
                the user and  converts it to its corresponding 
                decimal value (assuming valid binary input).
*/

public class GroupAssignment5 {

    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter a four digit binary number: ");
            
        int binaryNumber = input.nextInt();
        int decimalNumber = 0;    
        int placesAdjustment = 1;

        for (int i = 0; i < 4; i++) {

            // Checks each digit to insure it is only 0 or 1.  Terminates program if input is bad.
            if ((binaryNumber % 10) > 1) {

                System.out.println("Binary numbers can only contain 0s or 1s.  Better luck next time.");
                System.exit(1);

            }

            // Strips right-most digit of binary number, multiplies it by whatever place it is in (binary places being 8, 4, 2, and 1)
            decimalNumber += (binaryNumber % 10) * placesAdjustment;

            // Removes right-most digit
            binaryNumber /= 10;

            // Doubles binary place number for next loop
            placesAdjustment *= 2;

        }

        System.out.println("The decimal value is " + decimalNumber);
        
    }
    
}