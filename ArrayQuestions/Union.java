import java.util.*;

public class Union {

    public static void union(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        for (int i : arr1)
            set.add(i);

        for (int i : arr2)
            set.add(i);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i : set)
            list.add(i);

        System.out.println(list);
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 4, 5, 6, 7, 8 };

        union(arr1, arr2);
    }
}
