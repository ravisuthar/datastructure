package leetcode.must.doo;

import collections.SinglyLinkedList;

public class SinglyLinkedListTest {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.getPopulatedList();
        //list.print();
       // System.out.println("Length is: " + list.getLength());
        list.insertFirst(12);
        //list.print();
        list.insertLast(20);
        //list.print();
        list.insert(200000,8);
        list.print();
        list.deleteFirst();
        list.print();
        list.deleteLast();
        list.print();
    }
}
