package org.harish.core.java.regularExpression;

import java.util.StringTokenizer;

public class StringTokenizerLab {

    public static void main(String[] args) {
	String str = "Hello World !!!";
	// StringTokenizer stz = new StringTokenizer(str);
	// Default tokenizer is space
	// StringTokenizer stz = new StringTokenizer(str, "o");
	StringTokenizer stz = new StringTokenizer(str, "o", true);
	/**
	 * If the returnDelims flag is true, then the delimiter characters are
	 * also returned as tokens.
	 */
	// StringTokenizer stz = new StringTokenizer(str, "or");
	while (stz.hasMoreElements()) {
	    System.out.println(stz.nextToken());
	}

    }
}
