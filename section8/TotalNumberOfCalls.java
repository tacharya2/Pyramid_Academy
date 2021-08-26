package assignments.section8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TotalNumberOfCalls{
    public static int solution() throws IOException {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        Set<String> set = new HashSet<String>();
        List<String> list1 = Files.readAllLines(Paths.get("./section8/calls.csv"));
        List<String> list2 = Files.readAllLines(Paths.get("./section8/texts.csv"));
        set.addAll(list1);
        set.addAll(list2);
        int total = set.size();
        return total;
    }
}
