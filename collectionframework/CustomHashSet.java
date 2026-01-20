package collectionframework;

import java.util.HashSet;

public class CustomHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            hs.add(i);
        }
        hs.add(null);
        System.out.println(hs);
        
        hs.remove(4);
        System.out.println(hs);

        // Multiplying elements by 2 and collecting into a new set
        HashSet<Integer> doubledHs = new HashSet<>();
        hs.forEach((i) -> {
            if (i != null) doubledHs.add(i * 2);
        });// lambda expression use

        System.out.println(doubledHs);
        
    }
}
