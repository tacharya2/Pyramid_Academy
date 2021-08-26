package assignments.section4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class RetrieveValueFromGivenKey{
    public static int solution(HashMap<Integer,Integer> map, Integer value){
        // ↓↓↓↓ your code goes here ↓↓↓↓
      if(map.containsKey(value)) {
          return map.get(value);
      }
        return 0;
    }
}
//  return map.getOrDefault(key, 0);