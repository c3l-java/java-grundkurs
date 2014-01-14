package se.coredev.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main
{
	public static void main(String[] args) throws Exception
	{
//		Animal dog = new Dog("Pablo", "Pablito");
		File file = new File("/Users/coredev/Desktop/dogs.data");
		
		FileInputStream in = new FileInputStream(file);
		ObjectInputStream objectIn = new ObjectInputStream(in);

		Dog dog = (Dog) objectIn.readObject();  
		System.out.println(dog.getName());
		System.out.println(dog.getNickname());
		
		objectIn.close();
		
//		FileOutputStream out = new FileOutputStream(file);
//		
//		ObjectOutputStream objectOut = new ObjectOutputStream(out);
//		objectOut.writeObject(dog);
//		objectOut.close();
	}
}
