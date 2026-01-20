class Producer extends Thread {
    private final Buffer buffer;
    private final String name;

    public Producer(Buffer buffer, String name) {
        this.buffer = buffer;
        this.name = name;
    }

    public void run() {
        int item = 0;
        while (true) {
            buffer.produce(item++, name);
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
    private final String name;

    public Consumer(Buffer buffer, String name) {
        this.buffer = buffer;
        this.name = name;
    }

    public void run() {
        while (true) {
            buffer.consume(name);
            try {
                Thread.sleep(1500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Buffer {
    private int item;
    private boolean isEmpty = true;

    public synchronized void produce(int item, String producerName) {
        while (!isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.item = item;
        System.out.println(producerName + " produced " + item);
        isEmpty = false;
        notify();
    }

    public synchronized void consume(String consumerName) {
        while (isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(consumerName + " consumed " + item);
        isEmpty = true;
        notify();
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Producer producer = new Producer(buffer, "Producer");
        Consumer consumer = new Consumer(buffer, "Consumer");

        producer.start();
        consumer.start();
    }
}
