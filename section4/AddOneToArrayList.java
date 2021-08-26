package assignments.section4;

import java.util.*;

public class AddOneToArrayList{
    public static ArrayList<Integer> solution(ArrayList<Integer> list) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        String st = "";
        for(int i = 0; i < list.size(); i++){
            st += list.get(i);
        }
        int num = Integer.parseInt(st);
        num += 1;
        ArrayList<Integer> al = new ArrayList<Integer>();
        while(num > 0){
            al.add(num % 10);
            num /= 10;
        }
        Collections.reverse(al);
        return al;
    }
}
