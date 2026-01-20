package collectionframework;

import java.util.Comparator;
import java.util.PriorityQueue;

 class Mycomparator implements Comparator<Integer> {
    @Override
    public int compare(Integer obj1, Integer obj2) {
        return obj1 - obj2; // For a min-heap, return obj1 - obj2; for a max-heap, return obj2 - obj1
    }
}

public class Customprioritqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(6, new Mycomparator());
        for (int i = 0; i < 5; i++) {
            pq.offer(i);
        }
        System.out.println(pq);
        System.out.println(pq.remove());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);



    }

}
