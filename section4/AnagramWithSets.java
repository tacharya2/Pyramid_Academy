package assignments.section4;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class AnagramWithSets {
    public static boolean solution(String word1, String word2) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        if (word1.length() <= 1 && word2.length() <= 1) {
            return false;
        } else if (word1.length() != word2.length()) {
            return false;
        } else if (word1.equals(word2)) {
            return false;
        } else {
            for (int i = 0; i < word1.length(); i++) {
                set1.add(word1.toLowerCase().charAt(i));
            }
            for (int i = 0; i < word1.length(); i++) {
                set2.add(word2.toLowerCase().charAt(i));
            }
            if (set1.equals(set2)) {
                return true;
            } else {
                return false;
            }
        }
    }
}