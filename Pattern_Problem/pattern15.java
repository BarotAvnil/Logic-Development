package Pattern_Problem;
// Implement a following pattern 
// 1 
// 1 2 1 
// 1 * 3 * 1 
// 1 * * 4 * * 1 
// 1 * * * 5 * * * 1 
// 1 * * * * 6 * * * *1
 
import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.println("1");
            } else if (i == 2) {
                System.out.println("1 2 1");
            } else {
                System.out.print("1 ");
                for (int j = 1; j <= i - 2; j++) {
                    System.out.print("* ");
                }
                System.out.print(i + " ");
                for (int j = 1; j <= i - 2; j++) {
                    System.out.print("* ");
                }
                System.out.println("1");
            }
        }
    }
}

