package assignments.section8;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateAFile {
    static Charset utf8 = StandardCharsets.UTF_8;
    static List<String> list = Arrays.asList();


    public static void createAFile() throws IOException {
       //File file = new File("resources/sample_data.txt");
       Paths.get("./resources/sample_data.txt");
    }
    public static void writeToAFile()throws IOException{
        Files.write(Paths.get("./resources/sample_data.txt"), "test".getBytes());
    }
    public static ArrayList<String> readAFile() throws IOException{

       List<String> list = Files.readAllLines(Paths.get("./resources/sample_data.txt"));

    return new ArrayList<>(list);
    }
}