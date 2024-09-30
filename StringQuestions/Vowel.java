package StringQuestions;

import java.util.*;

public class Vowel {

    public static void vowel(String str) {

        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (set.contains(str.charAt(i))) {
                count++;
            }
        }

        System.out.print(count + " ");
    }

    public static void main(String[] args) {
        String str = "attahhettikkojju";
        vowel(str);
    }
}
