package OOPS;

import java.util.List;

public class FunctionalSorting {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,6,59,8,7,4,5,2,3,41,21, 59);
        System.out.print(list.stream().reduce(0, (n1, n2) -> n1 + n2));
        System.out.println("\n");

        list.stream().sorted().filter(e->e%2==0).forEach(System.out::print);
        System.out.println("\n");
        System.out.print(list.stream().filter(e -> e % 2 == 0).reduce(0, (n1, n2) -> n1 + n2));
        System.out.println("\n");
        list.stream().distinct().sorted().forEach(System.out::println);
    }
}
