// Convert Octal to Decimal dynamically
import java.util.Scanner;

public class convertOctalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        int octal = sc.nextInt();
        int decimal = 0;
        int base = 1;

        while (octal > 0) {
            int lastDigit = octal % 10;
            decimal += lastDigit * base;
            base *= 8;
            octal /= 10;
        }

        System.out.println("Decimal equivalent: " + decimal);
    }
}
