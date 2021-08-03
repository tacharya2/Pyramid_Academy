package pyramidAcademy;

import java.util.ArrayList;
import java.util.List;

public class MaxSubArrayDivideAndQuenquer {

	public static void main(String[] args) {
//		ArrayList<Integer> lst1 = new ArrayList<>(List.of(1, -2, -3, 4));
//		ArrayList<Integer> lst2 = new ArrayList<>(lst1);
//		System.out.println(solution(lst2));
////
		ArrayList<Integer> lst3 = new ArrayList<>(List.of(-1, -1, 1));
		ArrayList<Integer> lst4 = new ArrayList<>(lst3);
		System.out.println(solution(lst4));
	}

	public static ArrayList<Integer> solution(ArrayList<Integer> nums) {
		int mid = (nums.get(0) + nums.get(nums.size() - 1)) / 2;

		int sum = Integer.MIN_VALUE;

		return nums;
	}

}
