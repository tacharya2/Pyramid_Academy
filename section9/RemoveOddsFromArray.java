package assignments.section9;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RemoveOddsFromArray {

    public static int[] solution(int[] nums) {
        // ↓↓↓↓ your code goes here filter ↓↓↓↓
       return Arrays.stream(nums).filter(e -> e % 2 == 0).toArray();
    }
}
