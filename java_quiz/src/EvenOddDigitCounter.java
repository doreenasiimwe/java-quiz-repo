//NUMBER FIVE

import java.util.Scanner;
public class EvenOddDigitCounter {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            scanner.close();

            int evenCount = 0;
            int oddCount = 0;
            int digit;

            while (number != 0) {
                digit = number % 10;
                if (digit % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
                number /= 10;
            }

            System.out.println("Number of even digits: " + evenCount);
            System.out.println("Number of odd digits: " + oddCount);
        }}

//In this program, the user is prompted to enter a number.
// The program then counts the number of even and odd digits in the given number.
//
//The program uses a while loop to iterate through each digit of the number.
// The remainder of dividing the number by 10 gives the rightmost digit (digit = number % 10).
// If the digit is divisible by 2 (even), the evenCount is incremented; otherwise, the oddCount is incremented.
// The number is then divided by 10 to remove the rightmost digit. This process continues until the number becomes 0.
//
//Finally, the program displays the counts of even and odd digits in the given number.
