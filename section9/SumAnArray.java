package assignments.section9;

import java.util.Arrays;

public class SumAnArray {

    public static int solution(int[] nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        //return Arrays.stream(nums).reduce(0,(n1, n2) -> n1 + n2);
        return Arrays.stream(nums).reduce(0, Integer::sum);
    }
}
