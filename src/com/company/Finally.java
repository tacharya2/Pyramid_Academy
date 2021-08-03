package pyramidAcademy;

public class Finally {
	final int num = 2;
	int normal = 50;

	public static void main(String[] args) {
		final Finally finall = new Finally();
		finall.normal = 45;
		System.out.println();
	}

	@Override
	public String toString() {
		return "" + normal;
	}
}


