package collectionframework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class CustohmashMap {
    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();
        mp.put("Chiranjevi", 700);
        mp.put("Balaiah", 800);
        mp.put("Venkatesh", 200);
        System.out.println("Original Map: " + mp);
        
        Set<String> keys = mp.keySet();
        Collection<Integer> values = mp.values();
        
        System.out.println("Keys: " + keys);
        System.out.println("Values: " + values);
        
        // Additional operations to demonstrate functionality
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Check if a key or value exists
        System.out.println("Contains key 'Chiranjevi': " + mp.containsKey("Chiranjevi"));
        System.out.println("Contains value 800: " + mp.containsValue(800));
        
        // Remove an entry
        mp.remove("Balaiah");
        System.out.println("Map after removal: " + mp);
    }
}
