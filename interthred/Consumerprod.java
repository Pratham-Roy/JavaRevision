package interthred;

class Buffer {
    private int prod;
    private boolean clock = false;

    synchronized public void produce(int prod) {
        while (clock) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.prod = prod;  
        System.out.println("Producer produced: " + prod);
        clock = true;
        notifyAll();
    }

    synchronized public void consume() {
        while (!clock) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumer consumed: " + prod);
        clock = false;
        notifyAll();
    }
}

class Producer extends Thread {
    private final Buffer buffer;
    private int prod = 0;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        while (true) {
            buffer.produce(prod++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private final Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        while (true) {
            buffer.consume();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Consumerprod {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }}
       
