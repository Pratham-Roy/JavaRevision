package puexam;
import java.util.Vector;
import java.util.Enumeration;

class Employee{
    String name;
    int empnum;


   Employee(String name, int empnum) {
        this.name = name;  
        this.empnum= empnum;  
    }
}

public class Question1p2 {
    public static void main(String[] args) {
        Vector<Employee>vec=new Vector<>();
        Employee e1= new Employee("jaggu", 1);
        Employee e2= new Employee("takku", 2);
        Employee e3= new Employee("kuku", 3);
        Employee e4= new Employee("laduu", 4);
        vec.addElement(e1);
        vec.addElement(e2);
        vec.addElement(e3);
        vec.addElement(e4);
        Enumeration<Employee> e = vec.elements();
        while(e.hasMoreElements()){
            Employee i = e.nextElement();
            System.out.println("name of Employee" + i.name + "employee number" + i.empnum); 
        }


        
    }
}
