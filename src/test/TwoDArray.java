package test;

import java.util.Arrays;

public class TwoDArray {


    public static void main(String[] args) {
        int[][] arr = new int[5][4];

        System.out.println(Arrays.deepToString(arr));

        arr[0][1] = 22;
        System.out.println(Arrays.deepToString(arr));

        arr[4][1] = 22;
        System.out.println(Arrays.deepToString(arr));


        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 33;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();

        }

        arr[4] = new int[]{1, 2, 3, 4, 5, 6};

        System.out.println(Arrays.deepToString(arr));


        String[] titlesArray = { "Pluto TV Kids", "CNET", "Pluto TV Sports", "Naturescape", "Fear Factor", "Flicks of Fury", "PeopleTV", "Rescue 911", "The Amazing Race", "Pluto TV Drama Life", "Western TV" };

        String[] categoriesArray = { "5c12fe491c932b67bd8e3d80", "5c12f932be491cbd678e3d87", "5c12fe491cbd932b678e3d8f",
                "5cffe094ad44e55543791bfc", "5f19a84079572700079d28e0", "5c12fe2b678e3491cbd93d84",
                "5c12fe491cbd932b678e3d7b", "5f18407959a72700079d28e0", "5f197995727a808e04070d20",
                "5f19a84079572700079d28e0", "5f19a8763eae7b0007f5c45e" };

        System.out.println(Arrays.deepToString(get2Arrays(titlesArray,categoriesArray)));



    }

    // {  {"Pluto", "s732623563"},
    // {"TV", "7632632342673"},


    public static String[][] get2Arrays(String[] titlesArray, String[] categoriesArray) {
        String[][] TwoD = new String[titlesArray.length][2];
        for (int i = 0; i < titlesArray.length; i++) {
            for (int j = 0; j < 2; j++) {
                if(j==0){
                    TwoD[i][j] = titlesArray[i];
                }else{
                    TwoD [i][j]=categoriesArray[i];
                }


            }
        }


        return TwoD;


    }

}
