package pyramidAcademy;

public class Increment_while_loop {

	public static void main(String[] args) {
		System.out.println(solution(1, 0));
		System.out.println(solution(1, 3));
		System.out.println(solution(1, 1));
		System.out.println(solution(1, 0));
		System.out.println(solution(1, 5));
		System.out.println(solution(-1, 1));

	}

	public static String solution(int from, int to) {
		String str = "";

		if (from > to) {
			return "";
		} else {

			while (from <= to) {
				str += from;
				from++;
			}
		}

		return str;
	}

}
