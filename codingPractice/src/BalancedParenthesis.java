import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
    String str1 = "(((fbf)bfbew)bfubwe)";
    String str2 = "(((fbf)bfbew)bfubwe))";
        System.out.println(solution(str1));
        System.out.println(solution(str2));
    }
    public static String solution(String str){
        Stack<Character> stack = new Stack<>();
        if(str.isEmpty()){
            return "unbalanced";
        }else{
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == '('){
                    stack.push(str.charAt(i));
                }
                if(str.charAt(i) == '('){
                    if(stack.isEmpty()){
                        return "unbalanced";
                    }
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()){
            return "balanced";
        }else{
            return "unbalanced";
        }

    }
}
