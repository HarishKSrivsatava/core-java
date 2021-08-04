package org.harish.core.java.multithreading;

public class LazyInitRace {
	private ExpensiveObject instance = null;
	public ExpensiveObject getInstance() {
		if(instance == null) {
			instance = new ExpensiveObject();
		}
		return instance;
	}
}
