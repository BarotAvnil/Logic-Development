// Given an array of positive integers arr[] of size n, the task is to find the second largest distinct element in 
// the array. 
// Note: If the second largest element does not exist, return -1. 
// Input: arr[] = [12, 35, 1, 10, 34, 1] 
// Output: 34 
// Explanation: The largest element of the array is 35 and the second largest element is 34. 
// Input: arr[] = [10, 10, 10] 
// Output: -1 
// Explanation: The largest element of the array is 10 there is no second largest element.

import java.util.Scanner;

public class program34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of an Array: ");
        int n = sc.nextInt();
        System.out.print("Enter the Elements of an Array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int secondMax = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] != max) {
                if (secondMax == -1 || arr[i] > secondMax) {
                    secondMax = arr[i];
                }
            }
        }

        System.out.println("Second Largest Distinct Element from an Array is: "+secondMax);
    }
}
