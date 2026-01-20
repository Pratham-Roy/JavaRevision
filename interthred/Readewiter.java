package interthred;

import java.util.ArrayList;

class Board {
    private ArrayList<String> writing = new ArrayList<>();
    private boolean clock = false;

    
    public Board() {
        writing.add("hello");
        writing.add("world");
        writing.add("track");
    }

    synchronized void write() {
        while (clock) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < writing.size(); i++) {
            System.out.println("Teacher writes: " + writing.get(i));
        }
        clock = true;
        notifyAll();
    }

    synchronized void read(ArrayList<String> rack) {
        while (!clock) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < writing.size(); i++) {
            String item = writing.get(i);
            rack.add(item);
            System.out.println("Student reads: " + item);
        }
        clock = false;
        notifyAll();
    }
}

class Writer extends Thread {
    private final Board board;

    public Writer(Board board) {
        this.board = board;
    }

    public void run() {
        while (true) {
            board.write();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Reader extends Thread {
    private final Board board;
    private ArrayList<String> rack = new ArrayList<>();

    public Reader(Board board) {
        this.board = board;
    }

    public void run() {
        while (true) {
            board.read(rack);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Readewiter {
    public static void main(String[] args) {
        Board board = new Board();
        Writer writer = new Writer(board);
        Reader reader = new Reader(board);

        writer.start();
        reader.start();
    }
}

