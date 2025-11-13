// Write a program that should decode the given pattern and print the resulting expanded string. 
// Input: 2a3bc4dE5F2G7H 
// Output: aabbbcddddEFFFFFGGHHHHHHH

import java.util.Scanner;

public class program28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        // boolean isDigit = false;
        char c = '1';
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (Character.isDigit(c) && i + 1 < s.length()) {
                int temp = c - '0'; // ascii convert
                for (int j = 0; j < temp; j++) {
                    System.out.print(s.charAt(i + 1));
                }
                i++; // skip the next character otherwise it will print it for + 1 times
            } else if(!Character.isDigit(c)) {
                System.out.print(c);
            }
        }
    }
}
