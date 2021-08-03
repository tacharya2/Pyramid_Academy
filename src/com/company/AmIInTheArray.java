package pyramidAcademy;

public class AmIInTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, -13, -1, -6, -4 };
		int[] arr2 = { 1 };

		System.out.println(solution(arr, -4));
		System.out.println(solution(arr2, 0));

	}

	public static boolean solution(int[] nums, int num) {

		for (int i = 0; i < nums.length; i++) {
			if (num == nums[i]) {
				return true;
			}
		}
		return false;
	}

}
