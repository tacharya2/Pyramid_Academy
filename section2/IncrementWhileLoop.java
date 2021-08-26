package assignments.section2;

public class IncrementWhileLoop{
    public static String solution(int from, int to){
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String str = "";
        int i = from;
        while(i <= to){
            str += i;
            i++;
        }
        return str;
    }
}
