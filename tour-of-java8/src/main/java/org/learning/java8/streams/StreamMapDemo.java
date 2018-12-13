package org.learning.java8.streams;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.learning.java8.utils.DataGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StreamMapDemo {

	private static final Logger LOGGER = LoggerFactory.getLogger(StreamCollectorDemo.class);
	
	public static void main(String[] args) {
		
		Collection<String> collList = DataGenerator.getCollection("List");
		
		List<Integer> listOfInt = collList.stream().map(e -> Integer.parseInt(e)).collect(Collectors.toList());
		LOGGER.info("INT values :");
		listOfInt.forEach(e -> LOGGER.info("{}", e));
		
	}

}
