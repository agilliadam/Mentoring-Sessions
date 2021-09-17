package Hilfe;

public class E18 {


//    Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
//    extraEnd("Hello") → "lololo"
//    extraEnd("ab") → "ababab"
//    extraEnd("Hi") → "HiHiHi"
//    extraEnd("World") → "ldldld"


        public static String extraEnd(String str){
           String last2= str.substring(str.length()-2);
            return last2+last2+last2  ;
        }

    public static void main(String[] args) {

        System.out.println(extraEnd("Hello"));
        System.out.println(extraEnd("ab"));
        System.out.println(extraEnd("Hi"));
        System.out.println( extraEnd("World"));

    }
    }


