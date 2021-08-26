package assignments.section2;

public class ReverseAnInteger{
    public static String solution(int number){
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String st = String.valueOf(number);
        String str = "";
            for(int i = st.length()-1; i >=0; i--){
                str += st.charAt(i);
            }
        return str;
    }
}
