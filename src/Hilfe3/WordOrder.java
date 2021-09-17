package Hilfe3;

public class WordOrder {

    //    Given a String, return its version where order of words are reversed.
//    Examples:
    public static void main(String[] args) {

        System.out.println(reverseWordOrder("Hello World"));// ->"World Hello";
        System.out.println(reverseWordOrder("Java is fun"));// ->"fun is Java"
        System.out.println(reverseWordOrder("Hi How Are You")); //->"You Are How Hi"
        System.out.println(reverseWordOrder("talk is cheap. show me the code")) ;//->"code the me show cheap. is talk"

    }
        public static String reverseWordOrder (String str) {


            String[] words = str.split(" ");

            int length= words.length;
            for (int i = length-1; i >= 0; i--) {
            String reversedStringArray=words[i]+" ";
                System.out.print(reversedStringArray);

        }  return "";
}

}