package pyramidAcademy;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		// utf allows for characters such as (smily face) instead of standard ASCII.
		Charset utf8 = StandardCharsets.UTF_8;
		List<String> list = Arrays.asList("Line1", "Line2");

		// If the file doesn't exists, create and write to it.
		// If the file exits, truncate (remove all content ) and write to it.
		Files.write(Paths.get("app.log"), list, utf8);

		// If the file doesn't exists, create and write to it.
		// If the file exists, append to it.
		Files.write(Paths.get("app.log"), list, utf8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);

		// For a single line string
		Files.write(Paths.get("app.log"), "Hello World".getBytes());

		// Create and write to a file in a binary format
		byte[] bytes = { 1, 2, 3, 4, 5 };
		Files.write(Paths.get("app.bin"), bytes);
		System.out.println(Files.readAllLines(Paths.get("app.log")));

		// write to app.log file, one line at a time, notice that the first line is
		// appended to the last line.
		Files.write(Paths.get("app.log"), Arrays.asList("one", "two", "three"), utf8, StandardOpenOption.CREATE,
				StandardOpenOption.APPEND);

		// Read from a file, put all lines into a list;
		System.out.println(Files.readAllLines(Paths.get("app.log")));

	}
}
