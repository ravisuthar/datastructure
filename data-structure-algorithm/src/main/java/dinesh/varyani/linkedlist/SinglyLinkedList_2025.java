package dinesh.varyani.linkedlist;

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
 * 0-1-2-3-4-5-6-7-0 this cycle of code not working with dinesh's implementation
 * 48 Merge Two Sorted Lists | Animation | Leetcode #21 | Coding Interview Question
 * 49 Merge Two Sorted Lists | Implementation | Leetcode #21 | Coding Interview Question
 * -- dummy list pointer is important
 * imp--50 Add Two Numbers (Singly Linked Lists) | Animation | Leetcode #2 | Coding Interview Question
 */
public class SinglyLinkedList_2025 {

    //14 Represent a Singly Linked List in Java
    //15 How to Implement a Singly Linked List in Java | Data Structures and Algorithms
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        this.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
    }

    private void print() {
        ListNode temp = head;
        while (null != temp) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.print("\n");
    }

    private int length() {
        int length = 0;
        while (null != head) {
            length++;
            this.head = head.next;
        }
        return length;
    }

    private void addBeginning(int data) {
        ListNode first = new ListNode(data);
        first.next = this.head;
        this.head = first;
    }

    private void addLast(int data) {
        ListNode last = new ListNode(data);
        if (null == this.head) {
            this.head = last;
            return;
        }
        ListNode temp = this.head;
        while (null != temp.next) {
            temp = temp.next;
        }
        temp.next = last;
    }

    private void deleteFirst() {
        ListNode first = this.head;
        if (null != first) {
            ListNode second = first.next;
            first.next = null;
            this.head = second;
        }
    }

    private void deleteLast() {
        ListNode temp = this.head;

        if (null != temp && null != temp.next) {
            while (null != temp.next.next) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    private boolean search(int data) {
        ListNode temp = this.head;
        while(null!=temp){
            if(data == temp.data){
                return true;
            }
            temp = temp.next;
        }

        return false;
    }


    // 1 => 2 => 3 => 4 => null
    public ListNode reverse(){

        ListNode current = this.head;
        ListNode previous = null;
        ListNode next = null;

        while(null != current){
            next= current.next;
            current.next = previous;
            previous = current; //increment previous pointer
            current = next; //increment current pointer
        }

        this.head = previous;
        return previous;
    }

    public ListNode findMiddle(){
        ListNode slow = this.head;
        ListNode fast = this.head;
        while(null!=fast && null!=fast.next){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode fetchElementFromLast(int n){

        ListNode slow = this.head;
        ListNode fast = this.head;

        /*int  count =0;
        while(count < n){
            fast=fast.next;
        }*/

        for (int i = 0; i < n; i++) {
            fast  = fast.next;
        }

        while(null !=fast){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }


    //1 1 2 3 3
    public void removeDuplicatesFromSortedLinkedList(){

        ListNode current  = this.head;

        while(null!=current && null!=current.next){

            if(current.data == current.next.data){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }

    }

    public void addLoop() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        this.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = third;
    }




    public boolean detectLoop(){

        ListNode slow = this.head;
        ListNode fast = this.head;

        while(null!=slow && null!=fast){
            slow= slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    //Floyd Cycle detection algorithm.
    public int delectStartingPointOfLoop(){
        ListNode slow = this.head;
        ListNode fast = this.head;

        while(null!=slow && null!=fast){
            slow= slow.next;
            fast = fast.next.next;
            if(slow == fast){

                ListNode temp = this.head;
                while(temp !=  slow){  // move head and slow pointer by 1 step until they don't come to same point,the same point would be start of loop.
                    temp = temp.next;
                    slow = slow.next;
                }
                return slow.data;
            }
        }
        return -1;
    }

    public void removeLoop(){
        ListNode slow = this.head;
        ListNode fast = this.head;

        while(null!=slow && null!=fast){
            slow= slow.next;
            fast = fast.next.next;
            if(slow == fast){
                ListNode temp = this.head;
                while(temp.next !=  slow.next){  // move head and slow pointer by 1 step until they don't come to same point,the same point would be start of loop.
                    temp = temp.next;
                    slow = slow.next;
                }
                 slow.next = null;
                break; //once loop break, we need to come out of the loop.
            }
        }

    }

    //list 1 = 1 => 3 => 5 => 9 => 11 =>13
    //list 2 = 2 => 4 => 6 => 10
    //Merge =  0 => 1 => 2
    //                   D
    //              a
    //              b


    public void mergeSorted(){

        ListNode a = new ListNode(7);
        ListNode second = new ListNode(4);
        ListNode third = new ListNode(9);
        a.next = second;
        second.next = third;
        third.next = null;

        ListNode b = new ListNode(5);
        ListNode second1 = new ListNode(6);
        b.next = second1;
        second1.next = null;

        // 9 4 7
        //   6 5
        //--------
        //  1 0  1 2

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy; //taking a pointer is important.
        int carry = 0;

        while(a!=null || b!=null){
            int x = a!=null ? a.data : 0;
            int y = b!=null ? b.data : 0;
            int sum = x + y + carry;
            int value = sum %10;
            carry = sum /10;
            tail.next = new ListNode(value);
            tail = tail.next;
            if(a!=null) a= a.next;
            if(b!=null) b=b.next;
        }


        ListNode temp = dummy.next;
        while (null != temp) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.print("\n");
    }

        public ListNode mergeTwoSortedLinkedList(){

        ListNode a = this.getList1();
        ListNode b = this.getList2();

        ListNode dummy = new ListNode(0);
        ListNode dummyPointer = dummy;

        while(a != null && b != null){

            if(a.data <= b.data){
                dummyPointer.next = a;
                a = a.next;
            }else{
                dummyPointer.next = b;
                b = b.next;
            }

            dummyPointer = dummyPointer.next; //this is important to add a or b s element in tail.
        }

        if(b == null){
            dummyPointer.next = a;
        }

        if(a == null){
            dummyPointer.next = b;
        }

        ListNode temp = dummy.next;
        while (null != temp) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.print("\n");

        return dummy.next;
    }

    private ListNode getList1(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(5);
        ListNode fourth = new ListNode(9);

//        this.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;
                return first;
     }

    private ListNode getList2(){
        ListNode first = new ListNode(2);
        ListNode second = new ListNode(4);
        ListNode third = new ListNode(6);
        ListNode fourth = new ListNode(10);

//        this.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;
        return first;
    }


    public static void main(String[] args) {

        SinglyLinkedList_2025 s2 = new SinglyLinkedList_2025();
        s2.mergeSorted();


        s2.mergeTwoSortedLinkedList();
        s2.print();






        SinglyLinkedList_2025 s1 = new SinglyLinkedList_2025();
        s1.addLoop();
        System.out.println("Has loop: "+ s1.detectLoop());
        System.out.println("Starting point of loop = "+ s1.delectStartingPointOfLoop());
        s1.removeLoop();
        System.out.println("Has loop: "+ s1.detectLoop());
        System.out.println("Starting point of loop = "+ s1.delectStartingPointOfLoop());




        SinglyLinkedList_2025 s = new SinglyLinkedList_2025();
        s.add();
        System.out.println("Has loop: "+ s.detectLoop());
        s.print();
        //System.out.println(s.length());
        s.addBeginning(0);
        s.print();
        s.addLast(10);
        s.print();
        s.deleteFirst();
        s.print();
        s.deleteLast();
        s.print();

        System.out.println(s.search(2));
        ListNode temp = s.reverse();
        while(null!=temp){
            System.out.print(temp.data+" ");
            temp =temp.next;
        }

        System.out.println("-----");

        s.addLast(100);
        s.print();
        ListNode middle = s.findMiddle();
        System.out.println("middle: "+middle.data);


        ListNode listNode = s.fetchElementFromLast(2);
        System.out.println("2nd from last: "+ listNode.data);

        s.addLast(100);
        s.addBeginning(4);
        s.print();

        System.out.println("remove duplicate from sorted linked list");
        s.removeDuplicatesFromSortedLinkedList();
        s.print();

    }

}
