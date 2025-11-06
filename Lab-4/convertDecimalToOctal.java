// Decimal to Octal conversion
import java.util.Scanner;

public class convertDecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = sc.nextInt();

        int octalNumber = 0;
        int remainder = 0;
        int quotient = 0;

        while (decimalNumber > 0) {
            quotient = decimalNumber / 8;
            remainder = decimalNumber % 8;
            octalNumber = octalNumber * 10 + remainder;
            decimalNumber = quotient;
        }

        int reverse = 0;
        while (octalNumber > 0) {
            reverse = reverse * 10 + (octalNumber % 10);
            octalNumber /= 10;
        }

        System.out.println("Octal Number: " + reverse);
    }
}
