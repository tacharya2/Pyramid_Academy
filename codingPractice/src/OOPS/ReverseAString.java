package OOPS;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Stream;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "Palpali";
        System.out.println(solution(str));
    }

    private static String solution(String str) {

        //return Arrays.stream(str.split("")).reduce("", (char1,char2) -> char2 + char1).toLowerCase(Locale.ROOT);
        return Stream.of(str.split("")).reduce("", (char1, char2) -> char2 + char1).toLowerCase(Locale.ROOT);

    }
}
