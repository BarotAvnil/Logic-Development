// Take an Input in the form of Binary String that contains only 0’s and 1’s and convert this number into 
// integer.  
// Input: 101.110 
// Output: 5.75 

import java.util.Scanner;

public class program33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Binary Number: ");
        String binary = sc.nextLine();

        String[] parts = binary.split("\\.");

        int intPart = Integer.parseInt(parts[0], 2);

        double fracPart = 0.0;
        if (parts.length > 1) {
            String frac = parts[1];
            for (int i = 0; i < frac.length(); i++) {
                if (frac.charAt(i) == '1') {
                    fracPart += Math.pow(2, -(i + 1));
                }
            }
        }

        double result = intPart + fracPart;
        System.out.println("Decimal Value: " + result);
    }
}
