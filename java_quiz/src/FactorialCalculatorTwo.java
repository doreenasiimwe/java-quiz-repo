//NUMBER THREE
import java.util.Scanner;
public class FactorialCalculatorTwo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            scanner.close();

            long factorial = calculateFactorial(number);
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        private static long calculateFactorial(int number) {
            if (number == 0 || number == 1) {
                return 1;
            } else {
                return number * calculateFactorial(number - 1);
            }
//            In this version, the calculateFactorial() method is implemented using recursion.
//            It checks for the base cases where the factorial of 0 and 1 is 1. For other numbers,
//            it recursively calls itself with number - 1 until it reaches the base case.
//            The factorial is calculated by multiplying the current number with the factorial of the previous number.
        }


}
