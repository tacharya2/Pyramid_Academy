package assignments.section4;

import java.util.Stack;

public class ReverseStringStack{
    public static String solution(String word){
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String str = "";
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < word.length(); i++){
            stack.push(word.charAt(i));
        }
        while(!stack.isEmpty()){
            str += stack.pop();
        }
        return str;
    }
}
