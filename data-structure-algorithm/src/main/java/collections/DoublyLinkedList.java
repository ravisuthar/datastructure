package collections;

public class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public int getLength() {
        return this.length;
    }

    private static class ListNode {
        private int data;
        private ListNode previous;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    //How to print elements of a Doubly Linked List in Java ?
    public void displyForward(){
        ListNode temp = this.head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void displyBackword(){
        ListNode temp = this.tail;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.previous;
        }
        System.out.println("null");
    }

    //54 How to insert node at the beginning of a Doubly Linked List in Java ?
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            this.tail=newNode;
        }else{
            this.tail=newNode;
        }
        newNode.next=null;
        this.head=newNode;
    }

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(null==this.head){
            this.head=newNode;
        } else {
            this.tail.next=newNode;
        }
        newNode.previous=tail;
        this.tail = newNode;
        length++;
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.displyBackword();
    }
}
