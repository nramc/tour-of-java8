package org.learning.java8.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LambdaExpDemo {

	private static final Logger LOGGER = LoggerFactory.getLogger(LambdaExpDemo.class);

	public static void main(String[] args) {

		List<String> listOfStr = new ArrayList<String>();
		listOfStr.add("ONE");
		listOfStr.add("TWO");
		listOfStr.add("THREE");

		/**
		 * Passing instance of functional interface which was created in normal way as argument to
		 * forEach method of List
		 */
		LOGGER.info("NORMAL WAY OF CREATING INSTANCE FOR FUNCTIONAL INTERFACE");
		listOfStr.forEach(new Consumer<String>() {

			public void accept(String str) {
				LOGGER.info("{}", str);
			}
		});

		/**
		 * Create instance for functional interface by lambda and passing it as argument to forEach
		 * method of List
		 */
		LOGGER.info("LAMBDA EXPRESSION | SINGLE LINE");
		listOfStr.forEach(str -> LOGGER.info("{}", str));

		LOGGER.info("LAMBDA EXPRESSION | MULTI LINE");
		listOfStr.forEach(str -> {
			LOGGER.info("{}", str);
		});

		/** Lambda expression with multiple parameters */
		listOfStr.sort(new Comparator<String>() {

			@Override
			public int compare(String str1, String str2) {
				return str1.compareToIgnoreCase(str2);
			}
		});
		listOfStr.forEach(str -> LOGGER.info("{}", str));

		LOGGER.info("LAMBDA EXPRESSION | MULTIPLE PARAMETERS");
		listOfStr.sort((str1, str2) -> str1.compareToIgnoreCase(str2));
		listOfStr.forEach(str -> LOGGER.info("{}", str));

	}

}
