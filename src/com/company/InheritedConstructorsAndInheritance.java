package pyramidAcademy;

public class InheritedConstructorsAndInheritance extends ConstructorsAndInheritance {
	InheritedConstructorsAndInheritance() {
		System.out.println("Hello, from child class");
	}

	@Override
	public void display() {
		System.out.println("child method");
		super.display();

	}
	public static void main(String[] args) {

		InheritedConstructorsAndInheritance obj = new InheritedConstructorsAndInheritance();
		obj.display();
	}
}
