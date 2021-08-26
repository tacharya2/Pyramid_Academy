package OOPS;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionalFilter {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,6,5,4));

        System.out.println(list.stream().filter(e -> e % 2 == 0).toArray());
    }
}
