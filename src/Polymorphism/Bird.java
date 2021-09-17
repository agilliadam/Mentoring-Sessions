package Polymorphism;

public class Bird extends Animal {

   // Method overriding - declaring the same method in subclass
    // but providing a different implementation

    public void makeSound(){
        System.out.println("Bird is chirping");
    }

    public void eat(){
        System.out.println("Bird is eating worms");
    }


    @Override
    public void move() {
        System.out.println("Bird is flying");
    }
}
