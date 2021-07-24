/* Programmer: Jenna Rowan (and class)
Date: April 5, 2021
Course: CSC 201 Z01S
Assignment: Group Assignment 7
Description: This program prompts the user to enter a potential credit card number.  It then determines if the number is valid or not.

I fixed errors at lines 63, 117, and 120
*/

public class GroupAssignment7 {

    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Enter a credit card number as a long integer: ");

        long ccNum = input.nextLong();

        if (isValid(ccNum)) {

            System.out.println(ccNum + " is valid");

        } else {

            System.out.println(ccNum + " is invalid");

        }

    }


    public static int getSize(long d) {

        int length = String.valueOf(d).length();

        return length;

    }

    public static boolean prefixMatched(long number, int d) {

        int dSize = getSize(d);         
    
        if (getPrefix(number, dSize) == d) {    
            return true;    
        } else {    
            return false;    
        }    
    }

    public static long getPrefix(long number, int k)
    {
        if(getSize(number) > k)
        {
            String num = number + "";
            return Long.parseLong(num.substring(0, k));
        }
        return number;
    }

    public static boolean isValid(long number) {
        // Had to add another set of opening and closing parentheses
        if (((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0) && (getSize(number) >= 13 && getSize(number) <= 16 )&& (prefixMatched(number ,4) || prefixMatched(number,5) || prefixMatched(number,37) || prefixMatched(number, 6))) {
            return true;
        } else {
            return false;
        }

    }


    public static int sumOfDoubleEvenPlace (long number) {

        // Converts number brought in to a string for the purpose of using string length and indexing to loop through digits    
        String cardNumber = Long.toString(number);   
    
        // Housekeeping variable prep   
        int sum = 0;
    
        // Starts at the next to last digit and works backwards to beginning of number    
        for (int i = (cardNumber.length() - 2); i >= 0; i -= 2) {

            // For digits 1 to 4 - adds the double of the number to the variable sum   
            // For digits 5 to 9 - adds the sum of the digits of the double of the number to the variable sum (i.e. 6 doubles to 12, 1 + 2 = 3, 3 is added to sum)   
            switch (Integer.parseInt(cardNumber.charAt(i) + "")) {      
                case 1: sum += 2; break;   
                case 2: sum += 4; break;   
                case 3: sum += 6; break;   
                case 4: sum += 8; break;   
                case 5: sum += 1; break;   
                case 6: sum += 3; break;   
                case 7: sum += 5; break;   
                case 8: sum += 7; break;   
                case 9: sum += 9; 
            } 
    
        }
    
        return sum;
   
    }
   
    public static int getDigit(int number) {

        if (number < 10)        
            return number;        
        else         
            return (number / 10) + (number % 10);
        
    }

    public static int sumOfOddPlace(long number) {

        // Had to retype the double quotes on this line
        String num = number + "";
        
        // Original non working line - Int sum = 0
        int sum = 0; // Fixed
        
        for (int i = getSize(number) - 1; i >= 0; i -= 2) {
        
            sum += Integer.parseInt(num.charAt(i) + "");
        
        }
        
        return sum;
        
    }
    
}