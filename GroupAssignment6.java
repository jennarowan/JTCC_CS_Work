/* Programmer: Jenna Rowan
Date: March 17, 2021
Course: CSC 201 Z01S
Assignment: Group Assignment 6
Description: This program prompts the user to enter the first 12 digits of an ISBN number.  It then calculates the 13th digit of the full ISBN number and prints the full number to the console.
*/

public class GroupAssignment6 {

    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);
    
        System.out.println("Enter the first 12 digits of an ISBN-13 as a string: ");
    
        String isbn = input.nextLine();
        int mathHolder = 0;
    
        // Checks to see if the end user can follow simple damn directions, exits if they can't
        if (isbn.length() != 12) {
    
          System.out.println(isbn + " is an invalid input");
          System.exit(-1);
    
        }
    
        // Loops through all the inidividual digits in the user supplied ISBN number
        for (int i = 0; i < 12; i++) {
    
          // Checks to make sure character is numeric, exits if the end user screwed it up
          if (!Character.isDigit(isbn.charAt(i))) {
    
            System.out.println(isbn + " is an invalid input");
            System.exit(-1);
    
          }
    
          // Every even digit (when count starts at 0) just needs added in, while every odd digit needs to be tripled and added in
          if (i % 2 == 0) {
    
            mathHolder += (int)(isbn.charAt(i) - '0');
    
          } else {
    
            mathHolder += (3 * (int)(isbn.charAt(i) - '0'));
    
          }
    
        }
    
        // The rest of the math the problem calls for
        mathHolder = 10 - mathHolder % 10;
        
        if (mathHolder == 10) {
    
          mathHolder = 0;
    
        }
    
        // And here you go
        System.out.println("The ISBN-13 number is " + isbn + mathHolder);
        
    }
    
}