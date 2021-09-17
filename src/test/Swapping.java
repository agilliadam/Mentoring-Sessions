package test;

import java.util.Arrays;

public class Swapping {


    // Write  a method that checks if given String is a palindrome. Use arrays.
    public static boolean isPalindrom(String str) {

        // civoc
        char[] letters = str.toCharArray();

        for (int i = 0, j = letters.length - 1; i < j; i++, j--) {

            if (letters[i] != letters[j]) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrom("string"));
        System.out.println(isPalindrom("talat"));
        System.out.println(isDubliate(new int[]{3, 2, 3, 1, 3}));

        System.out.println(isDuplicateUnsorted( new int[]{1,2,3,1} ));

        // Array is mutable
        int[] arr = {1, 2, 3};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }

        System.out.println(Arrays.toString(arr));


        int[] numbers = {6, 8, 12, 4, 22, 7, 3};

        // Find the max number in this array;

//        Arrays.sort(numbers);
//
//        System.out.println(numbers[numbers.length-1]);

        int max = numbers[0];  // we are assuming first element is max
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // update the value of max if the numbers[i] is greater than max
            }
        }

        System.out.println("The max is: " + max);


        // Find the smallest value

        int min = numbers[0];  // we are assuming first element is max
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];

            }

        }
        System.out.println("The min is: " + min);
    }



    // Create a method that takes an int[] and returns true if the array contains duplicate

    // {1,2,3,4} -> false
    // {1,2,2,3} -> true
    // {1,2,3,1,5,6,7,8,2,1,3,2} -> true

    public static boolean isDubliate(int[] arr){

        Arrays.sort(arr);
        for (int i=0; i<arr.length-1; i++){

           if (arr[i]== arr[i+1]) {
               return true;
           }
        }
        return false;

    }

    // {1,2,3,,5,6,7,8,9} -> true
    public static boolean isDuplicateUnsorted(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {


            for (int j = i+1; j < arr.length ; j++) {

                if(arr[i] == arr[j]){
                    return true;
                }
            }

        }

        return false;



    }





}



