package org.learning.java8.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Stack;
import java.util.Vector;

// TODO: Auto-generated Javadoc
/**
 * The Class DataGenerator.
 */
public class DataGenerator {
	
	/**
	 * Gets the collection.
	 *
	 * @param collType the coll type
	 * @return the collection
	 */
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
	
	/**
	 * Gets the large collection.
	 *
	 * @param maxSize the max size
	 * @return the large collection
	 */
	public static Collection<String> getLargeCollection(long maxSize) {
		Collection<String> coll = new ArrayList<String>();
		
		for (int idx = 0; idx < maxSize; idx++) {
			coll.add(String.valueOf(idx));
		}
		
		return coll;
	}

}
