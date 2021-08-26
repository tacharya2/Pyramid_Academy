package OOPS;

import java.util.Arrays;

public class SquaringAnArray {
    public static void main(String[] args) {
        int [] nums = {1,2,3,6,5,4,7,8,9};
        System.out.println((solution(nums).toString()));
    }

    private static Object solution(int[] nums) {

       return Arrays.stream(nums).map(e -> e + 10).toArray();

    }
}
