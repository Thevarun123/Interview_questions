package Sorting;

public class SelectionSort {

    static void SelectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int a = i;
            int min = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    a = j;
                }
            }

            // swap
            if (min != arr[i]) {
                int t = arr[i];
                arr[i] = min;
                arr[a] = t;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        SelectionSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
