package assignments.section4;

import java.util.HashSet;

public class SetContainsLetter{
    public static Object solution(HashSet<Integer> nums, int elm){
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if(nums.contains(elm)){
            return elm;
        }
        return "?";
    }
}
