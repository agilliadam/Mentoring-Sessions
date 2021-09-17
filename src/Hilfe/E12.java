package Hilfe;

public class E12 {


//    Given a String str, return a version without the first and last character, so "Hello" yields "ell".
//    The string length will be at least 2.
//    withoutEnd("Hello") → "ell"
//    withoutEnd("java") → "av"
//    withoutEnd("coding") → "odin"
//    withoutEnd("woohoo") → "ooho"
//    withoutEnd("ab") → ""
//
//



        public static String withoutEnd(String str) {
         int lastCharacter = str.length()-1;
        String result= str.substring(1,lastCharacter); // we cut index 0 (first letter) and str.length()-1 (last letter)

            return result;
        }


    public static void main(String[] args) {
            // tests
        System.out.println(withoutEnd("Hello")); // → "ell"
        System.out.println(withoutEnd("java")); // → "av"
        System.out.println(withoutEnd("coding")); // → "odin"
        System.out.println(withoutEnd("woohoo")); // → "ooho"
        System.out.println(withoutEnd("ab") ); //→ ""
    }
    }


