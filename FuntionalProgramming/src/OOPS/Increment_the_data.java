package OOPS;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Increment_the_data {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(List.of(1,2,3,6,5,4,7,8,9));
        solution(nums);
        System.out.println(squareOf());
        optional();
    }
    private static void solution(ArrayList<Integer> list){
        list.stream().map(e -> e + 10).forEach(System.out::println);
    }
    private static List<Integer> squareOf(){
       return IntStream.rangeClosed(1,10).map(e -> e * e).boxed().collect(Collectors.toList());
    }
    private static void optional(){
        System.out.println(List.of(23, 45, 67, 12, 2, 15, 14).stream().filter(e -> e % 2 == 0).max((n1, n2) -> Integer.compare(n1, n2))); // Optional 14
        System.out.println(List.of(23, 45, 67, 12, 2, 15, 14).stream().filter(e -> e % 2 == 0).max((n1, n2) -> Integer.compare(n1, n2)).get()); //14
        System.out.println(List.of(23, 45, 67, 2, 15, 14).stream().filter(e -> e % 2 == 0).max((n1, n2) -> Integer.compare(n1, n2)).orElse(0)); // 14
        System.out.println(List.of(23, 45, 67, 15).stream().filter(e -> e % 2 == 0).max((n1, n2) -> Integer.compare(n1, n2)).orElse(0)); // 0
        System.out.println(List.of(23, 45, 67, 15).stream().filter(e -> e % 2 == 0).max((n1, n2) -> Integer.compare(n1, n2)).isPresent()); // false
    }
}
