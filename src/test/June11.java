package test;

import java.util.*;
import java.util.Arrays;
import java.util.List;

public class June11 {


//    The next ArrayList method we are going to learn is .remove()
//
//The .remove(i) method will remove the element at index i. This means that all elements after index i will be shifted back to fill the hole left by the removal.
//
//    As an example, say you had an ArrayList called nums with values (6,2,3,1,9,2,5). Running the following code:
//
//            nums.remove(1);
//nums.remove(1);
//    will result in (6,3,1,9,2,5). Running the following code again:
//
//            nums.remove(3);
//nums.remove(3);
//nums.remove(3);
//nums.remove(3);
//    will result in (6,3,1,5), because after the first remove(3) is run, the 2 and 5 get pushed up into the 3rd and 4th index, and then the second remove(3) will remove the 2, leaving the 5. Ask Mr. Chen to demonstrate this if you're still confused.
//
//    On the left, write code that will remove the first two elements in an ArrayList of doubles (be careful, this is a little tricky!)
//
//
public static void test(ArrayList<Double> dubs)
{
    dubs.remove(0);
    dubs.remove(0);

}











//    Create a static method that:
//
//    is called combineAL
//    returns an ArrayList
//    takes two parameters: an ArrayList of Strings called wordList1, and an ArrayList of Strings called wordList2
//    This method should create a new ArrayList of Strings, add all the words (in order) from wordList1, then add all the words (in order) from wordList2. In other words, it is combining all the elements from the two parameters.
//
//


    public static ArrayList<String> combineAL(ArrayList<String> wordList1, List<String> wordList2) {

        ArrayList<String> newList = new ArrayList<>();
        for (String e : wordList1) {
            newList.add(e);
        }
        for (String e : wordList2) {
            newList.add(e);

        }
        return newList;


    }


    public static void main(String[] args) {
        ArrayList<String> wordList1=new ArrayList<>();
        wordList1.add("father");
        wordList1.add("mother");
        wordList1.add("son");

      List<String> wordList2= Arrays.asList("aunt", "cousin", "granny");


        System.out.println(combineAL(wordList1,wordList2));


        ArrayList<Double> dubs=new ArrayList<>();
        dubs.add(12.5);
        dubs.add(78.9);
        dubs.add(13.9);
        dubs.add(7.9);
        dubs.add(11.9);
        dubs.add(88.2);
        test( dubs);




        ArrayList<String> wordList=new ArrayList<>();
        wordList.add("father");
        wordList.add("mother");
        wordList.add("son");
        wordList.add("father");
        wordList.add("mother");
        wordList.add("son");
        wordList.add("father");
        wordList.add("mother");
        wordList.add("son");
        wordList.add("father");
        wordList.add("mother");
        wordList.add("son");

        removeDupllicates(wordList);
        System.out.println(wordList);


    }


    // Java Collections Framework - Java's term for 4 interfaces: LiST, SET, QUEUE, MAP
    // Collection - Super Interface for List, Set and Queue
    // Collections class - A utility class to perform utility actions on collection interface classes


    public static void removeDupllicates(ArrayList<String> names){
        Collections.sort(names);
        System.out.println(names);
        for (int i=0; i <names.size()-1; i++ ) {
            if (names.get(i).equals(names.get(i+1))){

               names.remove(i);
               i--;
            }

        }
    }








}