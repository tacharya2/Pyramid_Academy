package assignments.section9;

import java.util.ArrayList;

public class RemoveTheOddBalls {

    public static Object[] solution(ArrayList<String> words) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        return words.stream().filter(e -> e.length() % 2 == 0).toArray();
    }
}
