package pyramidAcademy;

public class ReverseWithLibrary {

	public static void main(String[] args) {
		System.out.println(solution(""));
		System.out.println(solution("Atlanta"));
		System.out.println(solution("-12"));
		System.out.println(solution("0"));
		System.out.println(solution("010"));

	}

	public static boolean solution(String str) {

		String st = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			st += str.charAt(i);

		}
		System.out.println(str);
		System.out.println(st);

		if (str.length() <= 1) {
			return true;
		} else if (st.equals(str)) {
			return true;
		} else {
			return false;

		}

	}
}
