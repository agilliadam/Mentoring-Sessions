package Hilfe;

import java.util.Scanner;

public class E6 {


//    Given three variables:
//            ```
//    String str
//```
//        ```
//    int start
//```
//        ```
//    int end
//```
//    Print out the following string:
//    The substring of (str) from (start) to (end) is (substring from start to end, inclusive)
//    Sample output:
//            ```
//    In: lolwut
//```
//        ```
//    Start: 2
//            ```
//            ```
//    End: 4
//            ```
//            ```
//    The substring of lolwut from 2 to 4 inclusive is lwu
//```
//    PLEASE NOTE that we are including the end index in our output!
//            ```
//    lolwut
        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.print("In:");
            String str = inp.nextLine();
            System.out.print("Start:");
            int start = inp.nextInt();
            System.out.print("End:");
            int end = inp.nextInt();
            // Don't change the code above! Write our code below
            System.out.println("The substring of "+ str+" from "+ start+"  to "+ end +"  is "+ str.substring(start, end+1));
        }
    }


