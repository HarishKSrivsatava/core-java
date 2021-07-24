package org.harish.core.java.multithreading;

class Greeting {
	private int i = 0;
	public void method(String name) {
		for(int j = 0; j < 10; j++) {
			System.out.println("Hello Mr."+name);
		}
	}
	
}


public class SynchroniationTest implements Runnable {
	Greeting greeting ;
	String name;
	
	public SynchroniationTest(Greeting greeting, String name) {
		this.greeting = greeting;
		this.name = name;
	}
	public void run(){
		try {
			Thread.sleep(10);
			Greeting test = new Greeting();
			test.method(name);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public static void main(String[] args) {
		String name = "Harish";
		Greeting greeting = new Greeting();
		SynchroniationTest test = new SynchroniationTest(greeting,name);
 
		
		Thread thread_1 = new Thread(test);
		thread_1.start();
	}
}
