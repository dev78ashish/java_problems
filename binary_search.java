import java.util.Scanner;
public class binary_search {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // target not found in array
    }
    public static void main(String[] args) {
        Scanner dev = new Scanner(System.in);

        System.out.println("Enter length of the array:");
        int n = dev.nextInt();
        int [] arr = new int[n];

        for(int i=0; i< arr.length; i++){
            arr[i] = dev.nextInt();
        }

        System.out.println("Enter element to search:");
        int target = dev.nextInt();

        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
