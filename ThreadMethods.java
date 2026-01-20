class Mythred extends Thread {
    String cosmos;
    public Mythred(String name) {
        super(name); 
        cosmos = name;
    }

    public void run() {
        int count = 0;
        while (count < 10) { 
            System.out.println(cosmos);
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadMethods { 
    public static void main(String[] args) {
        Mythred t = new Mythred("my thread");
   
        System.out.println("Name: " + t.getName());
        System.out.println("ID: " + t.getId());
        t.setDaemon(true); 
        t.start();

        try {
            t.join(); 
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("State: " + t.getState());
        System.out.println("Is Alive: " + t.isAlive());
    }
}
