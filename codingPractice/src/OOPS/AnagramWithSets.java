package OOPS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AnagramWithSets {
    public static void main(String[] args) {
        String word1 = "Pataki1";
        String word2 = "ikataP";

        System.out.println(solution(word1, word2));
    }
    public static boolean solution(String word1, String word2) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for(int i = 0; i < word1.length(); i++){
            set1.add(Character.toLowerCase(word1.charAt(i)));
        }
        for(int i = 0; i < word2.length(); i++){
            set2.add(Character.toLowerCase(word2.charAt(i)));
        }
        if(set1.equals(set2)){
            return true;
        }
        return false;
    }
}
