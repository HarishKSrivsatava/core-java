package org.harish.core.java.multithreading;


class MyThreadTest implements Runnable{
	int i =10;
	
	public synchronized void increment(int value){
		i += value;
	}
	public void run(){
		long id = Thread.currentThread().getId();
	//	System.out.println("Thread Id : "+Thread.currentThread().getId());
		System.out.println("i = "+ i +" with thread : "+ id);
		increment(10);
		System.out.println("i = "+ i +" with thread : "+ id);
	}
}
public class ThreadLab {

	public static void main(String[] args) {
		MyThreadTest mythread = new MyThreadTest();
		Thread t1 = new Thread(mythread);
		Thread t2 = new Thread(mythread);
		t1.start();
		t2.start();
	}
	
}
