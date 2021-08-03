package pyramidAcademy;

public class StudentObjects {
	public String name;
	public int roll;

	public void student(String name, int roll) {
		System.out.println(name + "\t" + roll);
	}

	public static void main(String[] args) {
		StudentObjects student = new StudentObjects();

		student.name = "Panjia";
		student.roll = 45;
		System.out.println(student.name);

		System.out.println("Name " + "\t\t" + "Roll");
		student.student("Tek Acharya", 32);
		student.student("Hema Acharya", 312);
		student.student("Prinsa Acharya", 332);
	}
}
