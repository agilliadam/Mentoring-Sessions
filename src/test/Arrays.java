package test;
//
//import java.util.Arrays;
//
// {
//    //Given an int array called nums, move all 0's to the end of it while maintaining the order of the other elements.
//
//    //Note that you must do this in-place without making a copy of the array, that is, modify the given array without creating a new one.
//    // Examples: {0, 1, 0, 3, 12} -> {1, 3, 12, 0, 0}
//    //  {21,0,20,0,1} -> {21,20,1,0,0}
//    //  {21,20,0,0,1
//
//
//    //   {22, 0, 10, 0, 9, 0, 12, 0} -> {22, 10, 9, 12, 0, 0, 0, 0}
//    //   {0,0,0,0,0,0,1} -> {1,0,0,0,0,0,0}
//    //   {22,0,0} -> {22,0,0}
//    //   {0} -> {0}
//  public static void move0( int[] numbers){
//
//      for (int i=0; i < numbers.length-1 ; i++) {
//          for (int j = i + 1; j < numbers.length; j++) {
//              if (numbers[i] == 0) {
//                  int temp = numbers[i];
//                  numbers[i] = numbers[j];
//                  numbers[j] = temp;
//              }
//              System.out.print("Outer loop:" + i + " Inner loop: " + j );
//              System.out.println(java.util.Arrays.toString(numbers));
//
//          }
//
//      }
//          }
//
//
//
//
//
//
//
//
//
//
//
//
//
//   /* Objective:
//    Write a void method that takes in the 2 arrays provided as parameters then displays the values as:
//            "title", "category"
//    //In main, call the method that was created to test the function. Assume 2 arrays have equal length */
//
//            //"Pluto TV Kids","5c12fe491c932b67bd8e3d80"
//          // "Western TV" , "5f19a8763eae7b0007f5c45e"
//
//
//public static void print2Arrays(String[]titlesArray,String[] categoriesArray){
//    System.out.println();
//
//
//
//
//
//
//
//
//
//
//
//    for(int i=0; i< titlesArray.length; i++) {
//
//        System.out.println(titlesArray[i]+" : "+categoriesArray[i]);
//
//    }
//
//   // printArray(titlesArray, categoriesArray);
//
//}
//
//
//    public static void main(String[] args) {
//        String[] titlesArray = { "Pluto TV Kids", "CNET", "Pluto TV Sports", "Naturescape", "Fear Factor", "Flicks of Fury", "PeopleTV", "Rescue 911", "The Amazing Race", "Pluto TV Drama Life", "Western TV" };
//
//        String[] categoriesArray = { "5c12fe491c932b67bd8e3d80", "5c12f932be491cbd678e3d87", "5c12fe491cbd932b678e3d8f",
//                "5cffe094ad44e55543791bfc", "5f19a84079572700079d28e0", "5c12fe2b678e3491cbd93d84",
//                "5c12fe491cbd932b678e3d7b", "5f18407959a72700079d28e0", "5f197995727a808e04070d20",
//                "5f19a84079572700079d28e0", "5f19a8763eae7b0007f5c45e" };
//
//        print2Arrays( titlesArray,categoriesArray);
//
//       int[]arr=new int[]{21,0,20,0,1};
//
//       move0 (arr);
//        System.out.println(java.util.Arrays.toString(arr));
//
//    }
//}
