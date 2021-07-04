package org.harish.core.java.generic;

import java.util.ArrayList;

public class GenericAndNonGenericCompatabilityDemo {
	
	public static void m(ArrayList nonGenericClassAsArgument){
		nonGenericClassAsArgument.add(10);
		nonGenericClassAsArgument.add(10.5);
		nonGenericClassAsArgument.add("Test");
	}
	
	public static void main(String[] args) {
		ArrayList<String> genericClass = new ArrayList<String>();
		genericClass.add("11");
		//genericClass.add(10);// Compile time error: Only String can be added to this collection
		
	   m(genericClass); // Calling method with non-generic class argument
		
		genericClass.stream().forEach(item -> System.out.print(item));
	}

}
