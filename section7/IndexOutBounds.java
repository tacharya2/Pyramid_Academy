package assignments.section7;

public class IndexOutBounds {
    public static Object solution(int[] array, int index) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        try{
            int num = array[index] ;
            return num;
        }catch (Exception e){
            return "Caught Exception: Index Out of Bounds.";
        }
    }
}
