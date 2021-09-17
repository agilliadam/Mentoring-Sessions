package test;

import java.util.Arrays;

public class May19 {


    public static boolean isPalindrom (String input) {

       char[] letters = input.toLowerCase().toCharArray();

        // c    v i  c

        for (int i = 0, j= letters.length-1; i < j; i++, j--) {
            if (letters[i]!=letters[j]) {
                return false;
            }

            }
        return true;
        }







    // Given a String str, return a version without both the first and last char of the string.
    //The string may be any length, including 0.

    public static String cutStr(String str) {

        String cutFragment = str.substring(1, str.length() - 1);


        return cutFragment;
    }

    // Create a method called alternative that will return the given string in alternating cases, with the first letter being lowercase.

    public static String result(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {

            if (i % 2 == 0) {
                char even = Character.toLowerCase(str.charAt(i));
                result += even;
            } else {

                result += Character.toUpperCase(str.charAt(i));
            }
        }
        return result;
    }

   // Create a method called countString that accepts 2 Strings called str and toFind  and returns the count of the occurrences of toFind within str.

    //Examples:

    //countString("crazy crayfish crushing craniums", "cra") -> 3
   // countString("somememememmetimessolutionsdontcomeontime", "me") -> 4

public static int howManyTimes(String input, String sub){
int howManyTimes=0;
    for (int i = 0; i <= input.length()-sub.length() ; i++) {
        String toFind = input.substring(i, i+sub.length());
        if (toFind.equals(sub)) {
            howManyTimes++;
        }
    }
    return howManyTimes;

    }


    public static void main(String[] args) {
        System.out.println(cutStr("Natella"));

        System.out.println(result("natella"));

        System.out.println(howManyTimes("somememememmetimessolutionsdontcomeontime", "time"));

        System.out.println(isPalindrom("talat"));


        int[] arr = {1, 2, 3, 5, 6}; // {6,5,3,2,1}

        // swap


        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));


        int i = 6;

        int j = 8;

        int temp = i;

        i = j;

        j = temp;

    }



    }

