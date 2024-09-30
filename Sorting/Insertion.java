public class Insertion {

    static void Insertion(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 5, 4 };
        Insertion(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
