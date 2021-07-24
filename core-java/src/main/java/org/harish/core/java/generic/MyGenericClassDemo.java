package org.harish.core.java.generic;

import java.util.ArrayList;
import java.util.List;

public class MyGenericClassDemo<T> {

	T obj;

	public MyGenericClassDemo(T obj) {
		this.obj = obj;
	}

	public T get() {
		return obj;
	}

	public static void main(String[] args) {
		MyGenericClassDemo<Integer> demo = new MyGenericClassDemo<Integer>(10);
		System.out.println(demo.get());

		MyGenericClassDemo<String> demo2 = new MyGenericClassDemo<String>("Test");
		System.out.println(demo2.get());
	 
		List<String> al = new ArrayList<String>();
		//demo2.m(al);
		System.out.println(al);
		List<Integer> al_2 = new ArrayList<Integer>();
		//demo2.m(al_2);
		System.out.println(al_2);
	    ArrayList<String> al_3 = new ArrayList<String>();
	    al_3.add("test");
	    //al_3.add(10);
	    m2(al_3);
	    System.out.println("al_3 : "+al_3);
	    System.out.println("a1_3 element : class of elements :"+ al_3.get(0).getClass());
	}

	/*
	 * public void m(List<String> al) { al.add("Test"); //al.add(10);
	 * al.add("New Test"); }
	 */
	public void m(List<? extends Integer> al_2) {
		//al.add("Test");
		al_2.add(10, null);
		//al.add("New Test");
	}
	public static void m2(ArrayList al) {
		al.add(10);
	}
	
	
}
