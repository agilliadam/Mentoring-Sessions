package Collections;

import java.util.LinkedList;

    class LinkdedListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(2);
        nums.add(1);
        nums.add(3);
        nums.addFirst(10);  // adds to the beginning of the list
        nums.addLast(77); // add to the end
        nums.removeFirst();
        nums.removeLast();
        System.out.println(nums);
    }
}
        //LinkedList is a data structure where each element is a Node that has
        // a pointer to the next and previous Nodes.

        //ArrayList  is efficient for retrieving (get() method) element s from the list

        // LinkedList is efficient for modifying (insertion and deletion) the list contents
        // from the beginning or at the end of the list

        // ArrayList get() operation -> Time complexity -> O(1)
        // LinkedList  get() operation -> Time complexity -> O(n)

        // ArrayList insert and delete operations -> Time complexity -> O(n)
        // LinkedList insert and delete operations at the beginning and at the end -> O(1)