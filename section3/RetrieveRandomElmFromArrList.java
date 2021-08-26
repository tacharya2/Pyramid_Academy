package assignments.section3;

import java.util.ArrayList;

public class RetrieveRandomElmFromArrList{
    public static Integer solution(ArrayList<Integer> arrList, int index){
        // ↓↓↓↓ your code goes here ↓↓↓↓
       if(arrList.size()-1  < index){
           return 0;
       }else if(arrList.size() -1 <= 0){
           return 0;
       }
        return arrList.get(index);
    }
}
