// WAP to multiply two matrices with error checking for dimension compatibility.

// WAP to multiply two matrices with error checking for dimension compatibility.

import java.util.Scanner;

public class program37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows of Matrix A: ");
        int r1 = sc.nextInt();
        System.out.print("Enter columns of Matrix A: ");
        int c1 = sc.nextInt();

        System.out.print("Enter rows of Matrix B: ");
        int r2 = sc.nextInt();
        System.out.print("Enter columns of Matrix B: ");
        int c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Error: Matrix multiplication not possible!");
            System.out.println("Columns of A must be equal to Rows of B.");
            return;
        }

        int[][] A = new int[r1][c1];
        System.out.println("\nEnter Matrix A:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int[][] B = new int[r2][c2];
        System.out.println("\nEnter Matrix B:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        int[][] C = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                C[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("\nResultant Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
