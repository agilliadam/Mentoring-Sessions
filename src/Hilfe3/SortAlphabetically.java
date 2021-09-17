package Hilfe3;

import java.util.Arrays;

public class SortAlphabetically {


    public static void main(String[] args) {
        //tests
        System.out.println(sortString("helloworld")); //dehllloorw
        System.out.println(sortString("javascript"));  //aacijprstv
        System.out.println(sortString("algorithm"));  //aghilmort
        System.out.println(sortString("barack"));  //aabckr
        System.out.println(sortString("parviz")); //aiprvz
        System.out.println(sortString("stamlo")); // almost
    }

    public static String sortString(String str) {
        //implement
        char[] letters = str.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            for (int j = i + 1; j < letters.length; j++) {
                if (letters[i] > letters[j]) {
                    char temp = letters[i];
                    letters[i] = letters[j];
                    letters[j] = temp;
                }
        }
    }   return (String.valueOf(letters));
}

        }