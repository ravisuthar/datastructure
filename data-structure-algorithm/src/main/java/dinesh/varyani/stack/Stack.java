package dinesh.varyani.stack;

//using linked list
public class Stack<T> {
    private ListNode<T> top;
    private int length;

    public Stack() {
        this.top = null;
        this.length = 0;
    }

    private static class ListNode<T> {
        private T data;
        private ListNode next;

        public ListNode(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(T data) {
        ListNode<T> newNode = new ListNode<>(data);
        newNode.next = this.top;
        this.top = newNode;
        this.length++;
    }

    public T peep() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        } else {
            return (T)this.top.data;
        }
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        } else if (getLength() == 1) {
            T value = (T)this.top.data;
            this.top = null;
            this.length--;
            return value;
        } else {
            ListNode next = this.top.next;
            T value = (T)this.top.data;
            this.top = next;
            this.length--;
            return value;
        }
    }

    public int getLength() {
        return this.length;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.isEmpty());
        System.out.println("length: " + stack.getLength());

        System.out.println(stack.peep());
        System.out.println(stack.pop());
        System.out.println(stack.peep());
        System.out.println("length: " + stack.getLength());

        System.out.println(stack.pop());
        System.out.println("length: " + stack.getLength());

        System.out.println(stack.pop());
        System.out.println("length: " + stack.getLength());

        System.out.println(stack.pop());
        System.out.println("length: " + stack.getLength());

        System.out.println(stack.pop());
        System.out.println("length: " + stack.getLength());

        System.out.println(stack.pop());
        System.out.println("length: " + stack.getLength());

    }

}
