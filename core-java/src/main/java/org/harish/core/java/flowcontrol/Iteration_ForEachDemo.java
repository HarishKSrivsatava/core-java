package org.harish.core.java.flowcontrol;

public class Iteration_ForEachDemo {

	public static void main(String[] args) {
		
		int[] a = {10,20};
		int[][] b = {{10,20},{30,40}};
		
		System.out.println("1D Array Elements :");
		for(int x : a) {
			System.out.println(x);
		}
		System.out.println("2D Array Elements :");
		for(int[] x : b) {
			for(int z : x) {
				System.out.println(z);
			}
		}
	}
}
