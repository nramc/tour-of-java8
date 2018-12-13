package org.learning.java8.streams;

import java.util.Collection;
import org.learning.java8.utils.DataGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StreamMatchingDemo {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(StreamCollectorDemo.class);
	
	public static void main(String[] args) {
		
		Collection<String> collList = DataGenerator.getCollection("List");
		
		LOGGER.info("Is all positive numbers? [{}]", collList.stream().allMatch(e -> Integer.parseInt(e) > 0));
		
		LOGGER.info("Is there any negative number? [{}]", collList.stream().anyMatch(e -> Integer.parseInt(e) < 0));
		
		LOGGER.info("The first postive number: [{}]", collList.stream().filter(e -> Integer.parseInt(e) > 0).findFirst().orElse("0") );
		
		
	}

}
