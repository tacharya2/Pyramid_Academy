package assignments.section3;

import java.util.ArrayList;

public class FindSublistFromRange{
    public static ArrayList<Integer> solution(ArrayList<Integer> elms, int from, int to){
        // ↓↓↓↓ your code goes here ↓↓↓↓
        ArrayList<Integer> myList = new ArrayList<Integer>();
        if(elms.size() == 0){
            return elms;
        }else if(to == 0){
            return new ArrayList<>();
        }else{
            for(int i = from; i < to; i++){
                myList.add(elms.get(i));
            }
        }
        return myList;
    }
}
