package org.harish.core.java.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

class NewBook implements Serializable {
    String book = "Core Java";
    transient String bookId = "CJ001";
}

public class SerializationLab2 {

    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
	NewBook b = new NewBook();

	/**
	 * Serialization of the state of class Book
	 */
	String filePath = "C:\\Users\\Harish Kumar\\Desktop\\test\\harishk.txt";

	// FileOutputStream fos = new FileOutputStream(filePath);
	// ObjectOutputStream oos = new ObjectOutputStream(fos);
	// oos.writeObject(b);

	/**
	 * De-serialization of the state of class Book , stored in current
	 * location with file name "test.text"
	 */

	FileInputStream fis = new FileInputStream(filePath);
	ObjectInputStream ois = new ObjectInputStream(fis);
	NewBook readBook = (NewBook) ois.readObject();
	System.out.println("Book : " + readBook.book + " | Book Id: " + readBook.bookId);

    }

}
