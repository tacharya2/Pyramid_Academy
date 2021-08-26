package assignments.section9;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MapReduce {

    public static int[] solution(ArrayList<ArrayList<Integer>> innerNums){
        // ↓↓↓↓ your code goes here ↓↓↓↓

       return innerNums.stream().map(e -> e.stream().reduce(0, (n1, n2) -> n1 + n2)).mapToInt(Integer::intValue).toArray();
    }
}