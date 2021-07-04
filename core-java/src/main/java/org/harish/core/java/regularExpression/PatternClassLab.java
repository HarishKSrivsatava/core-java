package org.harish.core.java.regularExpression;

import java.util.Arrays;
import java.util.regex.Pattern;

public class PatternClassLab {

    public static void main(String[] args) {
	Pattern p = Pattern.compile("\\s");
	String input = "Hello World !";
	String[] split = p.split(input);
	// Arrays.asList(split).stream().forEach(item ->
	// System.out.println(item));
	Arrays.asList(split).stream().forEach(System.out::println);
	System.out.println("===================================");
	// Pattern p1 = Pattern.compile("[.]");
	Pattern p1 = Pattern.compile("\\.");
	String input1 = "www.google.com";
	String[] split2 = p1.split(input1);
	Arrays.asList(split2).stream().forEach(System.out::println);
    }

}
