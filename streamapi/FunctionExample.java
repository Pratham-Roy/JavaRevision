package streamapi;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        // Function that takes an Integer and returns an Integer by adding 2
        Function<Integer, Integer> fr = (x) -> x + 2;
        System.out.println(fr.apply(10)); // This will output 12

        // Chaining another function that adds 10 to the result of the first function
        Function<Integer, Integer> fr2 = fr.andThen(x -> x + 10);
        System.out.println(fr2.apply(20)); // This will output 32
    }
}

