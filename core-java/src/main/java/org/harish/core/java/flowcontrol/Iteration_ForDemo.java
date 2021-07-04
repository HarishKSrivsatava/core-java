package org.harish.core.java.flowcontrol;

public class Iteration_ForDemo {

	public static void main(String[] args) {
		int i = 10;
		for(System.out.println("Initialization section");i<=10; i++) {
			System.out.println(false);
		}
    	//for(;;) {} //  valid
		/*
        for(System.out.println("Initialization section");true;
        		System.out.println("Incremental/Decremental section")) {
        }  // Infinite loop
        */
		/*
        for(System.out.println("Initialization section");i<=12;
        		System.out.println("Incremental/Decremental section")) {
        }// Infinite loop
        */
        
	}
}
