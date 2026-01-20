package innerclasses;

class Outer {
    private String name;
    private String id;

    public Outer(String name, String id) {
        this.name = name;
        this.id = id;
    }

    class Inner {
        private String name = "inner memeber ";

        public void display() {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
        }
    }
}

public class Member {
    public static void main(String[] args) {
        Outer outer = new Outer("outer member", "001");
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }

}

