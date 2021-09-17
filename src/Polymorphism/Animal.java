package Polymorphism;

import java.util.Comparator;

public abstract  class Animal implements Movable {  //public abstract  class Animal implements Movable, Comparable, Comparator, Runnable {


    int age = 12;
  double weight;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public void makeSound(){

        System.out.println("Animal is making sound");

    }

    public abstract void eat();

}


