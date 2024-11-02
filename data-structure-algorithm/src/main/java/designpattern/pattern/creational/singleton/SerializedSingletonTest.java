package designpattern.pattern.creational.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializedSingletonTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		SerializedSingleton one=SerializedSingleton.getInstance();
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("obj.ser")));
		oos.writeObject(one);
		oos.close();
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("obj.ser")));
		SerializedSingleton two =(SerializedSingleton)ois.readObject();
		ois.close();
		
		System.out.println(one.hashCode());
		System.out.println(two.hashCode());
		
	}
}
