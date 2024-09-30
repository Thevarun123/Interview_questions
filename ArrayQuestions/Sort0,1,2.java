public class Sort0,1,2
{

    static void sort(int[] arr) {
        int i = 0, j = 0, k = arr.length - 1;

        while (i <= k) {
            if (arr[i] == 0) {
                swap(arr, i, j);
                i++;
                j++;
            } else if (arr[i] == 1) {
                i++;
            } else {
                swap(arr, i, k);
                k--;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        int[] demo = { 1, 1, 0, 2, 0, 0, 1, 0 };
        sort(demo);
    }
}
