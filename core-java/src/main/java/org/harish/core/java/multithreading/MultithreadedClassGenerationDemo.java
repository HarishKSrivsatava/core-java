package org.harish.core.java.multithreading;

import java.lang.Thread;
/**
 * 
 * @author Harish Kumar
 * Creation of a multithreaded class.
 * There are two ways :
 * (1) Extending Thread class
 * (2) Implementating  Runnable interface and overriding run() method
 */
public class MultithreadedClassGenerationDemo extends Thread{
	
	public void run() {
		for(int i = 0; i <= 20; i++)
			System.out.println("Child Thread");
	}
	public static void main(String[] args) {
		MultithreadedClassGenerationDemo thread = new MultithreadedClassGenerationDemo();
		thread.start();
		for(int i = 0; i <= 20; i++)
			System.out.println("Main thread");
		
	}

}
