package assignments.section4;

import java.util.*;

public class MapPrintKeys{
    public static void solution(HashMap<String,Integer> map){
        // ↓↓↓↓ your code goes here ↓↓↓↓
        for (var k:map.keySet()){
            System.out.println(k);
        }
    }
}
