package designpattern;

import java.lang.reflect.InvocationTargetException;

public class SingletonReflectionTest {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {

        SingletonEagerInitialization instance1 = SingletonEagerInitialization.getInstance();
        SingletonEagerInitialization instance2 = SingletonEagerInitialization.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);
        var constructors = SingletonEagerInitialization.class.getDeclaredConstructors();
        for(var cons: constructors){
            cons.setAccessible(true);
            SingletonEagerInitialization object= (SingletonEagerInitialization)cons.newInstance();
            System.out.println(object);
        }
    }
}
