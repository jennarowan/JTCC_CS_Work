public class sumOfDoubleEvenPlace {
    public static void main (String[] args) {

        long x = 4388576018410707L;

        System.out.println(doIt(x));

    }

    public static int doIt (long number) {

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
}
