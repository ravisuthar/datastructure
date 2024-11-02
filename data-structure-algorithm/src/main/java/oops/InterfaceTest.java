package oops;

interface A{

    default void print(){
        System.out.println("A");
    }
}

interface B{
    default void print(){
        System.out.println("B");
    }
}
public class InterfaceTest implements A,B{

    @Override
    public void print() {
        B.super.print();
    }

    public static void main(String[] args) {
        InterfaceTest test = new InterfaceTest();
        test.print();
    }
}
