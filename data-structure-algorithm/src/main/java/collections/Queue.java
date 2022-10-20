package collections;

import java.util.List;

//FIFO
//
public class Queue {

    private ListNode head;
    private ListNode tail;
    private int length;

    public static class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data) {
            this.data = data;
            this.next=null;
        }
    }

    public boolean isEmpty() {
        return this.length==0;
    }

    public int getLength(){
        return this.length;
    }

}
