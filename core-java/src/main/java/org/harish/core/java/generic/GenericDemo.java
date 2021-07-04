package org.harish.core.java.generic;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;


public class GenericDemo {
	
	private static List arrayList;
	private static List<String> strList;
	
	public static void main(String[] args) {
		 arrayList = new ArrayList();
		 arrayList.add(10);
		 arrayList.add("Hello");
		 arrayList.stream().forEach(item -> System.out.print(item + " "));
		 System.out.println("\n============================");
		 strList = new ArrayList<String>();
		 strList.add("10");
		 strList.stream().forEach(item -> System.out.print(item + " "));
		// strList.add(10);
		 System.out.println("\n============================");
		 Map<String, String> m = new HashMap<String, String>();
		 m.put("1", "Test");
		 m.put("Test", "1");
		 for(Map.Entry<String, String> t : m.entrySet()){
			 System.out.print("Key : " + t.getKey() + " Value : " +t.getValue() + "\n" );
		 }
		 
		 m.forEach((k,v) -> System.out.print("Key : "+ k + " Value : " +v + "\n"));
		 
		 
		 
	}

}
