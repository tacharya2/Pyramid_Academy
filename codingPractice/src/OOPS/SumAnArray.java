package OOPS;

import java.util.Arrays;

public class SumAnArray {
    public static void main(String[] args) {
        int [] nums = {1,2,3,6,5,4,7,8,9};
        solution(nums);
        System.out.println(solution(nums));
    }

    private static int solution(int[] nums) {
        return Arrays.stream(nums).reduce(0,(n1, n2) -> n1 + n2);
    }
}
