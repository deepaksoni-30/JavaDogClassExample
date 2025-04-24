import java.util.Scanner;

public class BinarySearchExample {

    
    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == key) {
                return mid; 
            } else if (array[mid] < key) {
                low = mid + 1; 
            } else {
                high = mid - 1;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

       
        int[] array = new int[n];
        System.out.println("Enter " + n + " sorted integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

       
        System.out.print("Enter value to search: ");
        int key = scanner.nextInt();

      
        int result = binarySearch(array, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }
}