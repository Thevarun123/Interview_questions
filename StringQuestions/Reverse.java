package StringQuestions;

import java.util.*;

public class Reverse {

    public static void reverse(String str) {
        String[] arr = str.split(" ");
        String ans = "";

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

            for (int j = s.length() - 1; j >= 0; j--) {
                ans = ans + s.charAt(j);
            }

            if (i != arr.length - 1)
                ans = ans + " ";

        }

        System.out.println(ans);
        System.out.println(ans.length());
        System.out.println(str.length());
    }

    public static void main(String[] args) {
        String str = "This is going to be reversed";
        reverse(str);
    }
}
