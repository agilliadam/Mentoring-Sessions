package Collections;
import java.util.Arrays;

public class BigONotation {


    public static void main(String[] args) {

        // Big O notation is used in programming to denote algorithm's efficiency
        // which is also called time complexity

        // O(n) (O of n) -> linear efficiency (number of operations grow linearly as your collection grows)
        // O(1) - constant time complexity (retrieving array's first and last element)
        // O(n^2) -> nested loops where for each element you iterate the rest of the collection
        // O(log n) -> binary time complexity, where the search is reduced to half with every iteration

        // Find duplicates

        int[] arr = {1,3,2,4,5,7,6,4,1,3,2,1};


        OUTER:for (int i = 0; i < arr.length -1 ; i++) {

            inner:for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    System.out.println("The duplicate is found at index " + j + " with value "
                            + arr[j]);
                    break OUTER;
                }
            }

        }   // Big O of the above algo is O(n^2)

        Arrays.sort(arr);

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1]){
                System.out.println("The duplicate is found at index " + (i+1) + " with value "
                        + arr[i+1]);
                break;
            }
        }

        // Time complexity of the above algorithm is O(n)

        //Example of different Big O notations
        // Difference between linear search and binary search
        // Linear search -> O(n)
        // Binary search -> O(log n) (requires sorting)

    }

}
