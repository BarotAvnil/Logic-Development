// Convert Decimal to Hexadecimal dynamically

import java.util.Scanner;

public class convertDecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        String answer = "";

        while (decimal != 0) {
            int remainder = decimal % 16;
            char hexChar;
            if (remainder < 10) {
                hexChar = (char) (remainder + '0');
            } else {
                hexChar = (char) (remainder - 10 + 'A');
            }
            answer = hexChar + answer;
            decimal /= 16;
        }

        System.out.println("Hexadecimal equivalent: " + answer);
    }
}
