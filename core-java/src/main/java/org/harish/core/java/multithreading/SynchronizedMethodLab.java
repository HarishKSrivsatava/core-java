package org.harish.core.java.multithreading;

class Display {
    public synchronized void wish(String name) throws InterruptedException {
	for (int i = 0; i <= 5; i++) {
	    System.out.println("Welcome Mr. " + name);
	    Thread.sleep(1000);
	}
    }
}

class Greeting implements Runnable {
    Display d;
    String name;

    Greeting(Display d, String name) {
	this.d = d;
	this.name = name;
    }

    public void run() {
	try {
	    d.wish(name);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }
}

public class SynchronizedMethodLab {
    public static void main(String[] args) {
	Display d = new Display();
	Greeting g1 = new Greeting(d, "Dhoni");
	Greeting g2 = new Greeting(d, "Yuvraj");
	Thread t1 = new Thread(g1);
	Thread t2 = new Thread(g2);
	t1.start();
	t2.start();

    }
}
