// Given an array nums with n integers, your task is to check if it could become non-decreasing by modifying 
// at most one element.  
// Input: nums = [4,2,3] 
// Output: true 
// Explanation: You could modify the first 4 to 1 to get a non-decreasing array.

import java.util.Scanner;

public class program35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of an Array: ");
        int n = sc.nextInt();
        int nums[] = new int[n];

        System.out.print("Enter the Elements of an Array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter the Index of an Element where to Modify(0-" + (n - 1) + "): ");
        int index = sc.nextInt();

        if (index < 0 || index >= n) {
            System.out.println("Invalid index. Exiting.");
            return;
        }

        System.out.print("Enter the number at " + index + " to modify: ");
        int modify = sc.nextInt();

        nums[index] = modify;

        System.out.println("Modified Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        boolean isTrue = true;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                isTrue = false;
                break;
            }
        }

        System.out.println(isTrue ? "True" : "False");
    }
}
