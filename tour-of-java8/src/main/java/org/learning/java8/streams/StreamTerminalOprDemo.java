package org.learning.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Stack;
import java.util.Vector;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StreamTerminalOprDemo {

	private static final Logger LOGGER = LoggerFactory.getLogger(StreamTerminalOprDemo.class);
	
	public static void main(String[] args) {
		
		StreamTerminalOprDemo obj = new StreamTerminalOprDemo();
		
		Collection<String> collList = obj.getCollection("List");
		double avg = collList.stream().collect(Collectors.averagingInt( (val) -> Integer.parseInt(val)) );
		LOGGER.info("AVG : [{}]", avg);
		
		boolean flg = collList.stream().anyMatch(val -> Integer.parseInt(val)/2 == 0 );
		LOGGER.info("EVEN VALUE EXISTS IN COLLECTION : [{}]", flg);
		
		boolean flg = collList.stream().findFirst();
		LOGGER.info("EVEN VALUE EXISTS IN COLLECTION : [{}]", flg);
		
		

	}
	
	private Collection<String> getCollection(String collType) {
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
				LOGGER.info("Collection {} is not supported by demo..! ");
		}
		
		if ( coll != null ) coll.addAll( Arrays.asList("1", "2", "3", "4", "5") );
		return coll;
	}

}
