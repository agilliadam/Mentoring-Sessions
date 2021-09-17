package Collections;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
    Stack<String> names = new Stack<>();

        names.push("Aaron"); // add
        names.push("Joe");
        names.push("Jose");
        names.push("Natella");
        System.out.println(names);

        while(!names.isEmpty()){
            System.out.print(names.pop() + " ");
        }
    }
}



//  System.out.println(names.pop()); // removes the last item and returns its value
//  System.out.println("The list content after last pop: " + names);
//
//  System.out.println(names.peek()); // return the value of last item in stack without removing
//  System.out.println("The list content after peek() method : " + names);