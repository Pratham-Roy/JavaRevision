interface payer {
    public void pay(int amount);
  
}

public class Anony {
    public static void main(String[] args) {
        payer p = new payer() { //thid here is anonymous inner class 
            public void pay(int amount) {
                System.out.println("paying" + amount);
            }
        };
        p.pay(1000);
    }
}