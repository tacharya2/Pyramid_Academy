package assignments.section3;

import java.util.ArrayList;
import java.util.List;

public class IterateThroughArrayList{
    public static void solution(ArrayList<String> myList){
        // ↓↓↓↓ your code goes here ↓↓↓↓
        for(int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }
    }
}
