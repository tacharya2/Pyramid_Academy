package assignments.section2;

public class CheckForPalindrome{
    public static boolean solution(String pally){
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String str = "";
        int i = pally.length() -1;
        while(i >= 0){
            str += pally.charAt(i);
            i--;
        }
        if(pally.equals(str)){
            return true;
        }else {
            return false;
        }
    }
}
