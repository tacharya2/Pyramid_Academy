package pyramidAcademy;

public class Father {

	private static String phone = "Cell Phone";
	private static String account = "123456987";
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
	
	public String relation() {
		return "He is my son";
	}
}

