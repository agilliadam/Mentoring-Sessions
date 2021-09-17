package Hilfe;

public class E8 {

    //    Given a string called "out" with length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>".
//    Examples:
//    makeOutWord("<<>>", "Yay") → "<<Yay>>"
//    makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
//    makeOutWord("[[]]", "word") → "[[word]]"
//
//    class Main {
//        public static void main(String[] args) {
//            // test here
//            System.out.println(makeOutWord("<<>>", "Yay"));   //→ "<<Yay>>"
//            System.out.println(makeOutWord("<<>>", "WooHoo"));  //→ "<<WooHoo>>"
//            System.out.println(makeOutWord("[[]]", "word")) ; // → "[[word]]"
//            System.out.println(makeOutWord("HHoo", "Hello")); // → "HHHellooo"
//            System.out.println(makeOutWord("abyz", "YAY")); // → "abYAYyz"
//        }
    public static String makeOutWord(String out, String word) {
        // implement here
        String firstHalf = out.substring(0, 2);
        String secondHalf = out.substring(2);
        return firstHalf + word + secondHalf;
    }


    public static void main(String[] args) {
//            // test here
        System.out.println(makeOutWord("<<>>", "Yay"));   //→ "<<Yay>>"
        System.out.println(makeOutWord("<<>>", "WooHoo"));  //→ "<<WooHoo>>"
        System.out.println(makeOutWord("[[]]", "word")) ; // → "[[word]]"
        System.out.println(makeOutWord("HHoo", "Hello")); // → "HHHellooo"
        System.out.println(makeOutWord("abyz", "YAY")); // → "abYAYyz"
    }
}