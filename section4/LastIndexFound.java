package assignments.section4;

import java.util.ArrayList;

public class LastIndexFound{
    public static int solution(ArrayList<Integer> nums, int numToFind){
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int indeX = 0;
        if(!nums.contains(numToFind)){
            return -1;
        }else{
            indeX = nums.lastIndexOf(numToFind);
        }
        return indeX;
    }
}
