package morgonstanely;

//early initialization
//static block
//lazy
//synchronized
//synchronized double null check
//Bill pugh
//Enum
public final class Singleton {


    public synchronized static Singleton getInstance() {
        return Helper.INSTANCE;
    }

    private static class Helper{
        private static Singleton INSTANCE = new Singleton();
    }
}
