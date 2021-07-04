package org.harish.core.java.accessmodifier;

public class Test extends AbstractClassDemo{

	@Override
	public void m1() {
		System.out.println("Overridden abstract method");
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		test.m1();
	}
}
