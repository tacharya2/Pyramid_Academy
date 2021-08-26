package assignments.section2;

public class LongestString{
    public static String solution(String firstWord, String secondWord){
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int firstWordLength = firstWord.length();
        int secondWordLength = secondWord.length();
        if(firstWordLength > secondWordLength){
            return firstWord;
        }else {
            return secondWord;
        }
    }
}
