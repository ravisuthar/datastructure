package designpattern;

import java.io.*;

public class SingletonSerialization {

    public static void main(String[] args) throws Exception {
        SingletonSerialization object = new SingletonSerialization();
        SingletonEagerInitialization instance = SingletonEagerInitialization.getInstance();
        System.out.println(instance);
        object.serialize(instance);
        SingletonEagerInitialization instance2 = object.deserialize();
        System.out.println(instance2);
    }

    private void serialize(SingletonEagerInitialization o) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("file.out")));
        oos.writeObject(o);
        oos.flush();
        oos.close();
    }

    private SingletonEagerInitialization deserialize() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("file.out")));
        var object = ois.readObject();
        ois.close();
        return (SingletonEagerInitialization) object;
    }
}
