//Digit in reverse order dynamically
import java.util.*;
public class digitInReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.print("The digits in reverse order are: ");
        while (number > 0) {
            int digit = number % 10;
            System.out.print(digit + " ");
            number /= 10;
        }
    }
}
