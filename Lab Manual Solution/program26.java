// Find the difference between the second largest element and the second smallest element of an array. 
// Input :  Enter the size of array: 7 
//               Enter 7 elements: 5 1 9 7 1 5 3 
// Output: Difference: 4

import java.util.Scanner;

public class program26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != firstLargest) {
                secondLargest = arr[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        }

        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != firstSmallest) {
                secondSmallest = arr[i];
            }
        }
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element.");
        }

        System.out.println("Difference: "+ (secondLargest - secondSmallest));

    }
}
