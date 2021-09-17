package Hilfe2;
class  HollowRectangle {


    static void printRectangle(int a, int b) {
        int i, j;
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= b; j++) {
                if (i == 1 || i == a ||
                        j == 1 || j == b)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        printRectangle(10,10);

    }
}