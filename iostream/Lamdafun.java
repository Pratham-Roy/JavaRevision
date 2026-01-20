package iostream;

interface lack {
    void hashcode();
}

interface lack1 {
    int addit(int a, int b);
}

public class Lamdafun {
    public static void main(String[] args) {

        lack i = () -> {
            System.out.println("lambda here");
        };
        i.hashcode();

        lack1 l = (a, b) -> a + b;
        System.out.println(l.addit(2, 3));
    }
}
