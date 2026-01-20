package iostream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Olread {
    public static void main(String[] args) throws Exception {
        
        FileReader fr = new FileReader("output.txt");
        FileWriter fw = new FileWriter("input.txt");

     
        List<String> l1 = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        int i;

   
        while ((i = fr.read()) != -1) {
            char c = (char) i;
            if (c == '\n') { 
                l1.add(s.toString()); 
                s.setLength(0);
            } else {
                s.append(c); 
            }
        }

        if (s.length() > 0) {
            l1.add(s.toString());
        }

  
        for (String line : l1) {
            fw.write(line + "\n");
        }

   
        fr.close();
        fw.close();

        System.out.println("File read and written successfully.");
    }
}

