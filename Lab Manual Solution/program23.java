// Given an array, rotate the array to the right by k steps, where k is non-negative.  
// Input: nums = [1,2,3,4,5,6,7], k = 3 
// Output: [5,6,7,1,2,3,4] 

import java.util.Scanner;

public class program23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number of steps to rotate: ");
        int k = sc.nextInt();
        k = k % n;

        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

        System.out.println("Array after rotating to the right by " + k + " steps:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
