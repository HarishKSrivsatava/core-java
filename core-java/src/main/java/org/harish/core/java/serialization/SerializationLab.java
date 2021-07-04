package org.harish.core.java.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Book implements Serializable {
    String book = "Core Java";
    String bookId = "CJ001";
}

public class SerializationLab {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
	Book b = new Book();

	/**
	 * Serialization of the state of class Book
	 */
	String filePath = "C:\\Users\\Harish Kumar\\Desktop\\test\\harishk.txt";
	FileOutputStream fos = new FileOutputStream(filePath);
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(b);

	/**
	 * De-serialization of the state of class Book , stored in current
	 * location with file name "test.text"
	 */

	// FileInputStream fis = new FileInputStream(filePath);
	// ObjectInputStream ois = new ObjectInputStream(fis);
	// Book readBook = (Book) ois.readObject();
	// System.out.println("Book : " + readBook.book + " | Book Id: " +
	// readBook.bookId);

    }
}
