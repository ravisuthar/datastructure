package oops;


abstract  class AbstractA{
    public void print(){
        System.out.println("AbstractA");
    }
}

interface InterfaceB{
    default void print(){
        System.out.println("InterfaceB");
    }
}
public class Test extends AbstractA implements InterfaceB{

    public void print(){
        System.out.println("Test");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.print();
    }
}
