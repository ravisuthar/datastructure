package designpattern;

//https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples#thread-safe-singleton
public class SingletonBillPugh {

    private SingletonBillPugh(){
    }

    public static SingletonBillPugh getInstance(){
        return Helper.instance;
    }

    //the inner class gets loaded only when it is called.
    private static class Helper{
        private static final SingletonBillPugh instance = new SingletonBillPugh();
        {
            System.out.println("Helper class instantiated");
        }
    }
}
