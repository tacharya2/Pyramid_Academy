package pyramidAcademy;

import java.util.Scanner;

public class StudentRecord {
	// Fields
	private String name;
	private int grade;

	// Constructor
	public StudentRecord(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	// Method
	public void printInfo() {
		System.out.println("Name: " + name + "\n" + "Grade: " + grade);
	}
	public static void main(String[] args) {
		// Object array of StudenntRecord
		StudentRecord [] student = new StudentRecord[5];
		
		// Scanner- ask user to enter the record
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Student " + (i + 1) + " info");
			System.out.println("Name: ");
			String name = sc.next();

			System.out.println("Grade: ");
			int grade = sc.nextInt();
			
			student[i] = new StudentRecord(name, grade);

		}
		for (int i = 0; i < 5; i++) {
			student[i].printInfo();
		}

	}

}
