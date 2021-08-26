package assignments.section9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class QueryTheFile {

    public static ArrayList<String> solution() throws IOException {
        // ↓↓↓↓ your code goes here ↓↓↓↓
    ArrayList<String> list = (ArrayList<String>)Files.readAllLines(Paths.get("./resources/filter_problem.txt"));
    return (ArrayList<String>) list.stream().filter(e -> e.contains("2"));

    }
}
