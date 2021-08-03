package pyramidAcademy;

import java.util.ArrayList;
import java.util.List;

public class RetrieveRandomElement4mArrayList {
	public static void main(String [] args){
   
		System.out.println(solution((new ArrayList<>(List.of(1, 2, 3, 4, 5, 6))), 1));// [1,2,3,4,5,6], 1
		System.out.println(solution((new ArrayList<>(List.of(-1, -1, -2, -5))), 0));// [-1, -1, -2, -5], 0
		System.out.println(solution((new ArrayList<>(List.of(1))), 0));// [1], 0
		System.out.println(solution((new ArrayList<>(List.of())), 0));// [], 0
		System.out.println(solution((new ArrayList<>(List.of(1))), 1));// [1], 1
		System.out.println(solution((new ArrayList<>(List.of(2))), 1));// [2], 1
		System.out.println(solution((new ArrayList<>(List.of(2))), 0));// [2], -1
		System.out.println(solution((new ArrayList<>(List.of(2, 2, 3))), 2));// [2, 2, 3], 3
   }

	public static int solution(ArrayList<Integer> list, int num) {
		if (list.isEmpty() || num > list.size() - 1) {
			return 0;
		} else {
			return list.get(num);
		}
	}
}