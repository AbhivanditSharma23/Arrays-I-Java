//Binary Search

import java.util.Scanner;

public class array03 {

    public static int BSearch(int arr[], int n, int key) {
        int s = 0;
        int e = n - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == key) return mid;
            else if (arr[mid] > key) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return -1; // key not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        int n = arr.length;

        while (true) {
            System.out.print("Enter a number to search (or press 'q' to exit): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("q")) {
                System.out.println("Exiting...");
                break;
            }

            try {
                int key = Integer.parseInt(input);
                int index = BSearch(arr, n, key);
                if (index != -1) {
                    System.out.println("Element found at index: " + index);
                } else {
                    System.out.println("Element not found");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'q' to quit.");
            }
        }

        sc.close();
    }
}
