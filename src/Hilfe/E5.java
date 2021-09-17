package Hilfe;

import java.util.Scanner;

public class E5 {

//    given a String (already declared for you as str), do the following:
//            - Print out the following: "The first 3 letters of \_\_\_ is ___"
//    For example, if the input is "banana", your output should be "The first 3 letters of banana is ban"

        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.print("In:");
            String str = inp.nextLine();
            // Don't change the code above! Write your code below
            System.out.println("The first 3 letters of "+str+" is "+ str.substring(0,3));
        }
    }


