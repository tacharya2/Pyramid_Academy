package assignments.section4;

import java.util.HashMap;
import java.util.Map;

public class CreateAHuman{
    public static HashMap<String, Object> solution(String name, Long age){
        // ↓↓↓↓ your code goes here ↓↓↓↓
        HashMap<String, Object> map = new HashMap<String, Object>();
       map.put("name", name);
       map.put("age", age);
        return map;
    }
}
