package OOPS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountDuplicatesWithMap {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(List.of(1,1,2,3,3,2,1,4,5,6,9,8,4,5,6,4,5,6));
        System.out.println(solution(list));

    }
    public static HashMap<Integer,Integer> solution(ArrayList<Integer> nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.size(); i++){
            Integer integer = map.get(nums.get(i)); // nums.get(key) returns value of that key;
            if(integer == null){
                map.put(nums.get(i), 1);
            }else {
                map.put(nums.get(i), integer + 1);
            }
        }
        return map;
    }
}
