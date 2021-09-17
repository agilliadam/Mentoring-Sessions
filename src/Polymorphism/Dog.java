package Polymorphism;

public class Dog extends Animal{


    public void makeSound(){

        System.out.println("Dog is barking");

    }

    @Override
    public void eat() {
        System.out.println("Dog is eating bones");
    }

    @Override
    public void move() {
        System.out.println("Dog is running");
    }
}
