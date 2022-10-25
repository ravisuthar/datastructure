package dinesh.varyani;

public class DoublyLinkedList {

    private ListNode head;
    private ListNode tail;
    private int length;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }


    private class ListNode {//public
        int data;
        ListNode next;
        ListNode previous;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    public boolean isEmpty() {
        return this.head == null && this.tail == null;
    }

    public int getLength() {
        int count = 0;
        ListNode temp = this.head;
        while (null != temp) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void insertDummyData() {

        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);

        this.head = one;
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = null;

        this.tail = four;
        four.previous = three;
        three.previous = two;
        two.previous = one;
        one.previous = null;

        this.length = 4;
    }

    public void printForward() {
        ListNode temp = this.head;
        while (null != temp) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void printBackward() {
        ListNode temp = this.tail;
        while (null != temp) {
            System.out.println(temp.data);
            temp = temp.previous;
        }
        System.out.println("null");
    }

    public void insertAtBeginning(int data) {
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            this.tail = newNode;
            this.head = newNode;
        } else {
            newNode.next = this.head;
            head.previous = newNode;
            this.head = newNode;
        }
    }

    public void insertAtEnd(int data) {
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.previous = this.tail;
            this.tail.next = newNode;
            this.tail = newNode;
        }

    }


    public void deleteFirstNode() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        } else if (getLength() == 1) {
            this.head = null;
            this.tail = null;
        } else {
            ListNode next = this.head.next;
            next.previous = null;
            this.head = next;
        }
    }


    public void deleteLastNode() {

        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        } else if (getLength() == 1) {
            this.head = null;
            this.tail = null;
        } else {
            ListNode previous = this.tail.previous;
            previous.next = null;
            this.tail = previous;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        // doublyLinkedList.insertDummyData();
        //  doublyLinkedList.insertAtBeginning(0);
        //  doublyLinkedList.insertAtEnd(5);
        //doublyLinkedList.printForward();
        //doublyLinkedList.printBackward();

        doublyLinkedList.deleteLastNode();
        doublyLinkedList.printForward();
        doublyLinkedList.printBackward();

    }
}
