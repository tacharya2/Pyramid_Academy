package pyramidAcademy;

public class CheckFirst_LastChar {

	public static void main(String[] args) {
		
		System.out.println(solution(""));
		System.out.println(solution("a"));
		System.out.println(solution("21"));
		System.out.println(solution("TaT"));
		System.out.println(solution("Tatat"));
		System.out.println(solution("Tatata"));
	}

	public static boolean solution(String str) {
		if (str.isEmpty()) {
			return true;
		} else {
			if (Character.toLowerCase(str.charAt(0)) == Character.toLowerCase((str.charAt(str.length() - 1)))) {
				return true;
			} else {

				return false;
			}
		}

	}

}
