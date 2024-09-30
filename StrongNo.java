public class StrongNo {

    static int facto(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++)
            fact = fact * i;

        return fact;
    }

    static boolean detectStrong(int num) {

        int digit, sum = 0;
        int temp = num;

        // calculate 1! + 4! + 5!
        while (temp != 0) {
            digit = temp % 10;

            sum = sum + facto(digit);
            temp /= 10;
        }

        // returns 1 if both equal else 0
        return sum == num;

    }

    public static void main(String[] args) {
        System.out.println(detectStrong(1452));
    }
}
