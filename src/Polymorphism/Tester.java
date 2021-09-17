package Polymorphism;

public class Tester {

    public static void main(String[] args) {

    //    Animal a = new Animal();
        Bird b = new Bird();

       // Polymorphism is an ability of an object to take many forms
        // We can create a polymorphism by assigning a subclass object
        // to a superclass reference

        // Static vs Dynamic Binding
        // Early binding vs late binding
        // Compile-time polymorphism vs Run-time polymorphism



//        Animal animal;
//        animal = new Snake();
//        animal.makeSound(); // Snake's makeSound() method is a
//
//        System.out.println(animal.age); // Animal's age
//        System.out.println(((Snake)animal).age); // Downcasting of animal to snake

     //   System.out.println(((Desk)animal).age); // Casting of unrelated types will give compiler error


        Animal animal1 = new Snake();
        animal1.makeSound();
        animal1.eat();
        animal1.makeSound();
        animal1.eat();
        animal1.makeSound();
        animal1.eat();
        animal1.makeSound();
        animal1.eat();
        animal1.makeSound();
        animal1.eat();


        String [] arr;
        Animal [] animals = new Animal[3];

        animals[0] = new Bird();
        animals[1] = new Snake();
        animals[2] = new Dog();

        for (Animal animal : animals) {
            animal.eat();
        }

      //   WebDriver driver = new FirefoxDriver();  Example of polymorphism in test automation
      //  driver.get();

      //  Movable movable = new Movable();  // cannot create an object

        Movable[] movables = { new Bird(), new Dog(), new  Snake(), new Vehicle()};

        for (Movable movable : movables) {
            movable.move();
        }

        int [] arr1 = new int[4];

        for(int e : arr1){    // for each loop avoids index usage
            System.out.println(e);
        }

        String [] arr2 = new String [5];
        // iter + Enter
        for (String s : arr2) {

        }

        int i = 8;
        switch (i){
            case 1:
                System.out.println("csdvv");
                break;
            case 3:
                System.out.println("csdvv");
                break;
            case 2:
                System.out.println("csdvv");
                break;
            default:
                System.out.println("No match");
        }


    }
}
