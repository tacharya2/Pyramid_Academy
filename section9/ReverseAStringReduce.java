package assignments.section9;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseAStringReduce {

    public static String solution(String word) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
       return Stream.of(word.split("")).reduce("", (character1, character2) -> character2 + character1);
    }
}
