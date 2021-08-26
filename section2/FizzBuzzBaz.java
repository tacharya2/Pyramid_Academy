package assignments.section2;

public class FizzBuzzBaz{
    public static String solution(int fuzzy){
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if(fuzzy % 3 == 0 && fuzzy % 5 == 0){
            return "fizz buzz baz";
        }else if(fuzzy % 3 == 0){
            return "fizz";
        }else if(fuzzy % 5 == 0){
            return "buzz";
        }else {
            return "Fizzled";
        }
    }
}
