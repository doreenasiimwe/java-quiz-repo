//NUMBER FOUR

import java.util.Scanner;

public class DigitCounter {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            scanner.close();

            int digitCount = countDigits(number);
            System.out.println("Number of digits: " + digitCount);
        }

        private static int countDigits(int number) {
            int count = 0;
            while (number != 0) {
                number /= 10;
                count++;
            }
            return count;
        }
//    In this program, the user is prompted to enter a number.
//    The countDigits() method counts the number of digits by repeatedly dividing the number by 10 until it becomes 0.
//    Each division reduces the number by one digit, and the count is incremented.
//    Finally, the program outputs the total number of digits in the given number.

}
//The java.util.Scanner class in Java provides a convenient way to read input from various sources, such as the keyboard, files, or strings. It is commonly used to read user input from the command line.
//
//Here are some key features and functionalities of the Scanner class:
//
//Input Parsing: The Scanner class can parse different types of input, such as integers, floating-point numbers, strings, and more. It provides methods like nextInt(), nextDouble(), nextLine(), etc., to read input of specific types.
//
//Tokenization: The Scanner class can tokenize input based on delimiters, which are patterns used to separate input into smaller parts. By default, whitespace characters (spaces, tabs, line breaks) are used as delimiters, but you can specify custom delimiters using regular expressions.
//
//Error Handling: The Scanner class helps handle input errors by providing methods like hasNextInt(), hasNextDouble(), etc., to check if the next input token matches the expected type. This allows you to validate input before reading it.
//
//Source Selection: The Scanner class can read input from various sources like the standard input stream (System.in), files, or strings. This flexibility allows you to read input from different sources without changing your code significantly.
//
//Overall, the Scanner class simplifies the process of reading and parsing input in Java, making it easier to interact with users and process input data.