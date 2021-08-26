package assignments.section9;

import java.util.Arrays;

public class SquaringAnArray {

    public static int[] solution(int[] nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        return Arrays.stream(nums).map(e -> e * e).toArray();
    }
}
