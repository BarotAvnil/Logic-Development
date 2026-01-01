// Given 2 sorted arrays a[] and b[], each of size n, the task is to find the median of the array obtained 
// after merging a[] and b[]. 
// Input: a[] = [1, 12, 15, 26, 38], b[] = [2, 13, 17, 30, 45] 
// Output: 16 
// Explanation: The middle two elements are 15 and 17,  
// so median = (15 + 17)/2 = 16

import java.util.Scanner;

public class program40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of 1st Array: ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter all the elements of 1st Array (sorted): ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the Size of 2nd Array: ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter all the elements of 2nd Array (sorted): ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int mergeArr[] = new int[n1 + n2];
        for (int i = 0; i < n1; i++) {
            mergeArr[i] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            mergeArr[n1 + i] = arr2[i];
        }

        for (int i = 0; i < mergeArr.length; i++) {
            for (int j = i + 1; j < mergeArr.length; j++) {
                if (mergeArr[i] > mergeArr[j]) {
                    int temp = mergeArr[i];
                    mergeArr[i] = mergeArr[j];
                    mergeArr[j] = temp;
                }
            }
        }

        System.out.println("Merged & Sorted Array:");
        for (int i = 0; i < mergeArr.length; i++) {
            System.out.print(mergeArr[i] + " ");
        }
        System.out.println();

        int total = mergeArr.length;
        double median;

        if (total % 2 == 1) {
            median = mergeArr[total / 2];
        } else {
            int mid1 = mergeArr[(total / 2) - 1];
            int mid2 = mergeArr[total / 2];
            median = (mid1 + mid2) / 2.0;
        }

        System.out.println("Median = " + median);
    }
}
