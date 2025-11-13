// Write a program to print following pattern 
// For n=4 
// 4 4 4 4 4 4 4 
// 4 3 3 3 3 3 4 
// 4 3 2 2 2 3 4 
// 4 3 2 1 2 3 4 
// 4 3 2 2 2 3 4 
// 4 3 3 3 3 3 4 
// 4 4 4 4 4 4 4  

import java.util.Scanner;

public class program20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int size = 2 * n - 1;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                // Find the minimum distance from any edge
                int min = Math.min(Math.min(i, j), Math.min(size - i + 1, size - j + 1));
                System.out.print((n - min + 1) + " ");
            }
            System.out.println();
        }
    }
}
