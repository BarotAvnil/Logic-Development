// Given two strings s1 and s2 consisting of lowercase characters, the task is to check whether the two given 
// strings are anagrams of each other or not. An anagram of a string is another string that contains the same 
// characters, only the order of characters can be different. 
// Input: s1 = “geeks” s2 = “kseeg” 
// Output: true 
// Explanation: Both the strings have the same characters with same frequency. So, they are anagrams. 

import java.util.Arrays;
import java.util.Scanner;

public class program32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st String: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the 2nd String: ");
        String s2 = sc.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
        } else {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            if (Arrays.equals(c1, c2)) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        }

    }
}
