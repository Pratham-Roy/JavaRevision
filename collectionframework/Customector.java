package collectionframework;

import java.util.Vector;

public class Customector {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(7, 1);

        // Add elements
        v.add(10); // Collection
        v.add(1, 17); // List
        v.addElement(18); // Vector

        // Printing the vector
        System.out.println(v);

        // Removing elements
        v.removeElement(10);
        System.out.println(v);

        // Check if the index 3 is valid before removing
        if (v.size() > 3) {
            v.removeElementAt(3);
        }
        System.out.println(v);
    }
}

