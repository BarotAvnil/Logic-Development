//Sum of series 1 + 4 + 9 + ... + n dynamically
import java.util.*;
public class sumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        System.out.println("The sum of the series 1 + 4 + 9 + ... + " + (n*n) + " is: " + sum);
    }
}
