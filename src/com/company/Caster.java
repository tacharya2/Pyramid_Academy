package pyramidAcademy;

public class Caster {

	public static void main(String[] args) {
		System.out.println(solution(1234));
		System.out.println(solution("1234"));
		System.out.println(solution('5'));

	}

	public static Object solution(Object object) {

		if (object instanceof Integer) {
			return String.valueOf(object);
		} else if (object instanceof String) {
			return object.toString();

		} else if (object instanceof Character) {
			return object.toString();
		}
		return null;
	}

}
