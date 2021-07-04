package org.harish.core;

public class SingletonClassDemo {
	private static SingletonClassDemo instance;
	private SingletonClassDemo() {}
	public static SingletonClassDemo getInstance() {
		if(instance == null) {
			instance = new SingletonClassDemo();
		}
		return instance;
	}
}
