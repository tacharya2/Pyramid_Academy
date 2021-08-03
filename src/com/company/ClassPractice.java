package pyramidAcademy;

public class ClassPractice {

	public static void main(String[] args) {
		// new ClassPractice();
		new ClassPractice(150, 45);

	}

	int x = 25;
	int y = 100;

	public ClassPractice() {
		System.out.println(this);
	}
	public ClassPractice(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(this);
	}

	@Override
	public String toString()
	{
		return ("x = " + x + ", " + "y = " + y);
	}
}
