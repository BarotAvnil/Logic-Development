package Pattern_Problem;
// Given the number of rows and columns, print the corresponding swastika pattern using loops. 
// Note:  The  number  of  rows  and  columns  should  be  the  same  and  an  odd  number.  This  will  generate  a 
// perfect swastika pattern.

import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter odd number of rows (and columns): ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Please enter an odd number for a perfect swastika pattern.");
            return;
        }

        int mid = n / 2 + 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (i == 1) { // First row
                    if (j >= mid || j == 1)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                } else if (i < mid) { // Upper part before middle row
                    if (j == 1 || j == mid || j == n)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                } else if (i == mid) { // Middle row
                    System.out.print("* ");
                } else if (i < n) { // Lower part before last row
                    if (j == mid || j == n || j == n - (i - mid))
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                } else { // Last row
                    if (j <= mid || j == n)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
