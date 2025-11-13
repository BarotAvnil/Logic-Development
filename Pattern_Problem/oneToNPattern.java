// 1
// 2 6  
// 3 7 10
// 4 8 11 13
// 5 9 12 14 15

import java.util.Scanner;

public class oneToNPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        int num = 1;

        for (int i = 1; i <= rows; i++) {
            int temp = num;
            for (int j = 1; j <= i; j++) {
                System.out.print(temp + " ");
                temp = temp + (rows - j);
            }
            System.out.println();
            num++;
        }
    }
}
