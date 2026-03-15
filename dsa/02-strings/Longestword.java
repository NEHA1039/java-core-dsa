/**Problem:Find Longest word in string
 * Approach:
 * Split the sentence into words
 * Track maximum length word
 * 
 * Time complexity:O(n)
 * Space Complexity;O(n)
 * 
 * Author:Neha Thorat
 * Day:12
 */

public class Longestword {
    public static void main(String args[]){
        String sentence="Java is a powerful language";
        String[]word=sentence.split(" ");
        String longest=" ";
        for(String w:word){
            if(w.length()>longest.length()){
                longest=w;

            }
        }
    System.out.println("Longest:"+longest);
        }
    }
    
