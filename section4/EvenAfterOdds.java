package assignments.section4;

import java.util.ArrayList;

public class EvenAfterOdds{
    public static ArrayList<Integer> solution(ArrayList<Integer> nums){
        // ↓↓↓↓ your code goes here ↓↓↓↓
        ArrayList<Integer> odds = new ArrayList<>();
        ArrayList<Integer> evens = new ArrayList<>();
        if(nums.size() <= 0){
            return nums;
        }else{
            for(int i = 0; i < nums.size(); i++) {
                if (nums.get(i) % 2 == 0) {
                    evens.add(nums.get(i));
                }else {
                    odds.add(nums.get(i));
                }
            }
            evens.addAll(0,odds);
        }
        return evens;
    }
}
