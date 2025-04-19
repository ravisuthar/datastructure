package java8;

public class Sequence {

    static{
        System.out.println("static block");
    }

    {
        System.out.println("initializer block");
    }

    Sequence(){
        System.out.println("construct");
    }

    public static void main(String[] args) {
        new Sequence();
    }
}
