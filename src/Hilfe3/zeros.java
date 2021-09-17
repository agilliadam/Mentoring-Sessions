package Hilfe3;

import java.util.Arrays;

public class zeros {
    //Check your output using the tests:
    //TEST 1
    public static void main(String[] args) {

        int[] arr1 = {0, 1, 0, 3, 12};

        moveZeroes(arr1);
        System.out.println(Arrays.toString(arr1)); //  [1, 3, 12, 0, 0]
        //TEST 2
        int[] arr2 = {0, 0, 0, 0, 0, 0, 1};

        moveZeroes(arr2);
        System.out.println(Arrays.toString(arr2)); //  [1, 0, 0, 0, 0, 0, 0]
        //TEST 3
        int[] arr3 = {12, 2, 0, 0, 2, 0, 0, 78, 0, 12, 0};

        moveZeroes(arr3);
        System.out.println(Arrays.toString(arr3)); //  [12, 2, 2, 78, 12, 0, 0, 0, 0, 0, 0]
        //TEST 4
        int[] arr4 = {0};

        moveZeroes(arr4);
        System.out.println(Arrays.toString(arr4)); //  [0]
    }


    public static void moveZeroes(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; ++i) {
            for (int j = i + 1; j < numbers.length; ++j) {
                if (numbers[i] == 0) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;

                }

            }
        }
    }
}