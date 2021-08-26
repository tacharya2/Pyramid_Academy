package assignments.section2;

public class SwitchItUp{
    public static String solution(int x){
        // ↓↓↓↓ your code goes here ↓↓↓↓
            String result;
            switch(x){
                case 1:
                    result = "one";
                    break;
                case 2:
                    result = "two";
                    break;
                case 3:
                    result = "three";
                    break;
                case 4:
                    result = "four";
                    break;
                case 5:
                    result = "five";
                    break;
                default:
                    result = "nne matched";
            }
        return result;
    }
}
