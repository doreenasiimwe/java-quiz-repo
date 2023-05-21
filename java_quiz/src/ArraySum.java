
//Number six part one
public class ArraySum {
        public static void main(String[] args) {
            int[] array = {4, 6, 8, 10, 12};

            int sum = calculateSum(array);
            System.out.println("Sum of elements: " + sum);
        }

        private static int calculateSum(int[] array) {
            int sum = 0;
            for (int element : array) {
                sum += element;
            }
            return sum;
        }


}
//In this program, an array of integers is defined with the values {2, 4, 6, 8, 10}. T
// he calculateSum() method takes an array as input and calculates the sum of its elements using a for-each loop.
// The variable sum is initialized as 0, and each element of the array is added to it in each iteration.
