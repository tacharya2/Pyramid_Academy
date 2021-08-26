package assignments.section4;

import java.util.ArrayList;
import java.util.Comparator;

public class SortArrayListDescending{
    public static ArrayList<Integer> solution(ArrayList<Integer> list){
        // ↓↓↓↓ your code goes here ↓↓↓↓
        list.sort(Comparator.reverseOrder());
        return list;
    }
}
