// WAP to check whether number is present in array or not (using recursion only) and the function’s syntax 
// is given below 
// // int isInArray(int a [], int m); Where int a [] is Array of integer and m is element to be searched.

// import java.util.Scanner;

public class program30 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int m = 3;

        int index = isInArray(a, m, 0);

        if (index == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element found at index " + (index+1));
        }
    }

    static int isInArray(int a[], int m, int i) {
        if (i >= a.length) {
            return -1;
        } else if (a[i] == m) {
            return i;
        }
        return isInArray(a, m, i + 1); 
    }
}
