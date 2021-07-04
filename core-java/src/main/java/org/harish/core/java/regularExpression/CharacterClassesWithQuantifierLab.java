package org.harish.core.java.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClassesWithQuantifierLab {

    public static void main(String[] args) {
	String regularExpression = "d*";
	Pattern pattern = Pattern.compile(regularExpression);
	Matcher matcher = pattern.matcher("dfSDFG1FGHJfgjj233d");
	while (matcher.find()) {
	    System.out.println(matcher.start() + "---" + matcher.end() + "---" + matcher.group());
	}
    }

}
