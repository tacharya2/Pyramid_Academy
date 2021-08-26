package assignments.section3;

public class FactorialComputation{
    public static int solution(int n){
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int factorial = 1;
        if(n == 0){
            return 1;
        }else{
            for(int i = 1; i <= n; i++){
                factorial = factorial * i;
            }
        }
        return factorial;
    }
}
