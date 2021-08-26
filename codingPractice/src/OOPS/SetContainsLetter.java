package OOPS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class SetContainsLetter {
    public static void main(String[] args) {
        Set<Object> set = new HashSet<Object>(Arrays.asList(1,2,3,6,5,4,4));
        Integer integer= 4;
        System.out.println(solution(set, integer));
    }
   public static Object solution( Set<Object> set, int integer){
        if(set.contains(integer)){
            return integer;
        }
        return "?";
   }
}
