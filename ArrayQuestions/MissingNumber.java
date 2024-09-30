public class MissingNumber {

    public static void missingNumber(int[] arr, int n) {
        int totalSum = (n * (n + 1)) / 2;

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        System.out.print(totalSum - sum);
    }

    public static void main(String[] args) {
        missingNumber(new int[] { 1, 2, 5, 4 }, 5);
    }
}
