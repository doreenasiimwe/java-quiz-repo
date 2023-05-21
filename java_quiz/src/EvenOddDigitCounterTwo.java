//NUMBER FIVE
import java.util.Scanner;

public class EvenOddDigitCounterTwo {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            scanner.close();

            String numberString = String.valueOf(number);
            int evenCount = 0;
            int oddCount = 0;

            for (int i = 0; i < numberString.length(); i++) {
                int digit = Character.getNumericValue(numberString.charAt(i));
                if (digit % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            System.out.println("Number of even digits: " + evenCount);
            System.out.println("Number of odd digits: " + oddCount);
        }

}
//In this approach, the given number is converted to a string using String.
// valueOf(number). Then, a for loop is used to iterate over each character in the string.
// The Character.getNumericValue() method is used to convert each character back to an integer digit.
//
//The program checks if the digit is even or odd using the modulo operator %.
// If the digit is divisible by 2 (even), the evenCount is incremented; otherwise, the oddCount is incremented.
//
//Finally, the program displays the counts of even and odd digits in the given number.