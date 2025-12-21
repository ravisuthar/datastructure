package dinesh.varyani.linkedlist;

import java.util.List;

public class SinglyLinkedList_Oct2025 {

    private ListNode head;
    private int length;

    class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    void insert(int data){
        ListNode newNode = new ListNode(data);

        if(null==head){
            this.head=newNode;
            this.length++;
            return;
        }

        ListNode temp = this.head;
        while(null!=temp.next){
            temp=temp.next;
        }
        temp.next=newNode;

        this.length++;
    }

    int getLength(){
        return this.length;
    }

    void print(){
        ListNode temp = this.head;
        while(null!=temp){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    //head -->1-> 2-> 3-> null
    //
    // null<-1 <- 2 <-3 <-- head
    private void reverse() {
         ListNode temp  = this.head;
         ListNode lastNode = null;
         while(null!=temp){
             ListNode current = temp.next;
             temp.next=lastNode;
             lastNode=temp;
             temp=current;
         }

         this.head=lastNode;
    }

    public static void main(String[] args) {

        SinglyLinkedList_Oct2025 list = new SinglyLinkedList_Oct2025();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        System.out.println(list.getLength());
        list.print();

        list.reverse();
        list.print();
    }
}
