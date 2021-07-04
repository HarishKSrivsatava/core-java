package org.harish.core.java.inheritance;

public class TestClass {

	public static void main(String[] args) {
		ClassA parentClass = new ClassA();
		parentClass.m2();
		
		MethodOverridingDemo chdClass = new MethodOverridingDemo();
		chdClass.m2();
		
		ClassA chdClass2 = new MethodOverridingDemo();
		chdClass2.m2();
	}
}
