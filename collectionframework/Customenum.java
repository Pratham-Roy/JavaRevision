package collectionframework;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Customenum {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector(8);

        for (int i = 0; i < 8; i++) {
            v.addElement(i);
        }
        //can be used for only legacy classes object we cdan only read no remove operation ooperaTION can br performed
        //ENUMERATION
        Enumeration<Integer> e = v.elements();
        while (e.hasMoreElements()) {
            Integer i = (Integer) e.nextElement();
            System.out.println(i);
        }
        //ITERATOR
        //used for every collection object
        // used as universal cursor
        Iterator itr= v.iterator();
        while(itr.hasNext()){
            Integer i=(Integer) itr.next();
            if(i%2==0){
            System.out.println(i);}
            else{
                itr.remove();
            }
        }


    }
}
