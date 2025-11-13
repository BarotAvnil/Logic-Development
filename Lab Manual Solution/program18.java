//Given two integer arrays nums1 and nums2, return an array of their intersection.  
// Each element in the result must appear as many times as it shows in both arrays and you may return the 
// result in sorted order. 

import java.util.Scanner;

public class program18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array 1: ");
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("Enter the Elements of Array 1: ");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }
        System.out.println("-------------------------------");
        System.out.print("Enter the Size of Array 2: ");
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        System.out.println("Enter the Elements of Array 2: ");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }
        int[] Merged = new int[n1 + n2];
        System.out.println("Merged Array: ");
        for (int i = 0; i < n1; i++) {
            Merged[i] = nums1[i];
        }
        for (int i = 0; i < n2; i++) {
            Merged[n1 + i] = nums2[i];
        }

        for (int i = 0; i < Merged.length; i++) {
            System.out.println(Merged[i] + " ");
        }

        System.out.println("Merged Sorted Array");
        int max = Merged[0];
        for (int i = 0; i < Merged.length; i++) {
            for (int j = 0; j < Merged.length - i - 1; j++) {
                if (Merged[j] > Merged[j + 1]) {
                    int temp = Merged[j];
                    Merged[j] = Merged[j + 1];
                    Merged[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < Merged.length; i++) {
            System.out.println(Merged[i] + " ");
        }
    }
}
