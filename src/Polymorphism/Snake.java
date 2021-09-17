package Polymorphism;

public class Snake extends Animal{

    int age = 22;


    public void makeSound(){

        System.out.println("Snake is hissing");

    }

    @Override
    public void eat() {
        System.out.println("Snake is eating mice");
    }

    @Override
    public void move() {
        System.out.println("Snake is crawling");
    }
}
