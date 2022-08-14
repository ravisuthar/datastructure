package collections;

public class SinglyLinkedList {
    ListNode head;

    public void insertFirst(int value) {
        ListNode newHead = new ListNode(value);
        newHead.next = this.head;
        this.head = newHead;
    }

    public void deleteFirst() {
        this.head = this.head.next;
    }

    public void deleteLast() {
        ListNode previous = null;
        ListNode current = this.head;
        while (null != current.next) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
    }

    public boolean search(int value) {

        ListNode current = this.head;
        while (null != current) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    // null <- 3 <- 6  <- 7 <- 9
    public ListNode reverse() {
        ListNode previous = null;
        ListNode current = this.head;
        while (null != current) {
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }

    public int findNthFromEnd(int position) {
        ListNode previous = this.head;
        ListNode main = this.head;
        int count = 0;
        while (count++ < position && null!=main.next) {
            main = main.next;
        }

        while (null != main) {
            main = main.next;
            previous = previous.next;
        }

        return previous!=null ? previous.data : -1;
    }

    public int getMiddle() {
        ListNode slow = this.head;
        ListNode fast = this.head;
        while (null != fast && null != fast.next && null != fast.next.next) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }

    public void print(ListNode node) {
        ListNode current = node;
        while (current != null) {
            System.out.print(" " + current.data);
            current = current.next;
        }
        System.out.println(" null");
    }

    public void delete(int position) {

        if (1 == position) {
            this.head = this.head.next;
            return;
        } else {
            int count = 1;
            ListNode previous = null;
            ListNode current = this.head;
            while (null != current) {
                if (count++ == position && previous != null) {
                    previous.next = current.next;
                } else {
                    previous = current;
                    current = current.next;
                }
            }
        }
    }

    //Must watch once
    public void insertLast(int value) {
        ListNode lastNode = new ListNode(value);

        if (this.head == null) {
            this.head = lastNode;
            return;
        }

        ListNode current = this.head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = lastNode;
    }


    //not inserting at beginning
    //https://www.youtube.com/watch?v=D0sFHueV30U&list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d&index=26&ab_channel=DineshVaryani
    public void insertAtPosition(int value, int position) {

        int count = 1;
        ListNode current = this.head;
        while (null != current) {
            if (++count == position) {
                ListNode temp = current.next;
                ListNode newNode = new ListNode(value);
                current.next = newNode;
                newNode.next = temp;
            }
            current = current.next;
        }
    }

    //good to test.
    //https://www.youtube.com/watch?v=D0sFHueV30U&list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d&index=26&ab_channel=DineshVaryani
    public void insert(int value, int position) {
        ListNode node = new ListNode(value);
        if (position == 1) {
            node.next = this.head;
            this.head = node;
        } else {
            int count = 1;
            ListNode previous = this.head;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }

            if (previous == null) {
                return;
            }

            ListNode temp = previous.next;
            previous.next = node;
            node.next = temp;
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

    public void print() {
        ListNode current = head;
        while (current != null) {
            System.out.print(" " + current.data);
            current = current.next;
        }
        System.out.println(" null");

        /*do{
            System.out.println(current.data);
            current=current.next;
        }while(current!=null);*/

    }

    public int getLength() {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void remove(int value){
        ListNode current = this.head;
        while(null!=current && current.data < value){

            current=current.next;
        }
    }

    // 1 3 8
    public void insertInSortedList(int value){
        ListNode insert = new ListNode(value);
        ListNode current = this.head;
        ListNode previous = null;
        while(null!=current && value > current.data){
            previous=current;
            current=current.next;
        }

        if(null!=previous){
            previous.next=insert;
            insert.next=current;
        }
    }

    public void removeDuplicateFromSortedList(){
        ListNode main = this.head;
        while(null!= main && null!=main.next){
            if(main.data == main.next.data){
                main.next=  main.next.next;
            }else{
                main=main.next;
            }
        }
    }

    public void getPopulatedSortedList() {
        this.head = new ListNode(1);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(10);
        ListNode fifth = new ListNode(15);

        head.next = second;// 1->1
        second.next = third;//1->1->2
        third.next = fourth;//1->1->2->3
        fourth.next = fifth;//1->1->2->3->3
    }

    public void getPopulatedList() {
        this.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        head.next = second;// 10->1
        second.next = third;//10->1->8
        third.next = fourth;//10->1->8->11
    }
}
