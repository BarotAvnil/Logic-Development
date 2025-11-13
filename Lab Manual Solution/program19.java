// Write a program to print following pattern 
// For n=5 
// 1 2 3 4 5 
// 10 9 8 7 6 
// 11 12 13 14 15 
// 20 19 18 17 16 
// 21 22 23 24 25  

import java.util.Scanner;

public class program19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        int odd = 1, even = 10;
        for (int i = 1; i <= rows; i++) {
            if (i % 2 != 0) {
                for (int j = odd; j < odd + 5; j++) {
                    System.out.print(j + " ");
                }
                odd += 10;
            } else {
                for (int j = even; j > even - 5; j--) {
                    System.out.print(j + " ");
                }
                even += 10;
            }
            System.out.println();
        }
    }
}
