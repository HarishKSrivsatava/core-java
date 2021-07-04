package org.harish.core.java.enumeration;

import java.util.Arrays;

enum Beer {
    KF, KO, MI, TS
}

public class EnumerationLab {
    public static void main(String[] args) {
	Beer b = Beer.KF;
	System.out.println(b);

	Beer[] values = b.values();
	// Arrays.asList(values).stream().forEach(System.out::print);
	Arrays.asList(values).stream().forEach(item -> {
	    System.out.println(item + " " + item.ordinal());
	});
    }

}
