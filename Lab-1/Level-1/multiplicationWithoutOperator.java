//Multiplication of two numbers without using * operator dynamically
import java.util.*;
public class multiplicationWithoutOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int result = 0;
        for (int i = 0; i < num2; i++) {
            result += num1;
        }
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + result);
    }
}
