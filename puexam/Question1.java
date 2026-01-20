package puexam;
import java.util.ArrayList;
import java.util.ListIterator;

class Student {
    String name;
    int Rollnum;


    Student(String name, int Rollnum) {
        this.name = name;  
        this.Rollnum = Rollnum;  
    }
}

public class Question1 {
    public static void main(String[] args) {
       
        Student s1 = new Student("rakesh", 1);
        Student s2 = new Student("lokesh", 2);
        Student s3 = new Student("rahul", 3);
        Student s4 = new Student("mahi", 4);
        Student s5 = new Student("monchik", 5);

   
        ArrayList<Student> ar = new ArrayList<>();
        ar.add(s1);
        ar.add(s2);
        ar.add(s3);
        ar.add(s4);
        ar.add(s5);

       
        ListIterator<Student> i = ar.listIterator();
        while (i.hasNext()) {
            Student s = i.next();  
            System.out.println("Student name: " + s.name + ", Student roll number: " + s.Rollnum);
        }
    }
}
