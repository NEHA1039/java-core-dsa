/**
 * Problem: Reverse a String
 *
 * Approach:
 * - Convert string to char array
 * - Use two-pointer technique
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Author: Neha Thorat
 * Day: 8
 */
public class ReverseString {

    public static String reverse(String str) {

        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

        char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        String input = "Java";
        System.out.println("Reversed: " + reverse(input));
    }
}

