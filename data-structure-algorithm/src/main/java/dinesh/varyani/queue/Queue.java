package dinesh.varyani.queue;


import java.util.NoSuchElementException;

public class Queue<T> {

    private ListNode<T> front;
    private ListNode<T> rear;
    private int length;

    public Queue() {
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    private static class ListNode<T> {
        private final T data;
        private ListNode<T> next;

        public ListNode(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public int getLength() {
        return this.length;
    }

    public void enqueue(T data) {
        ListNode<T> newNode = new ListNode<>(data);
        if (isEmpty()) { //isEmpty
            this.rear = newNode;
            this.front = newNode;
        } else {
            this.rear.next = newNode;
            this.rear = newNode;
        }
        this.length++;
    }

    public T dequeue() {
        T value =null;
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        } else if (getLength() == 1) {
            value=(T)this.front.data;
            this.rear = null;
            this.front = null;
        } else {
            value=(T)this.front.data;
            ListNode<T> next = this.front.next;
            this.front.next = null;
            this.front = next;
        }
        this.length--;

        return value;
    }


    public void print() {
        ListNode<T> temp = this.front;
        while (null != temp) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println("Front: " + (null != this.front ? this.front.data : null) + " Rear: " + (null != this.rear ? this.rear.data : null));
    }

    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.print();

        queue.dequeue();
        queue.print();

        queue.dequeue();
        queue.print();

        queue.dequeue();
        queue.print();

        queue.enqueue(1);
        queue.print();

        queue.enqueue(10);
        queue.print();

        queue.enqueue(100);
        queue.print();
    }


}
