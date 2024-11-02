package dinesh.varyani.linkedlist;

import java.util.HashSet;
import java.util.Set;

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
 * important -- 35 Reverse a Singly Linked List in Java | Leetcode #206 | Data Structures & Algorithms
 * 36 How to find middle node in a Singly Linked List in Java? | Data Structures and Algorithms
 * - check which node is considered as middle node 2nd or 3rd in 4 size linked list?
 * - use slow and fast pointer approach
 * 37 How to find nth node from the end of a Singly Linked List in Java?
 * -- take main and referencePointer, move referencePointer nth step ahead and move both till referenceponitet reaches null
 * -- and get the main node
 * 38 How to remove duplicate from sorted Singly Linked List in Java?
 * -- dinesh : if list is sorted then use pointers
 * -- if the list is not sorted then use unique Set
 * imp 39 How to insert a node in a sorted Singly Linked List in Java ?
 * --again use two pointer, previous pointer next will get the new value node
 * -- dinesh's solution not inserting at the beginning.
 * imp - 40 How to remove a given key from Singly Linked List in Java?
 * -- not inserting the begining
 * 41 How to detect a loop in a Singly Linked List in Java? (Animation)
 * imp--42 Detect a loop in a Singly Linked List in Java | Implementation
 * 43 How to find start of a loop in a Singly Linked List? (Animation)
 * imp--44 How to find start of a loop in a Singly Linked List? (Implementation)
 * 45 Why Floyd's Cycle Detection algorithm works?
 * 46 How to remove loop from a Singly Linked List? | Floyd Cycle Detection Algorithm | (Animation)
 * 47 imp--How to remove loop from a Singly Linked List? | Floyd Cycle Detection Algorithm | (Implementation)
 *  0-1-2-3-4-5-6-7-0 this cycle of code not working with dinesh's implementation
 * 48 Merge Two Sorted Lists | Animation | Leetcode #21 | Coding Interview Question
 * 49 Merge Two Sorted Lists | Implementation | Leetcode #21 | Coding Interview Question
 * -- dummy list pointer is important
 * imp--50 Add Two Numbers (Singly Linked Lists) | Animation | Leetcode #2 | Coding Interview Question
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

    public void insertElements() {
        ListNode one = new ListNode(10);
        ListNode two = new ListNode(20);
        ListNode three = new ListNode(30);
        ListNode four = new ListNode(40);
        this.head = one;
        one.next = two;
        two.next = three;
        three.next = four;
    }

    public void insertLoop() {
        ListNode zero = new ListNode(0);
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);
        ListNode seven = new ListNode(7);

        this.head = zero;
        zero.next = one;
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;

        six.next = seven;
        seven.next = zero;
    }

    public void printAllElements() {

        if (!detectLoop()) {
            System.out.println("printing");
            ListNode temp = this.head;
            while (null != temp) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

    }

    public int getLength() {
        ListNode temp = this.head;
        int length = 0;
        while (null != temp) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    public void insertNodeAtBeginning(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = this.head;
        this.head = newNode;
    }

    public void insertNodeAtEnd(int data) {
        ListNode newNode = new ListNode(data);
        ListNode temp = this.head;
        while (null != temp.next) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertNodeAt(int index, int data) {
        ListNode newNode = new ListNode(data);
        ListNode temp = this.head;
        ListNode previousNode = null;
        int count = 1;
        while (null != temp) {

            if (index == 1) {
                newNode.next = temp;
                this.head = newNode;
                break;
            } else {
                if (count == index) {
                    previousNode.next = newNode;
                    newNode.next = temp;
                    break;
                }
            }
            previousNode = temp;
            temp = temp.next;
            count++;
        }

    }

    public void delete(int index) {


        if (index == 1) {
            this.head = this.head.next;
        } else {
            ListNode current = this.head;
            ListNode lastNode = null;
            int counter = 1;
            while (null != current) {

                if (index == counter) {
                    lastNode.next = current.next;
                    break;
                }

                lastNode = current;
                current = current.next;
                counter++;
            }

        }

    }

    public void deleteFirstNode() {
        this.head = this.head.next;
    }

    public void deleteLastNode() {
        ListNode temp = this.head;
        ListNode secondLastNode = null;
        while (null != temp.next) {
            secondLastNode = temp;
            temp = temp.next;
        }
        if (null != secondLastNode)
            secondLastNode.next = null;
    }

    public boolean search(int data) {
        ListNode current = this.head;

        while (null != current) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    private void reverse() {
        ListNode temp = this.head;
        ListNode lastNode = null;
        while (null != temp) {
            ListNode current = temp.next;
            temp.next = lastNode;
            lastNode = temp;
            temp = current;
        }

        this.head = lastNode;
    }


    //18 8 1 11
    //idea is use slow and fast pointer
    private int findMiddleNode() {
        if (this.head == null) {
            return -1;
        }

        ListNode temp = this.head;
        ListNode slow = temp;//11
        ListNode fast = temp;//11
        while (fast != null && fast.next != null) {
            slow = slow.next; //1
            fast = fast.next.next;//11
        }
        return slow.data;
    }


    //10 8 1 11 15
    //n=2
    private int findNthNodeFromEnd(int n) {
        ListNode temp = this.head;
        ListNode main = temp;
        ListNode referencePointer = temp;
        int count = 0;
        while (count < n) {

            if (null == referencePointer) {
                return -1;
            }
            referencePointer = referencePointer.next;
            count++;
        }

        while (referencePointer != null) {
            main = main.next;
            referencePointer = referencePointer.next;
        }

        return main.data;
    }


    //this is my implematation
    private void removeDuplicate() {
        ListNode current = this.head;
        Set<Integer> unique = new HashSet<>();
        ListNode previous = null;

        while (null != current) {

            int data = current.data;
            if (!unique.add(data)) {
                previous.next = current.next;
                current = current.next;
                continue;
            }

            previous = current;
            current = current.next;
        }
    }


    public void removeDuplicateInSortedListDineshImpl() {
        ListNode current = this.head;
        while (null != current && null != current.next) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    //not inserting at the beginning
    public void insertNodeInSortedListDineshImpl(int data) {
        ListNode current = this.head;
        ListNode temp = null;

        while (null != current && current.data < data) {
            temp = current;
            current = current.next;
        }

        ListNode newNode = new ListNode(data);
        temp.next = newNode;
        newNode.next = current;
    }


    //working solution
    public void insertSortedNode(int data) {


        ListNode new_node = new ListNode(data);

        ListNode current = head;
        ListNode temp = null;

        if (current.data > new_node.data) {

            new_node.next = current;
            head = new_node;

        } else {
            while (current != null && current.data < new_node.data) {

                temp = current;
                current = current.next;


            }


            new_node.next = current;

            temp.next = new_node;
        }


    }

    //not inserting at the end use insertSortedNode
    public void insertNodeInSortedList(int data) {
        ListNode newNode = new ListNode(data);
        ListNode current = this.head;
        while (null != current && null != current.next) {

            if (current.data < data && current.next.data > data) {
                newNode.next = current.next;
                current.next = newNode;
                break;
            } else if (current.data > data) {
                newNode.next = current;
                this.head = newNode;
                break;
            }

            current = current.next;
        }
    }

    //notr emoving from first
    public void remove(int data) {
        ListNode current = this.head;
        ListNode previous = null;
        while (null != current) {
            if (current.data == data && previous != null) {
                previous.next = current.next;
                break;
            } else {
                previous = current;
                current = current.next;
            }
        }
    }

    public int getStartOfLoop() {
        ListNode slow = this.head;
        ListNode fast = this.head;
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            System.out.println("Slow=" + slow.data + ", Fast=" + fast.data);
            if (slow == fast) {

                ListNode current = this.head;
                while (current != slow) {
                    System.out.println("Slow=" + slow.data + ", Current=" + current.data);
                    current = current.next;
                    slow = slow.next;
                }

                return slow.data;
            }

        }
        return -1;
    }

    public void removeLoop() {
        ListNode slow = this.head;
        ListNode fast = this.head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                System.out.println("loop detected in linked list,now removing loop");
                ListNode current = this.head;
                while(current.next!=slow.next){
                    current=current.next;
                    slow=slow.next;
                }
                current.next=null;// removing loop
            }
        }
    }

    public boolean detectLoop() {
        ListNode slow = this.head;
        ListNode fast = this.head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                System.out.println("loop detected");
                return true;
            }
        }
        return false;
    }


    public void mergeTwoSortedList(){

        ListNode a1=new ListNode(1);
        ListNode a3=new ListNode(3);
        ListNode a5=new ListNode(5);
        ListNode a7=new ListNode(7);
        ListNode a9=new ListNode(9);
        a1.next=a3;
        a3.next=a5;
        a5.next=a7;
        a7.next=a9;

        ListNode b2=new ListNode(2);
        ListNode b4=new ListNode(4);
        ListNode b6=new ListNode(6);
        ListNode b8=new ListNode(8);
        ListNode b10=new ListNode(10);
        b2.next=b4;
        b4.next=b6;
        b6.next=b8;
        b8.next=b10;



        ListNode dummy = new ListNode(0);
        ListNode temp=dummy;
        while(a1!=null && b2!=null){
            if(a1.data <= b2.data){
                temp.next=a1;
                a1=a1.next;
            }else{
                temp.next=b2;
                b2=b2.next;
            }

            temp=temp.next;
        }

        if(a1==null){
            temp.next=b2;
        }else{
            temp.next=a1;
        }

        this.head=dummy;
    }


    /**
     * 947
     *  65
     * ---
     * 1012
     * ---
     *
     */
    public void add(){
        ListNode a = new ListNode(7);
        ListNode a1 = new ListNode(4);
        ListNode a2 = new ListNode(9);
        a.next=a1;
        a1.next=a2;

        ListNode b = new ListNode(5);
        ListNode b1 = new ListNode(6);
        b.next=b1;

        ListNode result = new ListNode(0); //dummy element is creted and hence return  result.next
        int carry=0;
        ListNode dummy=result; //pointer is need

        while(a!=null || b!=null){

            int x = a!=null?a.data:0;
            int y = null!=b? b.data: 0;
            int sum=carry+x+y;
            carry = sum/10;
            ListNode newNode = new ListNode(sum%10);
            dummy.next=newNode;
            dummy=newNode;
            if(a!=null) a= a.next;
            if(b!=null) b=b.next;
        }

        if(carry>0){
            dummy.next=new ListNode(carry); //imp condition.
        }

        this.head=result.next; //imp condition
    }

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        //linkedList.insertElements();
        // linkedList.printAllElements();
        // System.out.println(linkedList.getLength());

        //linkedList.insertNodeAtBeginning(5);
        //linkedList.printAllElements();

        // linkedList.insertNodeAtEnd(50);
        //linkedList.printAllElements();

        //5 10 20 30 40
        //linkedList.insertNodeAt(6, 60);
        //linkedList.printAllElements();

        // linkedList.deleteFirstNode();
        //linkedList.printAllElements();

        // linkedList.deleteLastNode();
        //linkedList.printAllElements();

        // linkedList.delete(10);
        //linkedList.printAllElements();

        // System.out.println(linkedList.search(10));
        // System.out.println(linkedList.search(20));
        //  System.out.println(linkedList.search(50));
        //  System.out.println(linkedList.search(70));

        //linkedList.reverse();
        //linkedList.delete(3);
        //linkedList.printAllElements();

        //System.out.println("Middle:" + linkedList.findMiddleNode());

        //System.out.println("nth from end is:" + linkedList.findNthNodeFromEnd(10));

        // linkedList.insertElements();
        // linkedList.insertNodeAt(1, 10);
        // linkedList.insertNodeAt(3, 20);
        // linkedList.insertNodeAtEnd(40);
        // linkedList.printAllElements();

        // linkedList.removeDuplicateInSortedListDineshImpl();
        //  linkedList.printAllElements();

        // linkedList.insertSortedNode(-1);
        //linkedList.printAllElements();

        //linkedList.remove(-1);
        //linkedList.printAllElements();

       // linkedList.insertLoop();
        //linkedList.printAllElements();
       // System.out.println(linkedList.getStartOfLoop());

      //  linkedList.removeLoop();
      //  linkedList.printAllElements();

        //linkedList.mergeTwoSortedList();

        linkedList.add();
        linkedList.printAllElements();
    }
}
