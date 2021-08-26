package assignments.section2;

public class ReverseAStringWhileLoop{
    public static String solution(String str){
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String st = "";
        int i = str.length()-1;
        while(i >= 0){
            st += str.charAt(i);
            i--;
        }
        return st;
    }
}
