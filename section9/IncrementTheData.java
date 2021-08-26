package assignments.section9;

import java.util.ArrayList;

public class IncrementTheData {

    public static Object solution(ArrayList<Integer> nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        return  nums.stream().map(e -> e + 10).toArray();
    }
}