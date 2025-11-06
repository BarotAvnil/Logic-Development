//Find the sum of series 1-2+3-4+5-6...n dynamically
import java.util.Scanner;
public class sumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }
        System.out.println("The sum of the series up to " + n + " is: " + sum);
    }
}