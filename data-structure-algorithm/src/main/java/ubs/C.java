package ubs;

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
public class C implements A, B{
    public static void main(String[] args) {
        new C().print();
    }
    @Override
    public void print() {
        A.super.print();
    }
}
