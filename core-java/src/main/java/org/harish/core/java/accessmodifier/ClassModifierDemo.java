package org.harish.core.java.accessmodifier;
import test.DemoClassA;
//import test.DemoClassB;

/*
// Abstract class can have constructor but it can not in instantiated.
abstract class ClassModifierDemo {
	public ClassModifierDemo() {}
	public static void main(String[] args) {
		ClassModifierDemo demo = new ClassModifierDemo();
	}
}
*/
/*
private class ClassModifierDemo{
	// Only public, final and abstract modifiers are valid for top-level classes.
	public ClassModifierDemo() {}
    public static void main(String[] args) {
    }
}
*/


public class ClassModifierDemo{
	
	public static void main(String args[]) {
		DemoClassA demoClass = new DemoClassA();
		demoClass.method_1();
	}
}
