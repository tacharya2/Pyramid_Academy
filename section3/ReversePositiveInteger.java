package assignments.section3;

public class ReversePositiveInteger{
    public static int solution(int number){
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String s = String.valueOf(number);
        String t = "";
        for(int i = s.length() - 1; i >= 0; i--){
            t += s.charAt(i);
        }
        int num = Integer.parseInt(t);
        return num;
    }
}
