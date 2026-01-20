package puexam;

import java.util.Comparator;
import java.util.TreeSet;

class Employee2 {
    String name;
    int salary;

    Employee2(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + ": " + salary;
    }
}

class Mycomprator implements Comparator<Employee> {
    public int compare(Employee obj1, Employee obj2) {
        return obj1.salary - obj2.salary; 
    }
}

public class Question2 {
    public static void main(String[] args) {
        Mycomprator c = new Mycomprator();
        TreeSet<Employee> tr = new TreeSet<>(c);
        
        Employee2 e1 = new Employee2("jaggu", 3000);
        Employee2 e2 = new Employee2("takku", 2000);
        Employee2 e3 = new Employee2("kuku", 8000);
        Employee2 e4 = new Employee2("laduu", 4000);
        
        tr.add(e1);
        tr.add(e2);
        tr.add(e3);
        tr.add(e4);
        
        System.out.println(tr);
    }
}
