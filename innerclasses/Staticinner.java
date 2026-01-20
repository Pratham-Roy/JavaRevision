package innerclasses;

class Computer {
    private String brand;
    private String model;

    public Computer(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    static class Specs {
        private String cpu = "Intel i7";
        private String ram = "16GB";

        public void display() {
            System.out.println("CPU: " + cpu);
            System.out.println("RAM: " + ram);
        }
    }
    
}

public class Staticinner {
    class Test {
        public static void main(String[] args) {
            Computer.Specs specs = new Computer.Specs();
            specs.display();
        }
    }
    
}
