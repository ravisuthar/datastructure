package java8;

import java.io.*;


class Bird implements Serializable {
    String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Animal implements  Externalizable{
    String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("writeExternal");
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("readExternal");
    }
}

public class SerializationTest {

    public static void main(String[] args) throws Exception {

        FileOutputStream fos = new FileOutputStream("test.bird");
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject( new Bird("Parrot"));
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream("test.bird");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Bird parrot = (Bird)ois.readObject();
        System.out.println(parrot.getName());
        ois.close();

        FileOutputStream fos2 = new FileOutputStream("animal.bird");
        ObjectOutputStream oos2= new ObjectOutputStream(fos2);
        oos2.writeObject( new Animal("elephant"));
        oos2.flush();
        oos2.close();

        FileInputStream fis2 = new FileInputStream("animal.bird");
        ObjectInputStream ois2 = new ObjectInputStream(fis2);
        Animal elephant = (Animal)ois2.readObject();
        System.out.println(elephant.getName());
        ois2.close();
    }

}
