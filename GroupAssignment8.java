public class GroupAssignment8 {

    /*
     * Programmer: Jenna Rowan (and class) 
     * Date: April 14, 2021 
     * Course: CSC 201 Z01S
     * Assignment: Group Assignment 8 
     * Description: Prompts a user to enter a number of students along with their grades.  Determines the highest grade entered and assigns letter grades based on comparison of each student against the max.  Prints out results.
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

        // Determines size of the array via number of students
        println("Enter the number of students:");
        int numberOfStudents = input.nextInt();

        // Housekeeping variable creation
        int[] studentScores = new int[numberOfStudents];
        int maxScore = 0;

        // Grabs student scores
        println("Enter " + numberOfStudents + " scores:");
        for (int i = 0; i < numberOfStudents; i++) {

            studentScores[i] = input.nextInt();

            // Finds maximum score by comparing each score against current value of maxScore
            if (studentScores[i] > maxScore) {

                maxScore = studentScores[i];

            }

        }

        // Loops through each student, determines their letter grade and prints the result
        for (int i = 0; i < numberOfStudents; i++) {

            if (studentScores[i] >= (maxScore - 10)) {

                println("Student " + i + " score is " + studentScores[i] + " and grade is A");

            } else if (studentScores[i] >= (maxScore - 20)) {

                println("Student " + i + " score is " + studentScores[i] + " and grade is B");

            } else if (studentScores[i] >= (maxScore - 30)) {

                println("Student " + i + " score is " + studentScores[i] + " and grade is C");
                
            } else {

                println("Student " + i + " score is " + studentScores[i] + " and grade is D");
                
            }

        }

    }

}
