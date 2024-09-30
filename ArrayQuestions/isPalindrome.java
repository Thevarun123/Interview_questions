// package ArrayQuestions;

public class isPalindrome {

    public static boolean isPalindrone(int n) {
        int rev = 0;

        int t = n;

        while (t > 0) {
            rev = rev * 10 + (t % 10);
            t /= 10;
        }

        return rev == n;
    }

    public static void main(String[] args) {
        // String str = "naman";
        System.out.print(isPalindrone(-12321));
    }
}
