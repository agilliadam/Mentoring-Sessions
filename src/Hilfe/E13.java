package Hilfe;

public class E13 {

   // Given a String str, return the version where the first 2 chars are moved to the end.
//    The string length will be at least 2.
//    Examples:
//    left2("Hello") → "lloHe"
//    left2("java") → "vaja"
//    left2("Hi") → "Hi"
//    left2("code") → "deco"
//    left2("cat") → "tca"
//    left2("12345") → "34512"


    public static String left2(String str) {
        String firstTwo=str.substring(0,2);
        String rest=str.substring(2);
        String result=rest+firstTwo;
        return result;
    }

    public static void main(String[] args) {
        // tests
        System.out.println(left2("Hello")); // → "lloHe"
        System.out.println(left2("java")); // → "vaja"
        System.out.println(left2("Hi"));// → "Hi"
        System.out.println(left2("code")); //  → "deco"
        System.out.println(left2("cat")); // → "tca"
        System.out.println(left2("12345")); // → "34512"
    }
}


