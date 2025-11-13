// WAP for given N digits, arrange them to form the largest number divisible by 3. 

import java.util.Scanner;

public class program27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of an Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max[] = new int[n];

        for (int i = 0; i < n; i++) {
            while (arr[i] % 3 == 0) {
                max[i] = arr[i];
            }
        }
        System.out.println("Max:");
        for(int i = 0; i < max.length; i++){
            System.out.print(max[i] + " ");
        }
    }
}
