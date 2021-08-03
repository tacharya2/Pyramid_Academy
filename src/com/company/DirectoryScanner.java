package pyramidAcademy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;

public class DirectoryScanner {

	public static void main(String[] args) throws IOException {

		Path currentDirectoty = Paths.get(".");
		// Files.list(currentDirectoty).forEach(System.out::println);

		Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
		Files.walk(currentDirectoty, 3).filter(predicate).forEach(System.out::println);

	}

}
