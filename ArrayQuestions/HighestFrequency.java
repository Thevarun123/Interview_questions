package ArrayQuestions;

public class HighestFrequency {

    public static void highestFrequency(int[] arr) {

        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(i, max);
        }

        int[] freq = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            freq[num]++;
        }

        int largestFreq = 0;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > largestFreq) {
                largestFreq = i;
            }
        }

        System.out.print(largestFreq);

    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 2, 1, 4, 2 };
        highestFrequency(arr);

    }
}
