package Polymorphism;

public class Vehicle implements Movable{
    @Override
    public void move() {
        System.out.println("Vehicle is accelerating");
    }
}
