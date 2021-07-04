package org.harish.core;

public class SingletonClassDemoTest {

	public static void main(String[] args) {
		SingletonClassDemo instance_1 = SingletonClassDemo.getInstance();
		SingletonClassDemo instance_2 = SingletonClassDemo.getInstance();
		if(instance_1.equals(instance_2)) {
			System.out.println("instances from Singleton class");
		}else {
			System.out.println("instances from Non-Singleton class");
		}
	}
}
