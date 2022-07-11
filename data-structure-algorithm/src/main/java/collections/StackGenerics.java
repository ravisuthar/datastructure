package collections;

import java.util.ArrayList;
import java.util.List;

public class StackGenerics<T> {

    private int top;
    private final List<T> storage;
    int size;

    public StackGenerics(int size) {
        this.top = -1;
        storage = new ArrayList<>(size);
        this.size=size;
    }

    public void push(T element) {
        if (isFull()) throw new RuntimeException("Full");
        storage.add(++this.top, element);
    }

    public T pop() {
        if (isEmpty()) throw new RuntimeException("Empty");
        T element = this.storage.get(top);
        storage.remove(this.top--);
        return element;
    }

    public T peep() {
        if (isEmpty()) throw new RuntimeException("Empty");
        return this.storage.get(top);
    }

    private boolean isFull() {
        return top == this.size-1;
    }

    private boolean isEmpty() {
        return top == -1;
    }

    private void print(){
        System.out.println(this.storage);
    }

    public static void main(String[] args) {

        StackGenerics<String> stack = new StackGenerics<>(3);
        //stack.pop();
        //stack.peep();
        stack.push("Jay");
        stack.print();
        stack.push("Shree");
        stack.print();
        stack.push("Ram");
        stack.print();
        System.out.println(stack.pop());
        System.out.println(stack.peep());
        stack.print();
        stack.push("Hanuman");
        stack.print();
        System.out.println(stack.peep());
    }
}
