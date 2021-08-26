package OOPS;


import java.util.ArrayList;
import java.util.Arrays;

public class MissingInt {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        System.out.println(list);
        System.out.println(solution(list));
    }

    private static int solution(ArrayList<Integer> list) {
        ArrayList<Integer> myList = new ArrayList<>();


        for(int i = 1; i <= list.get(list.size()-1) ; i++){
            myList.add(list.get(i));
        }

        return 0;
    }
}
