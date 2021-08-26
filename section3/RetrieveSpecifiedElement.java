package assignments.section3;

import java.util.ArrayList;

public class RetrieveSpecifiedElement{
    public static int solution(ArrayList<Integer> list) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if (list.size() > 0) {
            return list.get(0);
        } else {
            return 0;
        }
    }
}
