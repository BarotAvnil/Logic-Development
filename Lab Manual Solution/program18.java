//Given two integer arrays nums1 and nums2, return an array of their intersection.  
// Each element in the result must appear as many times as it shows in both arrays and you may return the 
// result in sorted order. 

import java.util.Scanner;

public class program18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Array 1
        System.out.print("Enter the Size of Array 1: ");
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("Enter the Elements of Array 1:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        // Input Array 2
        System.out.print("Enter the Size of Array 2: ");
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        System.out.println("Enter the Elements of Array 2:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        // Sort both arrays (Bubble Sort)
        for (int i = 0; i < n1 - 1; i++) {
            for (int j = 0; j < n1 - i - 1; j++) {
                if (nums1[j] > nums1[j + 1]) {
                    int temp = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < n2 - 1; i++) {
            for (int j = 0; j < n2 - i - 1; j++) {
                if (nums2[j] > nums2[j + 1]) {
                    int temp = nums2[j];
                    nums2[j] = nums2[j + 1];
                    nums2[j + 1] = temp;
                }
            }
        }

        // Intersection logic
        int i = 0, j = 0;
        int[] result = new int[Math.min(n1, n2)];
        int k = 0;

        while (i < n1 && j < n2) {
            if (nums1[i] == nums2[j]) {
                result[k++] = nums1[i];
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        // Output
        System.out.println("Intersection Array:");
        for (int x = 0; x < k; x++) {
            System.out.print(result[x] + " ");
        }
    }
}
