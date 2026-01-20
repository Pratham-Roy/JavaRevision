package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    public static void main(String[] args) {
        List<Integer> logan = new ArrayList<Integer>();
        logan.add(12);
        logan.add(13);
        logan.add(15);
        logan.add(14);
        logan.add(17);
        logan.get(4);


        
        
        System.out.println(logan);
        //get the index element
        System.out.println(logan.get(4));
        System.out.println(logan.get(3));
 
        //remove the element 
        logan.remove(2);
        System.out.println(logan);
        //set
        logan.set(1,24);
        System.out.println(logan);
        System.out.println(logan.contains(5));
       
    }
}