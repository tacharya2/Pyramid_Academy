package pyramidAcademy;

public class World {
	private String message = "Hello World";

	public String helloWorld(String message) {
		this.message = message;

		return message;
	}

	@Override
	public String toString() {
		return message;
	}

}
