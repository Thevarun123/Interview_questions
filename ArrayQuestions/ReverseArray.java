// package ArrayQuestions;

public class ReverseArray {
    public static void reverseArray(int[] arr) {
        reverse(arr, 0, arr.length - 1);
    }

    public static void reverse(int[] arr, int i, int j) {
        while (i <= j) {

            // swap
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        //
        int[] arr = { 2, 3, 5, 1, 4 };
        reverseArray(arr);

        for (int i : arr)
            System.out.print(i + " ");

    }
}
