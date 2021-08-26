package assignments.section4;

import java.util.Stack;

public class DeleteMiddleOfStack{
    public static Stack solution(Stack stack){
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if(stack.size() == 0){
            return stack;
        }else {
            if (stack.size() % 2 != 0) {
                stack.remove((stack.size() / 2));
                return stack;
            } else {
                stack.remove((stack.size() / 2) - 1);
                return stack;
            }
        }
    }
}
