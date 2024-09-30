public class Sort0 {

    public static void sort(int[] arr) {
        int i = 0, j = 0;

        while (i <= arr.length) {
            if (arr[i] == 0) {
                swap(arr, i, j);
                i++;
                j++;
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        int[] demo = { 1, 1, 0, 1, 0, 0, 1, 0 };
        sort(demo);
    }
}
