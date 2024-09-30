package ArrayQuestions;

import java.util.*;

public class Intersection {

    public static void intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : arr1)
            set.add(i);

        for (int i : arr2) {
            if (set.contains(i) && !list.contains(i)) {
                list.add(i);
            }
        }

        System.out.println(list);
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 4, 5, 6, 7, 8 };
        intersection(arr1, arr2);
    }
}
