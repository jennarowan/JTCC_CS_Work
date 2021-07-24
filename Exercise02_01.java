/* Programmer: Jenna Rowan
Date: January 31, 2021
Course: CSC 201 Z01S
Assignment: Group Assignment 2 (Chapter 2 Exercise02_01)
Description: This program accepts a temperature in Celsius and converts it to Fahrenheit.
*/

import java.util.Scanner;

public class Exercise02_01 {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Celsius temperature to be converted to Fahrenheit:");

        double celsius = input.nextDouble();

        celsius = celsius * 9 / 5 + 32;

        System.out.println("In Fahrenheit that is " + celsius + " degrees");

    }
}
