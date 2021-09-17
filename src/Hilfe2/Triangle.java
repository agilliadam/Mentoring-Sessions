package Hilfe2;

public class Triangle {

    //    Create a method that takes an int and a char and prints out a triangle with a given height and character.
//    Refer to the attached pictures for examples.
//
    static class Main {
        public static void main(String[] args) {
            //Tests
            printTriangle(5, '&');
            printTriangle(10, '*');
            printTriangle(25, '%');
        }


        public static void printTriangle(int height, char ch) {

            int i, j, k;

            for (i = 0; i <height + 1; i++) {
                for (j = height; j > i; j--) {
                    System.out.print(" ");
                }
                for (k = 0; k < (2 * i - 1); k++) {
                    System.out.print(ch);
                }
                System.out.println();
            }

        }
        }
    }

