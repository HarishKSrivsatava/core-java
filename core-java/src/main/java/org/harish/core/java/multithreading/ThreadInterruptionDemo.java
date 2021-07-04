package org.harish.core.java.multithreading;


class MyThread implements Runnable{
	
	public void run(){
		try{
		for(int i =0 ; i <= 10; i++){
			System.out.println("My thread is executing..." + i);
			Thread.sleep(1000);
		}
	}catch(InterruptedException e){
		System.out.println("Interrupted ");
		}
	}
}
public class ThreadInterruptionDemo  {

	public static void main(String[] args){
		MyThread test = new MyThread();
		Thread t = new Thread(test);
		t.start();
		t.interrupt();
		System.out.println("Main thread");
	}
}
