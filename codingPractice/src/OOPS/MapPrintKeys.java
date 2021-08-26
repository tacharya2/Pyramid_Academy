package OOPS;

import java.util.HashMap;
import java.util.Map;

public class MapPrintKeys {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap();
        map.put(23, 4);
        map.put(24, 5);
        map.put(25, 6);

        for(var e: map.keySet()){
            System.out.println(e);
        }
    }
}
