package Pattern_Problem;

import java.util.Scanner;

public class fullDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int rows = sc.nextInt();
        for(int i = 0; i < rows; i++){
            for(int j = rows - i; j > 1; j--){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = rows - 2; i >= 0; i--){
            for(int j = rows - i; j > 1; j--){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
