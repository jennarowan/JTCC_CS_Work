public class GroupAssignment10 {

    /*
     * Programmer: Jenna Rowan
     * Date: April 26, 2021 
     * Course: CSC 201 Z01S
     * Assignment: Group Assignment 10
     * Description: Prompts the user to enter two 3x3 matrices, adds them together, and prints the original matrices along with the sum matrix.
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

        // Declaring them now to be used over and over in this method
        int i, j;

        // Declaring and initializing the two user entered matrices and the computer generated sumMatrix
        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];
        double[][] sumMatrix = new double[3][3];

        println("Enter matrix1:");
        for (i = 0; i < 3; i++) {

            for (j = 0; j < 3; j++) {

                matrix1[i][j] = input.nextDouble();

            }

        }

        println("Enter matrix2:");
        for (i = 0; i < 3; i++) {

            for (j = 0; j < 3; j++) {

                matrix2[i][j] = input.nextDouble();

                // I just want to point out that I could have done the sumMatrix right here with "sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j]", because each [i][j] is now filled in at this point.  The whole external method is wholly unnecessary, but I'll do it since that's the assignment.

            }

        }

        sumMatrix = addMatrix(matrix1, matrix2);

        println("The addition of the matrices is");

        for (i = 0; i < 3; i++) {

            // Adds the three elements of i row in the first matrix
            for (j = 0; j < 3; j++) {

                print(matrix1[i][j] + " ");

            }

            // Spacing between matrices
            if (i != 1) {

                print("       ");

            } else {

                print("   +   ");

            }

            // Adds the three elements of i row in the second matrix
            for (j = 0; j < 3; j++) {

                print(matrix2[i][j] + " ");

            }

            // Spacing between matrices
            if (i != 1) {

                print("       ");

            } else {

                print("   =   ");

            }

            // Adds the three elements of i row in the sum matrix
            for (j = 0; j < 3; j++) {

                print(sumMatrix[i][j] + " ");

            }

            println("");

        }

    }

    public static double[][] addMatrix(double[][] a, double[][] b) {

        // This will hold the sum array till it's returned
        double[][] holder = new double [3][3];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                holder[i][j] = a[i][j] + b[i][j];

            }

        }

        return holder;

    }

}
