package test;

import javafx.print.Collation;

import java.util.*;

public class CollectionsDemo {


    public static void main(String[] args) {

        // Java Collections Framework - Java's term for 4 interfaces: LiST, SET, QUEUE, MAP
        // Collection - Super Interface for List, Set and Queue
        // Collections class - A utility class to perform utility actions on collection interface classes


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(56);
        list.add(200);
        list.add(-4);

      //  Collections.sort(list);
      //  Collections.reverse(list);

     //   Collections.sort(list, Comparator.reverseOrder());

        Collections.sort(list);



        System.out.println(list);

        int index = Collections.binarySearch(list, 44);

        System.out.println(index);

        // binary search requires that the collection is sorted in an ascending order

        List<Integer> newList = new ArrayList<>();
        newList.add(23);

        newList.addAll(list);
        System.out.println(newList);

        List<Integer> list2 = new ArrayList<>(newList);

        System.out.println(list2);


        List<String> wordList=new ArrayList<>();
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

        System.out.println(wordList);

        Set<String> uniqueStrings = new HashSet<>(wordList);

        wordList = new ArrayList<>(uniqueStrings);
        System.out.println(wordList);






    }
}
