package assignments.section2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MeanMedian{
    public static String solution(int a, int b, int c){
        // ↓↓↓↓ your code goes here ↓↓↓↓
        List<Integer> list = new ArrayList<Integer>(List.of(a,b,c));

        Collections.sort(list);

        float mean = (float)(a + b + c) / 3;
        int median = list.get(1);

        return String.valueOf(mean) +" "+ String.valueOf(median);
    }
}
