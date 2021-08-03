package pyramidAcademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMIssingInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

		// List<Integer> numbers = new ArrayList<Integer>();

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i < numbers.size() + 1 - 1; i++) {

			list.add(i);
		}
		System.out.println(list);
		System.out.println(new ArrayList<Integer>());

	}

	// static List<Integer> list = new ArrayList<Integer>();

	public static int solution(ArrayList<Integer> numbers) {

		for (int i = 0; i < numbers.size() - 1; i++) {

		}
		return 1;
	}

}
