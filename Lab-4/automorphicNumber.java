// Automorphic Number: A number whose square ends with the same digits as the number itself.

import java.util.Scanner;
public class automorphicNumber {
    public static boolean isAutomorphic(int n) {
        int square = n * n;
        if (square != 0) {
            while (n > 0) {
                if (n % 10 != square % 10) {
                    return false;
                }
                n /= 10;
                square /= 10;
            }
            return true;
        } else {
            return true; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (isAutomorphic(number)) {
            System.out.println(number + " is an automorphic number.");
        } else {
            System.out.println(number + " is not an automorphic number.");
        }
        sc.close();
    }
}
