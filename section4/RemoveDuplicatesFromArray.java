package assignments.section4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicatesFromArray{
    public static int[] solution(int[] nums){
        // ↓↓↓↓ your code goes here ↓↓↓↓
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
       int [] al = new int[set.size()];

        Iterator<Integer> value = set.iterator();
            for(int i = 0; i < al.length; i++){
                al[i] = (int)value.next();
            }
        return al;
    }
}
