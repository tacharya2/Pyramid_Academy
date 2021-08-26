package assignments.section4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountDuplicatesWithMap{
    public static HashMap<Integer,Integer> solution(ArrayList<Integer> nums){ // {1,2,3,2,1,1,2,3,4,5,6,4,5,8,6,4,1,2,}
        // ↓↓↓↓ your code goes here ↓↓↓↓
        HashMap<Integer, Integer> occurances = new HashMap<>();

        for(int i = 0; i < nums.size(); i++){
            Integer integer = occurances.get(nums.get(i));
            if(integer == null){
                occurances.put(nums.get(i), 1);
            }else{
                occurances.put(nums.get(i), integer+1);
            }
        }
        return occurances;
    }
}
