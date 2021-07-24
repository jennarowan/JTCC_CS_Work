/* Programmer: Jenna Rowan
Date: March 15, 2021
Course: CSC 201 Z01S
Assignment: Group Assignment 5.5
Description: This program prompts the user to enter a valid Social Security     number in the format XXX-XX-XXXX.  It then verifies the user wasn't a dumbass by triple checking the string.
*/

public class GroupAssignment5.5 {

    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Please enter a Social Security number (in the format xxx-xx-xxxx): ");

        String ssn = input.nextLine();

        try {
            
            // This strips out the two hyphens (provided they were entered in the correct places) and turns the remaining input into a numerical object
            int ssnnums = Integer.parseInt(ssn.substring(0,3) + ssn.substring(4,6) + ssn.substring(7));

        } catch (Exception e) {

            // If any non-numerical digits were entered or the hyphens were in the wrong place the system lets the end user know they're stupid
            System.out.println(ssn + " is an invalid social security number");
            System.exit(-1);

        } finally {

            if (ssn.length() != 11 || ssn.charAt(3) != '-' || ssn.charAt(6) != '-') {

                System.out.println(ssn + " is an invalid social security number");

            }

            else {

                System.out.println(ssn + " is a valid social security number");

            }

        }
        
    }
    
}
