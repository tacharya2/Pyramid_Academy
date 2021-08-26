package assignments.section4;

import java.util.*;

public class FindMissingNums{
    public static ArrayList<Integer> solution(ArrayList<Integer> nums){
        // ↓↓↓↓ your code goes here ↓↓↓↓
        Set<Integer> set = new HashSet<>();
        for(int i = 1; i < 101; i++){
            set.add(i);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.size(); i++){
            if(set.contains(nums.get(i)));
            set.remove(nums.get(i));
        }
        Iterator<Integer> iter = set.iterator();
        for(int i = 0; i < set.size(); i++){
            list.add(iter.next());
        }

    return list;
    }
}
/*
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i < 101; i++) {
            set.add(i);
        }
        set.removeAll(nums);
        return new ArrayList<>(set);
 */
