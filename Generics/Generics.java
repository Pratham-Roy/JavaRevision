package Generics;
//reson for using generics is to provide type safety at compile time and to eliminate the need for typecasting
//this was just a  simple example of generics in java
class Box<T> {
    private T value;

    public void setvalue(T value) {
        this.value = value;
    }

    public void getvalue(T value) {
        System.out.println(value);
    }
}
// where ther ismore  than one generic type parameter
class Animal<K, V> {
    private K key;
    private V value;

    public void setkey(K key) {
        this.key = key;
    }

    public void setvalue(V value) {
        this.value = value;
    }

    public K getkey() {
        return key;
    }

    public V getvalue() {
        return value;
    }
}
// T: Type
// E: Element (used in collections)
// K: Key (used in maps)
// V: Value (used in maps)
// N: Number
// example of genric interface
interface Battle<T> {
    void fight(T t);

}
// example of generic interface with bounded type parameter this T can be be any subtype of Number
interface Integercontainer<T extends Number> {
    void add(T t);

    T get();
}

class Numberbox implements Integercontainer<Integer> {
    private Integer value;

    @Override
    public void add(Integer t) {
        this.value = t;
    }

    @Override
    public Integer get() {
        return value;
    }
}
// example of generic class with bounded type parameter with wildcard here the T extends animal class which can have any types of generic parameter we dont know what type of generic parameter it will have so we use wildcard ?
class Animalbox<T extends Animal<?, ?>> {
    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }
}
// example of generic class with multiple bounded type parameters
class comp < T extends Numberbox& Battle<?>>{
    private T t;

    public comp(T t) {
        this.t = t;
    }

    public void execute(Integer value) {
        t.add(value);
        // t.fight(value); this line will cause error because we dont know what type of generic parameter is used in Battle interface and we cannot  -put in that we are just allowed to readit
        t.get();
    }
}

public class Generics {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setvalue(120);
        box.getvalue(120);
        Animal<String, String> animal = new Animal<>();
        animal.setkey("Dog");
        animal.setvalue("Germal Shephard");
        System.out.println("Key: " + animal.getkey() + ", Value: " + animal.getvalue());
    }
}