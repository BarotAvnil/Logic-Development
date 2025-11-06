// LCM of Two Numbers dynamically 
import java.util.Scanner;
public class lcmOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int lcm = (num1 > num2) ? num1 : num2;
        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                break;
            }
            lcm++;
        }
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}