package cracking.the.coding.interview.stack;

public class MyQueueUsingStack {

    java.util.Stack stack1 = new java.util.Stack();
    java.util.Stack stack2 = new java.util.Stack();

    // 3
    // 2 2
    // 1 3
    public void enqueue(int data) {
        stack1.push(data);
    }

    public int dequeue() {

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        int value= (int) stack2.pop();

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        return value;
    }

    public static void main(String[] args) {
        MyQueueUsingStack queue = new MyQueueUsingStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }

}
