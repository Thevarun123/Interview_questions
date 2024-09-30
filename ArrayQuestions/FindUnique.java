// package ArrayQuestions;

public class FindUnique {

    public static int unique(int[] arr) {
        int xor = 0;

        for (int i : arr) {
            xor = xor ^ i;
        }

        return xor;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 1 };
        System.out.print(unique(arr));
    }
}
