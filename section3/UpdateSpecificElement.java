package assignments.section3;

import java.util.ArrayList;

public class UpdateSpecificElement{
    public static ArrayList<Integer> solution(ArrayList<Integer> list, int val, int index){
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if(index > list.size() - 1){
            return list;
        }else if(list.size() - 1 < 0) {
            return list;
        }else if(index < 0){
            return list;
        } else {
            list.set(index, val);
            return list;
        }
    }
}
