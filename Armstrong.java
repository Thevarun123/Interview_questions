public class Armstrong {
    static boolean isArmstrong(int n) {
        int c = 0;
        int t = n;

        while (t > 0) {
            c++;
            t /= 10;
        }

        t = n;
        int sum = 0;
        while (t > 0) {
            int i = t % 10;

            sum = sum + (int) Math.pow(i, c);

            t /= 10;
        }

        return sum == n;

    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
}
