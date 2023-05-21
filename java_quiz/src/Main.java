// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//NUMBER ONE
public class Main {

        public static void main(String[] args) {
            int num1 = 5;
            int num2 = 10;

            System.out.println("Before swapping:");
            System.out.println("num1 = " + num1);
            System.out.println("num2 = " + num2);

            // Swapping the numbers using a temporary variable
            int temp = num1;
            num1 = num2;
            num2 = temp;

            System.out.println("After swapping:");
            System.out.println("num1 = " + num1);
            System.out.println("num2 = " + num2);
        }
//        explanation
//    we declare two integer variables (num1 and num2) with initial values.
//    after we  use a temporary variable temp to store the value of num1 before swapping.
//    The values of num1 and num2 are then swapped, and the updated values are printed to the terminal.


//        public static void main(String[] args) {
//            int number1 = 5;
//            int number2 = 10;
//
//            System.out.println("Before swapping:");
//            System.out.println("number1 = " + number1);
//            System.out.println("number2 = " + number2);
//
//            // Swapping the numbers without using a temporary variable
//            number1 = number1 + number2;
//            number2 = number1 - number2;
//            number1 = number1 - number2;
//
//            System.out.println("After swapping:");
//            System.out.println("number1 = " + number1);
//            System.out.println("number2 = " + number2);
//        }
//explanation
//    In this approach, we use the properties of addition and subtraction to swap the values.
//    The value of number1 is updated to the sum of both numbers (number1 + number2).
//    Then, the value of number2 is updated by subtracting the original value of number2 from the new value of number1 (number1 - number2).
//    Finally, the value of number1 is updated by subtracting the original value of number1 (which is now stored in number2) from the new value of number1 (number1 - number2).

//    The result is that the values of number1 and number2 are swapped without using a temporary variable.



//    public class LargestNumber {
//        public static void main(String[] args) {
//            int num1 = 10;
//            int num2 = 20;
//            int num3 = 15;
//
//            int largest = num1;
//
//            if (num2 > largest) {
//                largest = num2;
//            }
//
//            if (num3 > largest) {
//                largest = num3;
//            }
//
//            System.out.println("The largest number is: " + largest);
//        }
//    }
//
}
