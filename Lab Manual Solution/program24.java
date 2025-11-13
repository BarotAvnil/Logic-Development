// Given an array arr[], the task is to reverse the array. Reversing an array means rearranging the elements 
// such that the first element becomes the last, the second element becomes second last and so on. (Do 
// not use any additional Array) 
// Input: arr[] = {1, 4, 3, 2, 6, 5}   
// Output: {5, 6, 2, 3, 4, 1}

import java.util.Scanner;

public class program24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the Elements of an Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int temp[] = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = arr[n - i - 1];
        }

        System.out.print("Reverse Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
