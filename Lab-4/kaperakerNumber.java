// A Kaprekar number is a number whose square when divided into two parts
//  and such that sum of parts is equal to the original number and none of the parts has value 0.
import java.util.Scanner;
public class kaperakerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int square = number * number;
        String squareStr = Integer.toString(square);
        int len = squareStr.length();
        String leftPartStr = len > 1 ? squareStr.substring(0, len / 2) : "0";
        String rightPartStr = squareStr.substring(len / 2);
        int leftPart = Integer.parseInt(leftPartStr);
        int rightPart = Integer.parseInt(rightPartStr);
        if (leftPart + rightPart == number) {
            System.out.println(number + " is a Kaprekar number.");
        } else {
            System.out.println(number + " is not a Kaprekar number.");
        }
        sc.close();
    }
}
