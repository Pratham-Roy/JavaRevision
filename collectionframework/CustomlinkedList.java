package collectionframework;

import java.util.LinkedList;
import java.util.List;

public class CustomlinkedList {
    public static void main(String[] args) {
        List<Integer> track = new LinkedList<>();

        track.add(12);
        track.add(13);
        track.add(15);
        track.add(14);
        track.add(17);
        track.add(2, 70);
        track.addFirst(29);
        track.addLast(34);

        System.out.println(track);

        // Get the index element
        System.out.println(track.get(4));
        System.out.println(track.get(3));
        System.out.println(track.getFirst());
        System.out.println(track.getLast());

        // Remove the element
        track.remove(2);
        track.removeLast();
        track.removeFirst();
        System.out.println(track);

        // Set
        track.set(1, 24);
        System.out.println(track);

        // Check if the list contains the element
        System.out.println(track.contains(5));
    }
}
