package assignments.section7;

public class DivideByZero {
    public static Object solution(int one, int two) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int num; // was Object
        try{
            num =  one / two ;
            return num;
        }
        catch (Exception e){
            return "Caught Exception: Divide by zero";
        }
    }
}
