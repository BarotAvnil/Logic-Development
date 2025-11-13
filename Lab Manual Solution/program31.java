// Given a string S of length n, the task is to find the earliest repeated character in it. The earliest repeated 
// character  means,  the  character  that  occurs  more  than  once  and  whose  second  occurrence  has  the 
// smallest index. 
// Input: s = "geeksforgeeks"  
// Output: e  
// Explanation: e is the first element that repeats

import java.util.Scanner;

public class program31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();

        boolean[] seen = new boolean[256];  // For all ASCII characters
        char result = 0;
        boolean found = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (seen[c]) {      // If character was seen before
                result = c;
                found = true;
                break;          // The first repeated character found
            } else {
                seen[c] = true; // Mark as seen
            }
        }

        if (found)
            System.out.println("Earliest repeated character: " + result);
        else
            System.out.println("No repeated character found!");
    }
}
