
/**
 * Problem: Count vowels in a string
 *
 * Approach:
 * - Traverse string
 * - Check vowel characters
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Author: Neha Thorat
 * Day: 10
 */
public class VowelCount {
 
    public static int countVowels(String str) {

        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String input = "Education";
        System.out.println("Vowel count: " + countVowels(input));
    }
}