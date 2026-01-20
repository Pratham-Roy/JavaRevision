package iostream;
import java.io.*;

class Readwrite {
    public static void main(String[] args) {
  
        String fileName = "output.txt";

        String content = "MY World my rules";

        try (FileWriter fr = new FileWriter(fileName)) {
          

       
            fr.write(content);

            System.out.println("Content written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        
    }
}
