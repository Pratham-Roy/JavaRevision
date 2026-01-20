abstract class Employee {
    public abstract void calculatesalary();
}

class Manager extends Employee {
    public void calculatesalary() {
        System.out.println("2500");
    }
}

class Programmer extends Employee {
    public void calculatesalary() {
        System.out.println("1500");
    }
}

public class Emp {
    public static void main(String[] args) {
        Manager mac = new Manager();
        mac.calculatesalary();

        Programmer deku = new Programmer();
        deku.calculatesalary();
    }
}

