/* Programmer: Jenna Rowan
Date: February 3rd, 2021
Course: CSC 201 Z01S
Assignment: Group Assignment 3 (Chapter 2 Exercise02_06Extra)
Description: This program accepts a number from the user and
                prints its reverse.
*/

import java.util.Scanner;

public class Exercise02_06Extra {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("\nPlease enter your loan amount:");
    double userLoanAmount = input.nextDouble();

    System.out.println("\nPlease enter your monthly payment:");
    double userPayment = input.nextDouble();

    System.out.println("\nPlease enter your loan term, in years:");
    double userLoanTerm = input.nextDouble() * 12;

    double interestRate = 0;

    double monthlyPayment = 0;

    while (monthlyPayment < userPayment) {

        interestRate += 0.0001;

        monthlyPayment = (userLoanAmount * (interestRate / 12)) / (1 - (1 / (Math.pow((1 + (interestRate / 12)), userLoanTerm))));

    }

    System.out.println("Your interest rate is " + (int)(interestRate * 10000) / 100.0 + "%.");

   }

}