package assignments.section2;

public class TypeConversion{
    public static Object solution(Object object){
        // ↓↓↓↓ your code goes here ↓↓↓↓
            if(object instanceof Integer){
                return object.toString();

            }else if(object instanceof String){
                return object.toString();

            }else if(object instanceof Character){
                return object.toString();
            }
        return null;
    }
}
