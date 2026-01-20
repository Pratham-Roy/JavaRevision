package collectionframework;
import java.util.Vector;
import java .util.ListIterator;
public class CustomListiterator {
    public static void main(String[] args) {
        
    
    Vector<Integer> v = new Vector<>(8);

    for (int i = 0; i < 8; i++) {
        v.addElement(i);
    }
    ListIterator<Integer> l= v.listIterator();
    while(l.hasNext()){
        Integer i=(Integer) l.next();
        System.out.println(i);
    }

    
}
}