package org.harish.core.java.generic;

public class GenericCustomClassDemo<T> {

	T value;
	GenericCustomClassDemo( T obj){
		this.value = obj;
	}
	
	public void show(){
		System.out.print(value + "\n");
	}
	
	public T getObj(){
		return value;
	}
	
	public static void main(String[] args) {
		GenericCustomClassDemo<Integer> g1 = new GenericCustomClassDemo<Integer>(10);
		g1.show();
		Integer obj = g1.getObj(); // This is integer
		GenericCustomClassDemo<String> g2 = new GenericCustomClassDemo<String>("10");
		g2.show();
		String obj2 = g2.getObj(); // This is string
		GenericCustomClassDemo<Object> g3 = new GenericCustomClassDemo<Object>("10");
		g3.show();
	}
}
