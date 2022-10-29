package cracking.the.coding.interview.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class SinglyLinkedList {

    private ListNode head;
    private int length;

    public SinglyLinkedList() {
        this.head = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public int getLength() {
        return this.length;
    }

    public void add(int data) {
        ListNode newNode = new ListNode(data);
        ListNode temp = this.head;
        this.length++;

        if (temp == null) {
            this.head = newNode;
            return; //forgot to return from here.
        }

        //1 2
        while (null != temp.next) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void print() {
        ListNode temp = this.head;
        while (null != temp) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("null");
    }

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }


    private void removeDuplicate() {
        ListNode current = this.head;
        Set<Integer> set = new HashSet<>();
        ListNode previous = null;
        while (null != current) {

            if (set.contains(current.data)) { //1, 2,>2?
                previous.next = current.next;
                this.length--;
            } else {
                set.add(current.data);//1 2
                previous = current;//1
            }

            current = current.next;//2
        }
    }

    // not working with ListNode runner = current.next;
    private void removeDuplicateWithoutUsingExtraSpace() {
        ListNode current = this.head;
        while (null != current) {
            ListNode runner = current.next; //current.next wont work.

            while (null != runner) {
                if (current.data == runner.data) {
                    runner = runner.next; //runner.nxt= runner.next.next is only works.
                } else {
                    runner = runner.next;
                }
            }

            current = current.next;
        }

    }

    //https://github.com/careercup/ctci/blob/master/java/Chapter%202/Question2_1/Question.java
    public void deleteDupsB() {
        if (this.head == null) return;

        ListNode current = this.head;
        while (current != null) {
            //* Remove all future nodes that have the same value *//*
            ListNode runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    //https://github.com/careercup/ctci/blob/master/java/Chapter%202/Question2_1/Question.java
    public void deleteDupsC() {
        if (head == null) return;
        ListNode previous = head;
        ListNode current = previous.next;
        while (current != null) {
            // Look backwards for dups, and remove any that you see.
            ListNode runner = head;
            while (runner != current) {
                if (runner.data == current.data) {
                    ListNode tmp = current.next;
                    previous.next = tmp;
                    current = tmp;
                    /* We know we can't have more than one dup preceding
                     * our element since it would have been removed
                     * earlier. */
                    break;
                }
                runner = runner.next;
            }

            /* If runner == current, then we didn't find any duplicate
             * elements in the previous for loop.  We then need to
             * increment current.
             * If runner != current, then we must have hit the ‘break’
             * condition, in which case we found a dup and current has
             * already been incremented.*/
            if (runner == current) {
                previous = current;
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);

        list.removeDuplicateWithoutUsingExtraSpace();
        list.print();

        System.out.println(list.getLength());
        System.out.println(list.isEmpty());
    }
}
