package collectionframework;

import java.util.Stack;//child class of vector
public class Customstack {
   public static void main(String[] args) {
    Stack<Integer>s=new Stack();
    //push elements
    s.push(7);
    s.push(8);
    s.push(9);
    //pop the erlmets
    s.pop();
    s.pop();
    System.out.println(s);
    System.out.println(s.peek());
    System.out.println(s.empty());
    System.out.println(s.search(9));


   }
    
}
