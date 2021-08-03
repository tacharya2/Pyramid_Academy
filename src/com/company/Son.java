package pyramidAcademy;

public class Son extends Father {
	public String relation(String str) {

		return str;
	}
	public static void main(String[] args) {
		Father fa = new Father();
		Son son = new Son();
		fa.setPhone("Give me the phone..dad");
		System.out.println(fa.getPhone());
		System.out.println(fa.getAccount());
		System.out.println(fa.relation());

		System.out.println(son.relation("He is my father"));
	}
}
