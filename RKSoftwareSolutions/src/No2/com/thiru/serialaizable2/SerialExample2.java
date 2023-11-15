package No2.com.thiru.serialaizable2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import No1.com.thiru.serialaizable1.Serial;



public class SerialExample2 {
	  public static void main(String[] args) {
	        Serial2 object = new Serial2("John", 30, 2, 1000);
	        String filename = "ser2.txt";

	        // Serialization
	        try {
	            FileOutputStream file = new FileOutputStream(filename);
	            ObjectOutputStream out = new ObjectOutputStream(file);

	            // Method for serialization of object
	            out.writeObject(object);

	            out.close();
	            file.close();

	            System.out.println("Object has been serialized.");
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }

	        // Deserialization
	        try {
	            FileInputStream file = new FileInputStream(filename);
	            ObjectInputStream in = new ObjectInputStream(file);

	            // Method for deserialization of the object
	            object = (Serial2) in.readObject();

	            in.close();
	            file.close();

	            System.out.println("Object has been deserialized\nData after Deserialization:");
	            System.out.println("name = " + object.name);
	            System.out.println("age = " + object.age);
	            System.out.println("a = " + object.a);
	            System.out.println("b = " + object.b);
	        } catch (IOException | ClassNotFoundException ex) {
	            ex.printStackTrace();
	        }
	    }
}