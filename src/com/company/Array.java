package pyramidAcademy;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int[] arr = new int[10];// your array became the fixed size of 4
		int len = arr.length;

		for (int i = 0; i < 11; i++) {
			arr[i] = i + 2;
		}
		System.out.println(Arrays.toString(arr));
	}
}
