//NUMBER TWO
public class LargerNumber {

    public static void main(String[] args) {
            int num1 = 20;
            int num2 = 50;
            int num3 = 75;

            int largest = Math.max(num1, Math.max(num2, num3));

            System.out.println("The largest number is: " + largest);
        }

// Explanation
    //In this approach, we utilize the Math.max() method, which returns the maximum of two given numbers.
    // By invoking this method multiple times, we can find the largest number among the three.
    //
    //The Math.max() method is invoked twice: first to compare num1 and num2, and then to compare the result with num3.
    // The largest value obtained is stored in the largest variable.
    //
    //Finally, the program outputs the largest number to the console.
}
