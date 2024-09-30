public class Fibonacci {

    public static void fibTillN(int n) {

        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;

        }

    }

    public static int fib(int n) {
        if (n <= 1)
            return n;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        // System.out.println(fib(0));
        fibTillN(5);
    }
}
