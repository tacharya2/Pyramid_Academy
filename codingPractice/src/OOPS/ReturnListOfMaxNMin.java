package OOPS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReturnListOfMaxNMin {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-15,4,6,9,274,1,-55,18,3,6,6,4,8));
        System.out.println(solution(list));
    }

    private static List<Integer> solution(List<Integer> list) {
        List<Integer> myList = new ArrayList<>();
        int max = Integer.MIN_VALUE; // -infinity
        int min = Integer.MAX_VALUE; // + infinity

        if(list.size() == 0){
            myList.add(0);
            myList.add(0);
        }
        for(int i = 0; i < list.size(); i++ ){
            if(list.get(i) > max){
                max = list.get(i);
            }
        }
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) < min){
                min = list.get(i);
            }
        }
        myList.add(max);
        myList.add(min);
        return myList;
    }
}
