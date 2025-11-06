// Insert an element at a specific position in an array (with and without using new array) dynamically
public class insertElementSpecificPosition {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n + 1]; // +1 to accommodate insertion without new array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to be inserted: ");
        int element = sc.nextInt();
        System.out.print("Enter the position to insert the element (0 to " + n + "): ");
        int position = sc.nextInt();

        // Insertion using new array
        int[] newArr = new int[n + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == position) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[j++];
            }
        }
        System.out.println("Array after insertion using new array:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();

        // Insertion without using new array
        if (position < 0 || position > n) {
            System.out.println("Invalid position for insertion without new array.");
        } else {
            for (int i = n - 1; i >= position; i--) {
                arr[i + 1] = arr[i];
            }
            arr[position] = element;
            n++; 

            System.out.println("Array after insertion without using new array:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
