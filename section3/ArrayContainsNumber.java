package assignments.section3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayContainsNumber{
    public static boolean solution(int[] nums, int num){
        // ↓↓↓↓ your code goes here ↓↓↓↓
     for(int i = 0; i < nums.length;i++ ){
         if(nums[i] == num){
             return true;
         }
     }
        return false;
    }
}
