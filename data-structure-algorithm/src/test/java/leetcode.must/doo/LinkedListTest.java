package leetcode.must.doo;

import collections.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add(1);
        //list.display();

        list.add(2);
        //list.display();

        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);


        //list.display();

      //  list.display(list.reverseRecursion());
        System.out.println(list.hasCycle());
    }
}
