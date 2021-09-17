package Hilfe2;

public class Duplicate {


//    Create a method that returns the first duplicate char of the String. If no duplicate char is found, return an empty char. ' '


//    duplicate("avcdevfc") -> v
//    duplicate("aacdevfc") -> a
//    duplicate("acdedfce") -> c


    public static void main(String[] args) {
        System.out.println(duplicate("avcdevfc")); //v
        System.out.println(duplicate("aacdevfc")); //a
        System.out.println(duplicate("acdedfce")); //c
    }

    public static char duplicate(String str) {

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                if (c == str.charAt(j)) {
                    return c;
                }
            }
        }return ' ';
    }

}


//        char x = ' ';
//        for (int i = 0; i <= str.length(); i++) {
//
//            if (str.charAt(i) == str.charAt(i + 1)) {
//                x = str.charAt(i);
//
//
////
//               userKeyword.length();
//                int i;
//                for (i=0; i<str.length(); i++){
//                    if (str.charAt(i) != str.charAt(i) + 1)){
//                       x = "" + str.charAt(i);
//                       str = x;
//                    }
//                }
//                return userKeyword;
//



