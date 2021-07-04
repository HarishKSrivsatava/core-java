package org.harish.core.java.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClassesLab {
    public static void main(String[] args) {
	// String regularExpression = "[a-z]";
	// String regularExpression = "\\d";
	/**
	 * First backslash is used instruct compiler to skip second backslash.
	 * \d : any digit [0-9]
	 * 
	 */
	// String regularExpression = "\\w";
	/**
	 * First backslash is used instruct compiler to skip second backslash.
	 * \w : any word [0-9a-zA-Z]
	 * 
	 */
	// String regularExpression = ".";
	/**
	 * Any character : . (dot)
	 */
	String regularExpression = "\\s";
	/**
	 * space character : \s
	 */
	Pattern pattern = Pattern.compile(regularExpression);
	Matcher matcher = pattern.matcher("1f A");
	while (matcher.find()) {
	    System.out.println(matcher.start() + "..." + matcher.end() + "..." + matcher.group());
	}

    }
}
