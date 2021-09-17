package Hilfe;

public class E16 {


//    Given a String str, return true if the first 2 chars in the string also appear at the end of the string, otherwise return false.
//    Examples:
//    frontAgain("edited") → true
//    frontAgain("edit") → false
//    frontAgain("ed") → true
//    frontAgain("jjj") → true
//    frontAgain("jjjj") → true
//    frontAgain("jjjk") → false
//    frontAgain("x") → false
//    frontAgain("") → false


        public static boolean frontAgain(String str) {
            if (str.length() < 2)
                return false;

            String first2= str.substring(0,2);
            String last2 =str.substring(str.length()-2,str.length());

            if (first2.equals(last2))
             return true;
             else
                return false;
        }

    public static void main(String[] args) {
        System.out.println(frontAgain("edited")); // → true
        System.out.println(frontAgain("edit")); // → false
        System.out.println(frontAgain("ed")); // → true
        System.out.println(frontAgain("jjj")); // → true
        System.out.println(frontAgain("jjjj")); // → true
        System.out.println(frontAgain("jjjk")); // → false
        System.out.println(frontAgain("x")); // → false
        System.out.println(frontAgain("")); // → false
    }
    }

