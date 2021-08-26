package assignments.section3;

import java.util.Arrays;

public class AnagramComputation{
    public static boolean solution(String word1, String word2) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if(word1.length() <= 1 && word2.length() <= 1) {
            return false;
        }else if(word1.length() != word2.length()){
            return false;
        }else if(word1.equals(word2)) {
            return false;
        }else {
                char [] ch1 = word1.toLowerCase().toCharArray();
                char [] ch2 = word2.toLowerCase().toCharArray();

                Arrays.sort(ch1);
                Arrays.sort(ch2);

                boolean result = Arrays.equals(ch1, ch2);
               if(result){
                    return true;
                }else{
                    return false;
                }
            }
        }
    }

