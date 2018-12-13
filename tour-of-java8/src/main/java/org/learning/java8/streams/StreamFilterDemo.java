package org.learning.java8.streams;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.learning.java8.utils.DataGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StreamFilterDemo {

	private static final Logger LOGGER = LoggerFactory.getLogger(StreamCollectorDemo.class);
	
	public static void main(String[] args) {
		Collection<String> collList = DataGenerator.getCollection("List");
		
		LOGGER.info("First Five Elements:");
		List<String> firstFiveElements = collList.stream().limit(5).collect(Collectors.toList());
		firstFiveElements.forEach(e -> LOGGER.info(e));
		
		LOGGER.info("Skip First Five Elements:");
		List<String> skipFirstFiveElements = collList.stream().skip(5).collect(Collectors.toList());
		skipFirstFiveElements.forEach(e -> LOGGER.info(e));
		
		List<String> listOfEvens = collList.stream()
				.filter(e -> Math.floorMod(Integer.parseInt(e), 2) == 0).collect(Collectors.toList());
		
		LOGGER.info("Evens:");
		listOfEvens.forEach(e -> LOGGER.info(e));
		
		LOGGER.info("Evens (Distinct):");
		listOfEvens = listOfEvens.stream().distinct().collect(Collectors.toList());
		listOfEvens.forEach(e -> LOGGER.info(e));
	}
}
