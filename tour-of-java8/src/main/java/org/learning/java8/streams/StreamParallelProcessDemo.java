package org.learning.java8.streams;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import org.apache.commons.lang3.time.StopWatch;
import org.learning.java8.utils.DataGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// TODO: Auto-generated Javadoc
/**
 * The Class StreamParallelProcessDemo.
 */
public class StreamParallelProcessDemo {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory.getLogger(StreamCollectorDemo.class);
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws Exception the exception
	 */
	public static void main(String[] args) throws Exception {
		
		Collection<String> coll = DataGenerator.getLargeCollection(10000);
		LOGGER.info("Data collection received..");
		StopWatch seqProcTimer = new StopWatch();
		seqProcTimer.start();
		List<Integer> positiveEvenNoList =  coll.stream().filter(e -> Integer.parseInt(e) > 0)
				.filter(e -> Math.floorMod(Integer.parseInt(e), 2) == 0)
				.map(e-> Integer.parseInt(e)).collect(Collectors.toList());
		LOGGER.info("Time Elapsed : [{}] No. of Evens :[{}]", seqProcTimer.getTime(TimeUnit.NANOSECONDS), positiveEvenNoList.size());
		
		positiveEvenNoList = null;
		
		StopWatch parallelProcTimer = new StopWatch();
		parallelProcTimer.start();
		positiveEvenNoList =  coll.parallelStream().filter(e -> Integer.parseInt(e) > 0)
				.filter(e -> Math.floorMod(Integer.parseInt(e), 2) == 0)
				.map(e-> Integer.parseInt(e)).collect(Collectors.toList());
		LOGGER.info("Time Elapsed : [{}] No. of Evens :[{}]", parallelProcTimer.getTime(TimeUnit.NANOSECONDS), positiveEvenNoList.size());

	}

}
