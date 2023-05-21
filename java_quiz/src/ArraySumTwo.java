//Number Six

public class ArraySumTwo {
        public static void main(String[] args) {
            int[] array = {4, 6, 5, 8, 30};

            int sum = calculateSum(array);
            System.out.println("Sum of elements: " + sum);
        }

        private static int calculateSum(int[] array) {
            int sum = 0;
            int length = array.length;
            int index = 0;
            while (index < length) {
                sum += array[index];
                index++;
            }
            return sum;
        }


}
//In this approach, the calculateSum() method uses a while loop to iterate through the array.
// The sum variable is initialized as 0, and an index variable is used to keep track of the current position in the array.
// The loop continues until the index reaches the length of the array.
//
//Inside the loop, each element of the array is added to the sum using the += operator, and the index is incremented.
