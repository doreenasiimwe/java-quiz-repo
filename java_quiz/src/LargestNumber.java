//NUMBER TWO

public class LargestNumber {

    public static void main(String[] args) {
            int num_1 = 20;
            int num_2 = 90;
            int num_3 = 45;

            int largest = num_1;

            if (num_2 > largest) {
                largest = num_2;
            }

            if (num_3 > largest) {
                largest = num_3;
            }

            System.out.println("The largest number is: " + largest);
        }

//In this program, three integer variables num1, num2, and num3 are declared with their respective values.
// The variable largest is initially assigned the value of num1.
// Then, the program compares num2 and num3 with largest using if statements.
// If num2 or num3 is greater than largest, the value of largest is updated accordingly.
}
