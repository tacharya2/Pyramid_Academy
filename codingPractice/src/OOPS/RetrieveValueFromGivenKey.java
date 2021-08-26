package OOPS;

import java.util.HashMap;
import java.util.Map;

public class RetrieveValueFromGivenKey {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap();
        map.put(23, 4);
        map.put(24, 5);
        map.put(25, 6); // (key, value)
        System.out.println(solution(map, 2));

    }
    public static int solution(HashMap<Integer,Integer> map, Integer key){

  if(map.containsKey(key)){
      int val = map.get(key);
      return val;
      }
      return 0;
    }
}
