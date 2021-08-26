package assignments.section7;

public class ParsingAnInteger {

    public static Object solution(String word) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        try{
            Integer num = Integer.parseInt(word);
            return num;
        }catch(Exception e) {
            return "Caught Exception: Number Format Exception";
        }
    }
}
