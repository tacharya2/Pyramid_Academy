package OOPS;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.IntStream;

public class FPRunner {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Banana", "Cat", "Dog","Bat");
        List<Integer> list2 = List.of(1,2,3,6,5,4,7,8,9,10,9);
        solution(list);
        solutionUsingFP(list);

        solutionUsingFPFilter(list2);

        intermediateMethods();
        System.out.println("\n");
        functionalAssignment();
    }

    private static void solution(List<String> list) {
        for(String st: list){
            System.out.println(st);
        }
        System.out.println("\n");
    }
    private static void solutionUsingFP(List<String> list) {
    list.stream().forEach(element ->System.out.println(element));
    list.stream().filter(element -> element.endsWith("at")).forEach(element -> System.out.println(element));

    // next 3 gives the same output
    list.stream().map(e -> e.toLowerCase(Locale.ROOT)).forEach(System.out::println);
    list.stream().map(e -> e.toLowerCase()).forEach(System.out::println);
    list.stream().map(String::toLowerCase).forEach(System.out::println);
    }
    private static int solutionUsingFPFilter(List<Integer> list2){
        list2.stream().filter(element -> element % 2 == 0).forEach(element -> System.out.println(element));
        list2.stream().filter(element -> element % 2 != 0).forEach(System.out::println);// Modern way of writing

        int sum = list2.stream().reduce(0, (n1, n2) -> n1 + n2);
        System.out.println(sum);
        int sum2 = list2.stream().filter(e -> e % 2 != 0).reduce(0, Integer::sum);

        list2.stream().sorted().forEach(System.out::println);

        System.out.println(sum2);

        NormalSum(list2);

        return list2.stream().reduce(0, (n1, n2) -> {
            System.out.println(n1 + " " + n2); // can see what these intermediate numbers look like.
            return n1 + n2;
        });
    }
    private static void NormalSum(List<Integer> list2) {
        int sum = 0;
        for (int num: list2) {
            sum += num;
        }
    }
    private static void intermediateMethods() {
        List<Integer> list3 = List.of(1,6,59,8,7,4,5,2,3,41,21, 59);
        System.out.print(list3.stream().reduce(0, (n1, n2) -> n1 + n2));
        System.out.println("\n");

        list3.stream().sorted().filter(e->e%2==0).forEach(System.out::print);
        System.out.println("\n");
        System.out.print(list3.stream().filter(e -> e % 2 == 0).reduce(0, (n1, n2) -> n1 + n2));
        System.out.println("\n");
        list3.stream().distinct().sorted().forEach(System.out::println);
        //MAP
        list3.stream().forEach(e -> System.out.print(e*e + " "));

        System.out.println("\n");
        list3.stream().distinct().sorted().map(e->e*e).forEach(e -> System.out.print(e + " "));
    }
    private static void functionalAssignment(){
        IntStream.range(1,11).map(e->e*e).forEach(e -> System.out.print(e + " "));
        System.out.println("\n");
        List.of("Apple", "Bat", "Ants").stream().map(e -> e.length()).forEach(System.out::println);

        System.out.println(IntStream.range(1, 11).reduce(0, (n1, n2) -> n1 - n2));
        System.out.println(IntStream.range(1, 11).reduce(0, Integer::sum));

        System.out.println(List.of(1, 3, 4, 5, 6, 7, 8, 9).stream().max((n1,n2) -> Integer.compare(n1, n2)));
        System.out.println(List.of(1, 3, 4, 5, 6, 7, 8, 9).stream().max((n1,n2) -> Integer.compare(n1, n2)).get());
        System.out.println(List.of(1, 3, 4, 5, 6, 7, 8, 9).stream().min(Integer::compare).get());


    }
}