package collectionframework;
import java.util.*;
public class Customlinnkedhashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> hs= new LinkedHashSet();
        for (int i = 0; i < 5; i++) {
            hs.add(i);
        }
        hs.add(null);
        System.out.println(hs);

        hs.remove(4);
        System.out.println(hs);

        // Multiplying elements by 2 and collecting into a new set
        LinkedHashSet<Integer> doubledHs = new LinkedHashSet<>();
        hs.forEach((i) -> {
            if (i != null) doubledHs.add(i * 2);
        });// lambda expression use
        
        System.out.println(doubledHs);
    }
    // here the order is pr4eserved
    
}
