class ATM {
    int rupees;

    public synchronized void amount(int rupees) {
        this.rupees = rupees;
        System.out.println("Amount: " + rupees);
    }

    public synchronized void withdrawal(String name, int amt) {
        System.out.println(name + " withdraws " + amt);
    }
}

class Customer extends Thread {
    ATM a;
    String name;
    int amount;

    public Customer(ATM a, String name, int amount) {
        this.a = a;
        this.name = name;
        this.amount = amount;
    }

    public void run() {
       {
        a.amount(amount);
        a.withdrawal(name, amount);}
        
    }
}

public class Main {
    public static void main(String[] args) {
        ATM a = new ATM();
        
        Customer t1 = new Customer(a, "Ramesh", 1000);
        Customer t2 = new Customer(a, "Suresh", 2000);
        Customer t3 = new Customer(a, "Gandurajeev", 3000);
        
        t1.start();
        t2.start();
        t3.start();
    }
}
