package designpattern;

public class SingletonStaticBlockInitialization {
    private static final SingletonStaticBlockInitialization instance;

    static{
        try {
            instance = new SingletonStaticBlockInitialization();
        }catch (Exception e){
            throw new RuntimeException("failed to load");
        }
    }

    private SingletonStaticBlockInitialization(){

    }

    public static SingletonStaticBlockInitialization getInstance(){
        return instance;
    }
}
