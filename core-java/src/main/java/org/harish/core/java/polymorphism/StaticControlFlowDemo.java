package org.harish.core.java.polymorphism;

public class StaticControlFlowDemo {

	public static int x = 10;
	static {
		m();
		System.out.println("First Static Block");
	}
	public static void main(String[] args) {
		 m();
		 System.out.println("Main method");
	}
	
	public static void m() {
		System.out.println(y);
	}
	static {
		System.out.println("Second Static Block");
	}
	static int y = 20;
	
}

/*
0
First Static Block
Second Static Block
20
Main method
*/