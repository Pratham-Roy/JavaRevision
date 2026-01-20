package streamapi;

import java.util.function.Predicate;

public class UsPredicate {
    public static void main(String[] args) {
        Predicate<Integer> p = x -> (x > 10);
        System.out.println(p.test(7));
    }
}
