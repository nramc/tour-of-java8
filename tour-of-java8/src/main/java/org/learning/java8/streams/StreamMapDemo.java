package org.learning.java8.streams;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.learning.java8.utils.DataGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// TODO: Auto-generated Javadoc
/**
 * The Class StreamMapDemo.
 */
public class StreamMapDemo {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory.getLogger(StreamCollectorDemo.class);
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		Collection<String> collList = DataGenerator.getCollection("List");
		
		List<Integer> listOfInt = collList.stream().map(e -> Integer.parseInt(e)).collect(Collectors.toList());
		LOGGER.info("INT values :");
		listOfInt.forEach(e -> LOGGER.info("{}", e));
		
	}

}
