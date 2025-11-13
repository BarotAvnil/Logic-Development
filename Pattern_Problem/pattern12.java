//WAP to implement a following pattern 
// 1 
// 1 * 1 
// 1 * 3 * 1
// 1 * 3 * 3 * 1 
// 1 * 3 * 5 * 3 * 1  

import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number ");
        int n = sc.nextInt();
        System.out.println("-------------------------");

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(j);
                }
            }
            for (int j = i + 1; j >= 1; j--) {
                if (j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }

        System.out.println("-------------------------");

    }
}