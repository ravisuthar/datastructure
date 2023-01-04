package java8;


class Papa {
   public String getName() {
        return "Papa";
    }
}

interface Chaha {
    default String getName() {
        return "Chaha";
    }
}
interface Chachi{
    default String getName() {
        return "Chachi";
    }
}
class Beta extends Papa implements Chaha {

    public static void main(String[] args) {
        System.out.println((new Beta()).getName());
    }
}

class Cousin implements Chaha,Chachi{

    @Override
    public String getName() {
        return Chaha.super.getName();
    }
}

public class TestOverload {
    public static void main(String[] args) {
        System.out.println(new Beta().getName());
    }
}

class DefaultMethodClass {
    public void defaultMethod()
    {
        System.out.println("DefaultMethodClass.defaultMethod()");
    }
}

interface DefaultMethodInterface {
    public default void defaultMethod()
    {
        System.out.println("DefaultMethodInterface.defaultMethod()");
    }
}
//https://stackoverflow.com/questions/51520338/significance-of-inheriting-method-from-superclass-instead-of-default-method-from

class DefaultMethodClassInterfaceChild extends DefaultMethodClass implements DefaultMethodInterface
{
    public static void main(String[] args) {
        (new DefaultMethodClassInterfaceChild()).defaultMethod();
    }
}
