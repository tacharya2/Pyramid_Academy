package assignments.section2;

public class CounterForLoop{
    public static String solution(int count){
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String str = "";
        if(count >= 0){
            for(int i = count; i >= 0; i--){
                str += i;
            }
            return str;
        }else {
            return "";
        }
    }
}
