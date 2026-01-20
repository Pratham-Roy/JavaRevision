package collectionframework;

import java.util.SortedSet;
import java.util.TreeSet;

public class CustomSortedSet {
    public static void main(String[] args) {
        SortedSet<Integer> ss = new TreeSet<>();
        for (int i = 0; i <= 5; i++) {
            ss.add(i);
        }
        
        SortedSet<Integer> headSet = ss.headSet(3);
        SortedSet<Integer> tailSet = ss.tailSet(1);
        SortedSet<Integer> subSet = ss.subSet(1, 5);

        System.out.println("Original Set: " + ss);
        System.out.println("Head Set (<= 3): " + headSet);
        System.out.println("Tail Set (>= 1): " + tailSet);
        System.out.println("Sub Set (1 to 5): " + subSet);
    }
}

