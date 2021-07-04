package org.harish.core.java.multithreading;

public class MultithreadedClassDemo extends Thread {
	
	@Override
	public void run(){
		System.out.println("run method");
	}
	
	public static void main(String[] args) {
		MultithreadedClassDemo t1 = new MultithreadedClassDemo();
		t1.start();
		int i =0;
		while(i < 100){
			System.out.println("main method");
			i ++;
		}
	}

}
