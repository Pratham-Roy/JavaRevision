package fileIo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

class Readerit {

    Readerit(File file, FileInputStream readerone) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(readerone));
        String st = bf.readLine();
        System.out.println(st);
        bf.close();
    }
}

public class Readerfile {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Asus\\Desktop\\java practice\\fileIo\\hello.txt");
        FileInputStream readerop = new FileInputStream(file);
        new Readerit(file, readerop);

        System.out.println("This is a placeholder for Readerfile class.");
    }
}
