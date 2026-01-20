package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NeStream {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            l1.add(i);
        }

        List<List<Integer>> l0 = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5),
            Arrays.asList(6, 7, 8)
        );

        System.out.println("Original List: " + l1);

        List<Integer> l2 = l1.stream().takeWhile(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("TakeWhile List: " + l2);

        List<Integer> l3 = l1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("Filtered List: " + l3);

        List<Integer> l4 = l1.stream().sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList());
        System.out.println("Sorted List: " + l4);

        int max = l1.stream().max(Integer::compareTo).get();
        int min = l1.stream().min(Integer::compareTo).get();
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        List<Integer> l5 = l1.stream().dropWhile(k -> k % 2 == 0).collect(Collectors.toList());
        System.out.println("DropWhile List: " + l5);

        List<Integer> l6 = l0.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println("Flattened List: " + l6);
    }
}
