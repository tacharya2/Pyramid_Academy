package pyramidAcademy;

public class ReverseAnInteger {

	public static void main(String[] args) {

		System.out.println(solution(12345));
		System.out.println(solution(1));
		System.out.println(solution(0));
		System.out.println(solution(369));
		System.out.println(solution(-3));

	}

	public static String solution(int n) {

		String str1 = String.valueOf(n);
		String str2 = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			str2 += str1.charAt(i);
		}

		return str2;
	}

}
