
// Find union of two arrays dynamically
import java.util.Scanner;

public class unionTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the number of elements in second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] unionArray = new int[n1 + n2];
        int k = 0;
        for (int i = 0; i < n1; i++) {
            unionArray[k++] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            boolean found = false;
            for (int j = 0; j < n1; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                unionArray[k++] = arr2[i];
            }
        }
        System.out.println("Union of the two arrays:");
        for (int i = 0; i < k; i++) {
            System.out.print(unionArray[i] + " ");
        }
    }
}
