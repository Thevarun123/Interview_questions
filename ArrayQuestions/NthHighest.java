// package ArrayQuestions;

import java.util.*;

public class NthHighest {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 4, 1 };

        int n = 2;

        Arrays.sort(arr);

        int ans = arr[arr.length - n];

        System.out.println("Highest " + ans);
        System.out.println("Lowest " + arr[n - 1]);
    }
}
