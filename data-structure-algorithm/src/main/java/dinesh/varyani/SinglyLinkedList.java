package dinesh.varyani;

import java.util.List;

/**
 * --14 Represent a Singly Linked List in Java
 * --15 How to Implement a Singly Linked List in Java | Data Structures and Algorithms
 * --16 Create a Singly Linked List in Java (Animation)
 * --17 Create a Singly Linked List in Java (Implementation)
 * --18 Print elements of a Singly Linked List in Java (Animation)
 * --19 Print elements of a Singly Linked List in Java (Implementation)0
 * --20 Find length of a Singly Linked List in Java (Animation)
 * --21 Find length of a Singly Linked List in Java (Implementation)
 * --22 Insert node at the beginning of a Singly Linked List in Java (Animation)
 * --23 Insert node at the beginning of a Singly Linked List in Java (Implementation)
 * --24 Insert node at the end of a Singly Linked List in Java (Animation)
 * --25 Insert node at the end of a Singly Linked List in Java (Implementation)
 * --26 Insert a node in a Singly Linked List at a given position (Animation)
 * --27 Insert a node in a Singly Linked List at a given position (Implementation)
 * --28 Delete first node of a Singly Linked List in Java (Animation)
 * --29 Delete first node of a Singly Linked List in Java (Implementation)
 * --30 Delete last node of a Singly Linked List in Java (Animation)
 * --31 Delete last node of a Singly Linked List in Java (Implementation)
 * --32 Delete a node from a Singly Linked List at a given position (Animation)
 * --33 Delete a node from a Singly Linked List at a given position (Implementation)
 * -- 34 How to search an element in a Singly Linked List in Java ?
 * imp -- 35 Reverse a Singly Linked List in Java | Leetcode #206 | Data Structures & Algorithms
 * 36 How to find middle node in a Singly Linked List in Java? | Data Structures and Algorithms
 * 37 How to find nth node from the end of a Singly Linked List in Java?
 * 38 How to remove duplicate from sorted Singly Linked List in Java?
 * 39 How to insert a node in a sorted Singly Linked List in Java ?
 * 40 How to remove a given key from Singly Linked List in Java?
 * 41 How to detect a loop in a Singly Linked List in Java? (Animation)
 * 42 Detect a loop in a Singly Linked List in Java | Implementation
 * 43 How to find start of a loop in a Singly Linked List? (Animation)
 * 44 How to find start of a loop in a Singly Linked List? (Implementation)
 * 45 Why Floyd's Cycle Detection algorithm works?
 * 46 How to remove loop from a Singly Linked List? | Floyd Cycle Detection Algorithm | (Animation)
 * 47 How to remove loop from a Singly Linked List? | Floyd Cycle Detection Algorithm | (Implementation)
 * 48 Merge Two Sorted Lists | Animation | Leetcode #21 | Coding Interview Question
 * 49 Merge Two Sorted Lists | Implementation | Leetcode #21 | Coding Interview Question
 * 50 Add Two Numbers (Singly Linked Lists) | Animation | Leetcode #2 | Coding Interview Question
 */
public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertElements(){
        ListNode one = new ListNode(10);
        ListNode two = new ListNode(20);
        ListNode three = new ListNode(30);
        ListNode four = new ListNode(40);
        this.head=one;
        one.next=two;
        two.next=three;
        three.next=four;
    }

    public void printAllElements(){
        System.out.println("printing");
        ListNode temp = this.head;
        while(null!=temp){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public int getLength(){
        ListNode temp= this.head;
        int length=0;
        while(null!=temp){
            length++;
            temp=temp.next;
        }
        return length;
    }

    public void insertNodeAtBeginning(int data){
        ListNode newNode= new ListNode(data);
        newNode.next=this.head;
        this.head=newNode;
    }

    public void insertNodeAtEnd(int data){
        ListNode newNode= new ListNode(data);
        ListNode temp = this.head;
        while(null!=temp.next){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    public void insertNodeAt(int index, int data){
        ListNode newNode= new ListNode(data);
        ListNode temp= this.head;
        ListNode previousNode=null;
        int count=1;
        while(null!=temp){

            if(index ==1){
                newNode.next=temp;
                this.head=newNode;
                break;
            }else{
                if(count==index){
                    previousNode.next=newNode;
                    newNode.next=temp;
                    break;
                }
            }
            previousNode=temp;
            temp=temp.next;
            count++;
        }

    }

    public void delete(int index){


        if(index==1){
            this.head=this.head.next;
        }else{
            ListNode current=this.head;
            ListNode lastNode=null;
            int counter=1;
            while(null!=current){

                if(index==counter){
                    lastNode.next=current.next;
                    break;
                }

                lastNode=current;
                current=current.next;
                counter++;
            }

        }

    }

    public void deleteFirstNode(){
        this.head=this.head.next;
    }


    public void deleteLastNode(){
        ListNode temp = this.head;
        ListNode secondLastNode=null;
        while(null!=temp.next){
            secondLastNode=temp;
            temp=temp.next;
        }
        if(null!=secondLastNode)
        secondLastNode.next=null;
    }

    public boolean search(int data){
        ListNode current=this.head;

        while(null!=current){
            if(current.data==data){
                return true;
            }
            current=current.next;
        }

        return false;
    }

    private void reverse(){
        ListNode temp = this.head;
        ListNode lastNode=null;
        while(null!=temp){
            ListNode current = temp.next;
            temp.next=lastNode;
            lastNode=temp;
            temp=current;
        }

        this.head=lastNode;
    }


    public static void main(String[] args) {
        SinglyLinkedList linkedList=new SinglyLinkedList();
        linkedList.insertElements();
       // linkedList.printAllElements();
       // System.out.println(linkedList.getLength());

        linkedList.insertNodeAtBeginning(5);
        //linkedList.printAllElements();

        linkedList.insertNodeAtEnd(50);
        //linkedList.printAllElements();

        //5 10 20 30 40
        linkedList.insertNodeAt(6, 60);
        //linkedList.printAllElements();

        linkedList.deleteFirstNode();
       //linkedList.printAllElements();

        linkedList.deleteLastNode();
        //linkedList.printAllElements();

        linkedList.delete(10);
        linkedList.printAllElements();

        System.out.println(linkedList.search(10));
        System.out.println(linkedList.search(20));
        System.out.println(linkedList.search(50));
        System.out.println(linkedList.search(70));

        linkedList.reverse();
        linkedList.printAllElements();
    }
}
