package assignments.section2;

public class FirstAndLast{
    public static boolean solution(String word){
        // ↓↓↓↓ your code goes here ↓↓↓↓

        int n = word.length();
        if(n == 1 || n == 0){
            return true;
        }
        else return word.charAt(0) == word.charAt(n - 1);
    }
}
