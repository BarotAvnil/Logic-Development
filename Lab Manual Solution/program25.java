// WAP for following Scenario. 
// Given  n  rupees  and  a  chocolate  price  of  m  for  each  chocolate,  with  a  wrapper  exchange  offer  of  1 
// chocolate per k wrappers, calculate the total number of chocolates you can eat with n rupees.

import java.util.Scanner;

public class program25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total amount of money: ");
        int total = sc.nextInt();
        System.out.print("Enter the price of each chocolates: ");
        int chocolatePrice = sc.nextInt();
        System.out.print("Enter the amount of exchange of wrapper K: ");
        int k = sc.nextInt();
        int totalChocolates = total / chocolatePrice;
        int wrapper = totalChocolates;
        while (wrapper >= k) {
            int newChocolates = wrapper / k;
            totalChocolates += newChocolates;
            wrapper = newChocolates + (wrapper % k);

        }
        System.out.println("Total Number of Chocolates is: " + totalChocolates);
    }
}
