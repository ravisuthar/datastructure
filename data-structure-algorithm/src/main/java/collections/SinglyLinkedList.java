package collections;

import java.util.List;

public class SinglyLinkedList {
    ListNode head;

    public void insertFirst(int value) {
        ListNode newHead = new ListNode(value);
        newHead.next=this.head;
        this.head=newHead;
    }

    public void deleteFirst() {
        this.head= this.head.next;
    }

    public void deleteLast(){
        ListNode previous=null;
        ListNode current = this.head;
        while(null!=current.next){
            previous=current;
            current=current.next;
        }
        previous.next=null;
    }

    //Must watch once
    public void insertLast(int value) {
        ListNode lastNode = new ListNode(value);

        if(this.head==null){
            this.head=lastNode;
            return;
        }

        ListNode current = this.head;
        while(current.next!=null){
            current=current.next;
        }

        current.next=lastNode;
    }


    //not inserting at beginning
    //https://www.youtube.com/watch?v=D0sFHueV30U&list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d&index=26&ab_channel=DineshVaryani
    public void insertAtPosition(int value, int position){

        int count=1;
        ListNode current = this.head;
        while(null!=current){
            if(++count==position){
                ListNode temp = current.next;
                ListNode newNode = new ListNode(value);
                current.next=newNode;
                newNode.next=temp;
            }
            current=current.next;
        }
    }

    //good to test.
    //https://www.youtube.com/watch?v=D0sFHueV30U&list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d&index=26&ab_channel=DineshVaryani
    public void insert(int value, int position){
        ListNode node = new ListNode(value);
        if(position==1){
            node.next=this.head;
            this.head=node;
        }else{
            int count =1;
            ListNode previous = this.head;
            while(count < position-1){
                previous=previous.next;
                count++;
            }

            if(previous==null){
                return;
            }

            ListNode temp = previous.next;
            previous.next=node;
            node.next=temp;
        }
    }


    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = next;
        }
    }

    public void print(){
        ListNode current = head;
        while(current!=null){
            System.out.print(" "+current.data);
            current=current.next;
        }
        System.out.println(" null");

        /*do{
            System.out.println(current.data);
            current=current.next;
        }while(current!=null);*/

    }

    public int getLength(){
        int count=0;
        ListNode current = head;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }

    public void getPopulatedList(){
        this.head= new ListNode(10);
        ListNode second= new ListNode(1);
        ListNode third= new ListNode(8);
        ListNode fourth= new ListNode(11);

        head.next=second;// 10->1
        second.next=third;//10->1->8
        third.next=fourth;//10->1->8->11
    }
}
