package puexam;

import java.util.TreeSet;

class Employee implements Comparable<Employee> {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        return this.salary - other.salary; 
    }

    @Override
    public String toString() {
        return name + ": " + salary;
    }
}

public class Question2p2 {
    public static void main(String[] args) {
        TreeSet<Employee> tr = new TreeSet<>();
        
        Employee e1 = new Employee("jaggu", 3000);
        Employee e2 = new Employee("takku", 2000);
        Employee e3 = new Employee("kuku", 8000);
        Employee e4 = new Employee("laduu", 4000);
        
        tr.add(e1);
        tr.add(e2);
        tr.add(e3);
        tr.add(e4);
        
        System.out.println(tr);
    }
}
