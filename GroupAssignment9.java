public class GroupAssignment9 {

    /*
     * Programmer: Jenna Rowan
     * Date: April 19, 2021 
     * Course: CSC 201 Z01S
     * Assignment: Group Assignment 9 
     * Description: Prompts the user to enter 10 numbers.  Calculates and prints the mean and standard deviation of the 10 numbers.
     */

    // Shiny new print functions I'm putting in all my files so I can stop typing System.out over and over
    public static void print(Object obj) {
        System.out.print(obj);
    }

    public static void println(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        // Housekeeping variable creation
        double[] numArray = new double[10];
        double sumNums = 0.0;

        // Grabs 10 numbers from users, finds sum
        println("Enter ten numbers:");
        for (int i = 0; i < 10; i++) {

            numArray[i] = input.nextDouble();
            sumNums += numArray[i];

        }

        // Mean
        double meanNums = sumNums / 10;

        // Finds standard deviation
        double devNum = deviation(numArray, meanNums);

        System.out.printf("The mean is %1.2f%n", meanNums);
        System.out.printf("The standard deviation is %1.5f%n", devNum);

    }

    public static double deviation(double[] x, double m) {

        // Housekeeping
        double sumDiffs = 0.0;

        for (int i = 0; i < 10; i++) {

            // Squares each number minus the overall mean, makes a sum of them
            sumDiffs += Math.pow((x[i] - m), 2);

        }

        // I have no idea why
        double varSum = sumDiffs / 9;

        return Math.sqrt(varSum);

    }

}
