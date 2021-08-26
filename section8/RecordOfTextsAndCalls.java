package assignments.section8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class RecordOfTextsAndCalls  {
    public static String[] solution() throws IOException {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String [] arr = new String [2];
        List<String> list1 = Files.readAllLines(Paths.get("./section8/texts.csv"));
        arr[0] = list1.get(0);
        String str1 = arr[0];

        List<String> list2 = Files.readAllLines(Paths.get("./section8/calls.csv"));
        arr[1] = list2.get(list2.size()-1);
        String str2 = arr[1];

        String [] incomingTexts = str1.split(",");
        String [] answeringCalls = str2.split(",");

        String incoming_number1 = incomingTexts[0];
        String answering_number1 = incomingTexts[1];
        String time1 = incomingTexts[2];

        String incoming_number2 = answeringCalls[0];
        String answering_number2 = answeringCalls[1];
        String time2 = answeringCalls[3];
        String duration = answeringCalls[4];

        String message1 = String.format("First record of texts, %s texts %s at time %s",incoming_number1, answering_number1, time1 );
        String message2 = String.format("Last record of calls, %s calls %s at time %s,\n" +
                        "lasting %s seconds",
                incoming_number2, answering_number2, time2, duration );

        String [] record = new String[]{message1, message2};
        return record;
    }
}