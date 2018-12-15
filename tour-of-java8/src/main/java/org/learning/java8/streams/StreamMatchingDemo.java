package org.learning.java8.streams;

import java.util.Collection;
import org.learning.java8.utils.DataGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// TODO: Auto-generated Javadoc
/**
 * The Class StreamMatchingDemo.
 */
public class StreamMatchingDemo {
	
	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory.getLogger(StreamCollectorDemo.class);
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		Collection<String> collList = DataGenerator.getCollection("List");
		
		LOGGER.info("Is all positive numbers? [{}]", collList.stream().allMatch(e -> Integer.parseInt(e) > 0));
		
		LOGGER.info("Is there any negative number? [{}]", collList.stream().anyMatch(e -> Integer.parseInt(e) < 0));
		
		LOGGER.info("The first postive number: [{}]", collList.stream().filter(e -> Integer.parseInt(e) > 0).findFirst().orElse("0") );
		
		
	}

}
