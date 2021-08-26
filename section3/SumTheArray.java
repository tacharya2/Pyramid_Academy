package assignments.section3;

public class SumTheArray{
    public static int solution(int[] numbers){
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }
}
