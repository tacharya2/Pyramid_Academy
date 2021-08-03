package pyramidAcademy;

public class ConstructorOverloading {
	// Fields
	private String accountName;
	private String accountNumber;
	private int bankCode;
	private int passCode;

	// Constructors 1
	public ConstructorOverloading(String accountName, String accountNumber, int bankCode, int passCode) {
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.bankCode = bankCode;
		this.passCode = passCode;
	}

	// Constructor 2
	public ConstructorOverloading(String accountName, String accountNumber, int passCode) {
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.passCode = passCode;
	}

	// Methods
	public void printInfo() {
		System.out.println("Account Name: " + accountName);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Bank Code: " + bankCode);
		System.out.println("Pass Code: " + passCode);
	}

//	public void printInfo() {
//		System.out.println("Account Name: " + accountName);
//		System.out.println("Account Number: " + accountNumber);
//		System.out.println("Bank Code: " + bankCode);
//		System.out.println("Pass Code: " + passCode);
//	}
	public static void main(String[] args) {
		// Object
		ConstructorOverloading customer1 = new ConstructorOverloading("Name", "123654789", 125);

		ConstructorOverloading customer2 = new ConstructorOverloading("Name10", "1236547810", 125, 452);

		customer1.printInfo();
		System.out.println("\n");
		customer2.printInfo();

	}

}
