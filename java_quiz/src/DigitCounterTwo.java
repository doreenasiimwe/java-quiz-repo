//NUMBER FOUR TWO
import java.util.Scanner;

public class DigitCounterTwo {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            scanner.close();

            int digitCount = countDigits(number);
            System.out.println("Number of digits: " + digitCount);
        }

        private static int countDigits(int number) {
            return (int) Math.log10(number) + 1;
        }


}
//In this approach, the countDigits() method utilizes the mathematical property of logarithms to count the number of digits.
// The expression (int) Math.log10(number) + 1 calculates the logarithm base 10 of the number and adds 1 to it.
// The result gives the total number of digits in the given number.

//Finally, the program outputs the count of digits in the given number.
