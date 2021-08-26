package assignments.section4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class OrganizeTheStack{
    public static Stack<Integer> solution(Stack<Integer> stack){
        // ↓↓↓↓ your code goes here ↓↓↓↓
        ArrayList<Integer> list = new ArrayList<>();

        if(stack.size() <= 1){
            return stack;
        }else {

            while (!stack.isEmpty()) {
                list.add(stack.pop());
            }
            Collections.sort(list);
            Collections.reverse(list);

            // 	list.sort(Comparator.reverseOrder());
            stack.addAll(list);
            return stack;
        }
    }
}
/*
       if(stack.isEmpty()){
           return stack;
       }else {
           stack.sort(Comparator.reverseOrder());
           return stack;
       }
 */
