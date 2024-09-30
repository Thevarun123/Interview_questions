package ArrayQuestions;

import java.util.*;

public class BinarySearch {

    public static int binarySearch(int[] arr, int x) {
        Arrays.sort(arr);

        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.print(binarySearch(arr, 2));
    }
}
