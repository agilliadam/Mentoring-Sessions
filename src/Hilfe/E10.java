package Hilfe;

public class E10 {


//    Given two strings, return their concatenated version, except omit the first character of each.
//    The strings will be at least length 1.
//    Examples:
//    noStart("Hello", "There") → "ellohere"
//    noStart("java", "code") → "avaode"
//    noStart("shotl", "java") → "hotlava"


        public static String noStart(String a, String b) {
            //implement here
            String aWithoutFirstCharacter=a.substring(1);
            String bWithoutFirstCharacter=b.substring(1);

            return aWithoutFirstCharacter+bWithoutFirstCharacter;
        }

    public static void main(String[] args) {
        //tests
        System.out.println(noStart("Hello", "There")); // → "ellohere"
        System.out.println(noStart("java", "code"));  // → "avaode"
        System.out.println(noStart("shotl", "java")); // → "hotlava"
        System.out.println(noStart("x", "ac")); // → "c"
        System.out.println(noStart("a", "x")); // → ""
    }



    }


