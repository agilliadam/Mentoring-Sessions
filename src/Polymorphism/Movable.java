package Polymorphism;

public interface Movable {

    void move(); // public and abstract are assumed


    // Since Java 8, interfaces can also have default and static methods

    public default void method1(){ // default methods are methods with implementation/body
        System.out.println("");
    }

    public static void method2(){
        System.out.println("");
    }


}
