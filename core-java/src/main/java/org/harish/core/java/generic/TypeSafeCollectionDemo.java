package org.harish.core.java.generic;

import java.util.List;
import java.util.ArrayList;

public class TypeSafeCollectionDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(10);
		list.add("Test");
		list.add(10.5);
		System.out.println(list);
		System.out.println("====================");
		List<String> genList = new ArrayList<String>();
		genList.add("Test");
		genList.add("Test1");
		genList.add("Test2");
		System.out.println(genList);

	}
}
