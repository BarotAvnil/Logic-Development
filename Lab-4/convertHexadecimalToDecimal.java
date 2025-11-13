// Convert Hexadecimal to Decimal dynamically
import java.util.Scanner;
public class convertHexadecimalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hex = sc.nextLine();
        int decimal = 0;
        int base = 1;

        for (int i = hex.length() - 1; i >= 0; i--) {
            char ch = hex.charAt(i);
            int value;
            if (ch >= '0' && ch <= '9') {
                value = ch - '0';
            } else if (ch >= 'A' && ch <= 'F') {
                value = ch - 'A' + 10;
            } else if (ch >= 'a' && ch <= 'f') {
                value = ch - 'a' + 10;
            } else {
                System.out.println("Invalid hexadecimal digit: " + ch);
                return;
            }
            decimal += value * base;
            base *= 16;
        }

        System.out.println("Decimal equivalent: " + decimal);   
    }
}
