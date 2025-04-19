package java8;

public class Ambiguity {

    public void method(Object o){

    }

    public void method(String o){

    }

    public void method(Integer o){

    }


    public static void main(String[] args) {
        Ambiguity a = new Ambiguity();
        //a.method(null); // compilation error at calling
    }
}
