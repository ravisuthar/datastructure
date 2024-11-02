package dinesh.varyani.linkedlist;

public class CircularSinglyLinkedList {

    private ListNode last;
    private int length;

    private static class ListNode {//public
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;

            
        }
    }

    public boolean isEmpty() {
        return null == last;
    }

    public int getLength() {
        return this.length;
    }

    public void insertDummyData() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(2);
        ListNode four = new ListNode(4);

        one.next = two;
        this.length++;

        two.next = three;
        this.length++;

        three.next = four;
        this.length++;


        four.next = one;
        this.length++;

        this.last = four;
    }

    public void insertTwoDummyData() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);

        one.next = two;
        this.length++;

        two.next = one;
        this.length++;

        this.last = two;
    }

    //good to see the implementation
    public void print() {
        if (isEmpty()) {
            System.out.println("null");
            return;
        }

        ListNode first = this.last.next;
        while (first != this.last) {
            System.out.println(first.data);
            first = first.next;
        }

        System.out.println(last.data);
    }

    public void insertFirst(int data) {

        ListNode first = new ListNode(data);
        if (isEmpty()) {
            first.next = first;
            this.last = first;
        } else {
            first.next = this.last.next;
            this.last.next = first;
        }
        this.length++;
    }

    public void insertLast(int data) {
        ListNode last = new ListNode(data);
        if (isEmpty()) {
            last.next = last;
            this.last = last;
        } else {
            last.next = this.last.next;
            this.last.next = last;
            this.last = last;
        }
        this.length++;
    }

    public void removeFirst() {


        if (getLength() == 1) {
            this.last = null;
        } else {
            ListNode first = this.last.next;
            ListNode second = first.next;

            this.last.next = second;
            first = null;
        }
    }

    public void removeLast(){
        if(getLength()==1){
            ListNode e=this.last;
            this.last=null;
            e=null;
        }else{
            ListNode first = this.last.next;
            ListNode beforeLast=null;
            while(first!=this.last){
                beforeLast=first;
                first=first.next;
            }

            beforeLast.next=this.last.next;
            this.last.next=null;
            this.last=beforeLast;
        }
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();

        //list.insertTwoDummyData();
        list.insertFirst(10);
       // list.insertLast(20);
        list.print();

        System.out.println("remove first");
       // list.removeFirst();
        //list.print();

        System.out.println("remove last");
        list.removeLast();
        list.print();
    }
}
