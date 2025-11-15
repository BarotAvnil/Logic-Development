// Write a Function that returns either 1 or 0 based on following condition if the array is in ascending order 
// and occurrence of that number at least 3 then it should return 1 otherwise it should return 0.  
// e.g. if A=[1,1,1,2,2] it should return 0, if A= [1,1,1,3,3,3,3] it should return 1.

import java.util.Scanner;

public class program38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of an Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = ascendingOccurence(arr);
        System.out.println(ans);

    }

    static int ascendingOccurence(int arr[]) {

        // Check for ascending order
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return 0;
            }
        }

        // Count for the occurrence of last number
        int x = arr[arr.length - 1];
        int count = 1;

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] == x) {
                count++;
            } else {
                break;
            }
        }

        if (count >= 3) {
            return 1;
        } else {
            return 0;
        }
    }
}
