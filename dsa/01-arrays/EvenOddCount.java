
/**
 * Problem: Count even and odd numbers in an array
 *
 * Approach:
 * - Traverse array
 * - Use modulo operator
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Author: Neha Thorat
 * Day: 5
 */
public class EvenOddCount {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        int evenCount = 0;
        int oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }
}
