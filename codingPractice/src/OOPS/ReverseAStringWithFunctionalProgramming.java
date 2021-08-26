package OOPS;

import java.util.Arrays;
import java.util.Locale;

public class ReverseAStringWithFunctionalProgramming {
    public static void main(String[] args) {
        String word = "Palim";
        System.out.println(solution(word));
    }
    private static String solution(String word){
        return Arrays.stream(word.split("")).reduce("", (char1, char2) -> (char2 + char1).toLowerCase(Locale.ROOT));
    }
}
