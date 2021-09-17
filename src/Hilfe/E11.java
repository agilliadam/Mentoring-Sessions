package Hilfe;

public class E11 {

//    Given a String "str" of odd length, return a string with length 3 from its middle, so "Candy" yields "and".
//    The string length will be at least 3.
//    Examples:
//    middleThree("Candy") → "and"
//    middleThree("and") → "and"
//    middleThree("solving") → "lvi"

       //
            //tests
//            System.out.println(middleThree("Candy")); // → "and"
//            System.out.println(middleThree("and") ); //→ "and"
//            System.out.println(middleThree("solving")); // → "lvi"
//            System.out.println(middleThree("Chocolate")); // → "col"
//            System.out.println(middleThree("java yet java")); // → "yet"

        public static String middleThree( String str ) {
            //implement here

           int firstPart = (str.length()/2); // gives you smaller part of 2 halves

           String result=  str.substring(firstPart-1,firstPart+2 ); // catching middle 3 letters
            return result;
        }

    public static void main(String[] args) {
            System.out.println(middleThree("Candy")); // → "and"
            System.out.println(middleThree("and") ); //→ "and"
            System.out.println(middleThree("solving")); // → "lvi"
            System.out.println(middleThree("Chocolate")); // → "col"
            System.out.println(middleThree("java yet java")); // → "yet"
    }
    }


