package org.harish.core.java.flowcontrol;

public class Iteration_DoWhileDemo {
	
	public static void main(String[] args) {
		int a = 10, b = 20;
		do {
			System.out.println(a + " ... "+b);
			a++;
		}while(a < b);
		
		do
			a++;
		while(a < b);
		
		/*
		do 
		  int i =10; // Shouldn't be declarative
		while(true);
		*/

		do 
			System.out.println("Test");
		while(false);
		System.out.println("Reachable");
		
		/*
		do
			System.out.println("Test");
		while (true);
		System.out.println("Not reachable");
		*/
		
		
	}

}
