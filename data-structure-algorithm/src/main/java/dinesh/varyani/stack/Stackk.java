package dinesh.varyani.stack;

import java.util.Arrays;

public class Stackk {
    int[] storage;
    int top;  //used to maintain index position.

    public Stackk(int size) {
        this.storage = new int[size];
        this.top = -1;
    }

    public void push(int element) {
        if (isFull()) throw new RuntimeException("Full");
        storage[++top] = element;
    }

    public int peep() {
        if (isEmpty()) throw new RuntimeException("Empty");
        return storage[top];
    }

    public int pop() {
        if (isEmpty()) throw new RuntimeException("Empty");
        int temp = storage[top];
        storage[top] = 0;
        top--;
        return temp;
    }

    private boolean isFull() {
        return this.top == storage.length-1;
    }

    private boolean isEmpty() {
        return this.top == -1;
    }

    public void print(){
        System.out.println(Arrays.toString(this.storage));
    }

    public static void main(String[] args) {
        Stackk stack = new Stackk(5);
        stack.print();
       // stack.pop();
      //  stack.peep();
        stack.push(11);
        stack.print();
        stack.push(12);
        stack.print();
        stack.push(13);
        stack.print();
        stack.push(14);
        stack.print();
        stack.push(15);
        stack.print();
        System.out.println(stack.pop());
        stack.peep();
        stack.push(16);
        stack.print();
        stack.peep();
        stack.push(17);
        stack.print();
    }
}
