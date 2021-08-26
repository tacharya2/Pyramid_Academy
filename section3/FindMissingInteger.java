package assignments.section3;

import java.util.ArrayList;
import java.util.List;


public class FindMissingInteger{
    public static int solution(ArrayList<Integer> numbers){
        // ↓↓↓↓ your code goes here ↓↓↓↓
       List<Integer> list = new ArrayList<Integer>();
       int missing = 0;
        for(int i = 1; i < numbers.size()+1; i++){
            list.add((i));
        }
        if(numbers.equals (list)){
            return 0;
        }else{
            for(int i = 0; i < list.size(); i++){
                if(list.get(i)!= numbers.get(i)){
                    missing = list.get(i);
                    break;
                }
            }
        }
        return missing;
    }
}
