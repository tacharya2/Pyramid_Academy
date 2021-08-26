package assignments.section2;

public class ReverseAStringForLoop{
    public static String solution(String str) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String st = "";
    if(str == null){
        return "";
    }else{
        for(int i = str.length()-1; i >= 0; i-- ){

            st += str.charAt(i);
        }
    }
        return st;
    }
}
