// Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose 
// sum is equal to K.  
// Input: N = 4, K = 6, arr[] = {1, 5, 7, 1} Output: 2

import java.util.Scanner;

public class program36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of an Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the element of an Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the Target Sum: ");
        int sum = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] + arr[j] == sum) {
                    count++;
                }
            }
        }
        System.out.println("Pairs Count: " + count);
    }

}
