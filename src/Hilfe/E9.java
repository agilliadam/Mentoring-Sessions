package Hilfe;

public class E9 {


//    Given a String "str" of even length, return the first half of that string. So the string "WooHoo" yields "Woo".
//    Examples:
//    firstHalf("WooHoo") → "Woo"
//    firstHalf("HelloThere") → "Hello"
//    firstHalf("abcdef") → "abc"



        public static String firstHalf(String str) {
            //implement here

            int halfOfWord = str.length()/2;
         String result=  str.substring(0, (halfOfWord));

            return result;
        }



    public static void main(String[] args) {
        //tests
        System.out.println(firstHalf("WooHoo")); // → "Woo"
        System.out.println(firstHalf("HelloThere")); // → "Hello"
        System.out.println(firstHalf("abcdef"));  // → "abc"
        System.out.println( firstHalf("ab") ); //→ "a"
        System.out.println(firstHalf("") ); //→ ""
    }
    }


