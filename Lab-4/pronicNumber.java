// Pronic numbers are numbers that can be expressed as the product of two consecutive integers,
// i.e., n(n + 1) for some non-negative integer n.
import java.util.Scanner;

public class pronicNumber {
    public static boolean isPronic(int n) {
        for (int i = 0; i <= n; i++) {
            if (i * (i + 1) == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (isPronic(number)) {
            System.out.println(number + " is a pronic number.");
        } else {
            System.out.println(number + " is not a pronic number.");
        }
        sc.close();
    }
}
