package org.learning.java8.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Stack;
import java.util.Vector;

public class DataGenerator {
	
	public static Collection<String> getCollection(String collType) {
		Collection<String> coll = null;
		switch( collType ) {
			case "List":
				coll = new ArrayList<String>();
				break;
			case "Set":
				coll = new HashSet<String>();
				break;
			case "Vector":
				coll = new Vector<String>(5);
				break;
			case "Stack":
				coll = new Stack<String>();
				break;
			default:
		}
		
		if ( coll != null ) coll.addAll( Arrays.asList("1", "2", "3", "4", "5", "4", "3", "2", "1") );
		return coll;
	}

}
