/**Problem:Check if string is palindrome
 * 
 * Approach:Two pointer comparison from start to end
 * 
 * TimeComplexity:O(n)
 * SpaceComplexity:O(1)
 * 
 * Author:Neha Thorat
 * DAY:9
 */




public class PalindromeString {
    public static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;

        }
        return true;
}

public static void main(String[]args){
       String input ="madam";
       if (isPalindrome(input)){
        System.out.println("palindrome");
       }else{
        System.out.println("not palindrome");
       }
} 
}
