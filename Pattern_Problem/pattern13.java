package Pattern_Problem;
// Implement a following pattern 
// * * * * * * * 
//   *       *   
//     *   *
//       *
//     *   *
//   *       *
// * * * * * * * 

import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int n = rows;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || i == j || j == n - i + 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
