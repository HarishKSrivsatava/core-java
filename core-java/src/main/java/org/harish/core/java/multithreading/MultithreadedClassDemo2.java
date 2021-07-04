package org.harish.core.java.multithreading;

public class MultithreadedClassDemo2 implements Runnable{
	
	public void run(){
		System.out.println("Run method");
	}
	
	public static void main(String[] args) {
		MultithreadedClassDemo t1 = new MultithreadedClassDemo();
		t1.start();
		int i = 0;
		while(i < 100){
			System.out.println("Main method");
			i ++;
		}
	}
}
