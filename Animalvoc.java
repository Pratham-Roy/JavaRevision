interface animal {
    abstract void bark();
} 
class Dog implements animal{
     public void bark(){
       System.out.println("Dog is barking");
        
     }
}

public class Animalvoc{
    public static void main(String[] args) {
        Dog d= new Dog();
        d.bark();
    }
}