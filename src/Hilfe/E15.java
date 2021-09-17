package Hilfe;

public class E15 {

//    Given a String str and an int n, return a String made of the first and last n chars from the string.
//    The string length will be at least n.
//    Examples:
//    nTwice("Hello", 2) → "Helo"
//    nTwice("Chocolate", 3) → "Choate"
//    nTwice("Chocolate", 1) → "Ce"
//    nTwice("Chocolate", 0) → ""
//    nTwice("Hello", 4) → "Hellello"
//    nTwice("Code", 4) → "CodeCode"
//    nTwice("Code", 2) → "Code"


        public static String nTwice(String str, int n) {

            String cutPartBeginning= str.substring(0, n); //cuts first part of the string
            String cutPartEnding= str.substring(str.length()-n); //cuts end part of the string
            return cutPartBeginning+cutPartEnding;
        }


    public static void main(String[] args) {
        //tests
        System.out.println(nTwice("Hello", 2)); // → "Helo"
        System.out.println(nTwice("Chocolate", 3)); // → "Choate"
        System.out.println(nTwice("Chocolate", 1)); // → "Ce"
        System.out.println(nTwice("Chocolate", 0)); // → ""
        System.out.println(nTwice("Hello", 4)); // → "Hellello"
        System.out.println(nTwice("Code", 4)); // → "CodeCode"
        System.out.println(nTwice("Code", 2)); // → "Code"
    }
    }

