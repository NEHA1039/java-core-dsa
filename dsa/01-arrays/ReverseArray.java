
/**
 * Problem: Reverse an array
 *
 * Approach:
 * - Two-pointer technique
 * - Swap elements from start and end
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Author: Neha Thorat
 * Day: 3
 */
public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
