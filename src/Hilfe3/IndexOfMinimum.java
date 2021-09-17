package Hilfe3;

public class IndexOfMinimum {


    public static void main(String[] args) {
        int[] arr = {34, 22, 45, 12, 56, 22, 77, 12};
        System.out.println(getIndexOfMin(arr)); // 3
    }

    public static int getIndexOfMin(int[] arr) {
        int min = arr[0];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
}