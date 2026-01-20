package streamapi;

public class ThreadUsinAnonymous {
    public static void main(String[] args) {
        Thread t = new Thread() {
            public void run() {
                while (true) {
                    System.out.println("pratham");
                    try {
                        Thread.sleep(1000); // Pause for 1 second
                    } catch (InterruptedException e) {
                        System.out.println("Thread interrupted");
                        break; // Exit the loop if the thread is interrupted
                    }
                }
            }
        };

        t.start(); // Start the thread
    }
}

