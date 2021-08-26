package assignments.section4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class MaxSubArray{
    public static ArrayList<Integer> solution(ArrayList<Integer> nums){
        // ↓↓↓↓ your code goes here ↓↓↓↓
        ArrayList<Integer> list = new ArrayList<>(nums);
        nums.sort(Comparator.reverseOrder());
        Set<Integer> set = new HashSet<>();

        if(nums.size() == 0){
            return null;
        }else {
            int sum = nums.get(0);
            set.add(nums.get(0));
            for (int i = 1; i < nums.size(); i++) {
                if (sum + nums.get(i) > sum) {
                    set.add(nums.get(i));
                    sum += nums.get(i);
                }
            }


            return list;
        }
    }
}
