package org.harish.core.java.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Harish Kumar Pattern : A compiled representation of a regular
 *         expression. A regular expression, specified as a string, must first
 *         be compiled into an instance of this class. The resulting pattern can
 *         then be used to create a Matcher object that can match arbitrary
 *         character sequences against the regular expression. All of the state
 *         involved in performing a match resides in the matcher, so many
 *         matchers can share the same pattern. Matcher :
 */
public class RegularExpressionLab {

    public static void main(String[] args) {
	Pattern p = Pattern.compile("ab");
	Matcher m = p.matcher("abcdbsdfghwqsdsaABab");
	/*
	 * Pattern pattern = m.pattern(); String pattern2 = pattern.pattern();
	 * System.out.println(pattern2);
	 */
	while (m.find()) {
	    System.out.println(m.start() + " ..." + m.end() + "..." + m.group());
	}

    }

}
