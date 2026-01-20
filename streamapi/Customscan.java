package streamapi;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Customscan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        ArrayList<Integer> ar = new ArrayList<>(10);


        System.out.println("Please enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            ar.add(num);
        }

        HashMap<Integer, Integer> kev = new HashMap<>();

        
        for (int num : ar) {
            kev.put(num, kev.getOrDefault(num, 0) + 1);
        }

      
        Iterator<Entry<Integer, Integer>> iter = kev.entrySet().iterator();
        while (iter.hasNext()) {
            Entry<Integer, Integer> entry = iter.next();
            System.out.println("Number: " + entry.getKey() + " occurs " + entry.getValue() + " times");
        }
        

        sc.close();
    }
}

