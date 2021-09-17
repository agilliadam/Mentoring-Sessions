package Hilfe;

public class E14 {


//    Given a String str, return a version without both the first and last char of the string.
//    The string may be any length, including 0.
//    Examples:
//    withouEnd2("Hello") → "ell"
//    withouEnd2("abc") → "b"
//    withouEnd2("ab") → ""
//    withouEnd2("a") → ""
//    withouEnd2("") → ""


        public static  String withouEnd2(String str) {

          int lastChar =(str.length()-1);
          String result= str.substring(1,lastChar);
          return result;
        }

    public static void main(String[] args) {
        //tests
        System.out.println(withouEnd2("Hello") ); //→ "ell"
        System.out.println(withouEnd2("abc")); // → "b"
        System.out.println(withouEnd2("ab")); // → ""

        //System.out.println(withouEnd2("a") ); //→ ""
        // System.out.println(withouEnd2("")); // → ""
    }
    }


