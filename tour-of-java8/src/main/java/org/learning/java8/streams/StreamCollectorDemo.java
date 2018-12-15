package org.learning.java8.streams;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.learning.java8.utils.DataGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// TODO: Auto-generated Javadoc
/**
 * The Class StreamCollectorDemo.
 */
public class StreamCollectorDemo {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory.getLogger(StreamCollectorDemo.class);
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		Collection<String> collList = DataGenerator.getCollection("List");
		double avg = collList.stream().collect(Collectors.averagingInt( (val) -> Integer.parseInt(val)) );
		LOGGER.info("AVG : [{}]", avg);
		
		long cnt = collList.stream().collect(Collectors.counting());
		LOGGER.info("NO OF ELEMENTS IN THE COLLECTION : [{}]", cnt);
		
		Map<Object, List<String>> groupByColl = collList.stream().collect(Collectors.groupingBy( Integer::parseInt ));
		
		for (Object key : groupByColl.keySet()) {
			List<String> val = groupByColl.get(key);
			val.forEach(e -> LOGGER.info(key + " -> " + e));
		}

	}

}
