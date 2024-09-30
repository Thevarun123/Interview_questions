// package ArrayQuestions;

import java.util.*;

public class Duplicate {

    public static boolean duplicate(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int i : arr) {
            if (set.contains(i)) {
                return true;
            } else {
                set.add(i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.print(duplicate(arr));
    }
}
