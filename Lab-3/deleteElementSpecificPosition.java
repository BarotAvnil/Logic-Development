// Delete an element from a specific position in an array (with and without using new array) dynamically

import java.util.Scanner;

public class deleteElementSpecificPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the position to delete the element (0 to " + (n - 1) + "): ");
        int position = sc.nextInt();
        // Deletion using new array
        if (position < 0 || position >= n) {
            System.out.println("Invalid position for deletion using new array.");
        } else {
            int[] newArr = new int[n - 1];
            for (int i = 0, j = 0; i < n; i++) {
                if (i != position) {
                    newArr[j++] = arr[i];
                }
            }
            System.out.println("Array after deletion using new array:");
            for (int i = 0; i < newArr.length; i++) {
                System.out.print(newArr[i] + " ");
            }
            System.out.println();
        }
        // Deletion without using new array
        if (position < 0 || position >= n) {
            System.out.println("Invalid position for deletion without new array.");
        } else {
            for (int i = position; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--; 
            System.out.println("Array after deletion without using new array:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
