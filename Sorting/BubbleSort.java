public class BubbleSort {

    public static void BubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                // swap
                if (arr[j + 1] < arr[j]) {
                    int t = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 5, 4 };
        BubbleSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");

        }
    }
}
