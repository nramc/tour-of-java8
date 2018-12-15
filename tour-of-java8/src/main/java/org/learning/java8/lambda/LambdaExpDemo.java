package org.learning.java8.lambda;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import org.learning.java8.utils.DataGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class LambdaExpDemo has @Java8 lamba expression examples.
 * <b>Note:</b> These examples are just created for learning purposes .
 */
public class LambdaExpDemo {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory.getLogger(LambdaExpDemo.class);

	/**
	 * The main method of {@link LambdaExpDemo}.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		LambdaExpDemo obj = new LambdaExpDemo();
		List<String> listOfStr = (List<String>) DataGenerator.getCollection("List");

		obj.conventionalWayOfAccessingFuncInerface(listOfStr);
		
		obj.accessingFuncInterfaceByLambda(listOfStr);
		
	}

	/**
	 * Conventional way of accessing functional interface for sorting & printing all collection elements.
	 * 
	 * @param listOfStr - List of string which will be accessed by functional interface implementation.
	 * 
	 */
	public void conventionalWayOfAccessingFuncInerface(List<String> listOfStr) {
		LOGGER.info("NORMAL WAY OF CREATING INSTANCE FOR FUNCTIONAL INTERFACE");
		listOfStr.sort(new Comparator<String>() {

			@Override
			public int compare(String str1, String str2) {
				return str1.compareToIgnoreCase(str2);
			}
		});
		
		listOfStr.forEach(new Consumer<String>() {

			public void accept(String str) {
				LOGGER.info("{}", str);
			}
		});
	}
	
	/**
	 * Sort & print all elements from List using functional interface & Lambda expression.
	 * 
	 * @param listOfStr - List of string which will be accessed by functional interface implementation.
	 * 
	 */
	public void accessingFuncInterfaceByLambda(List<String> listOfStr) {
		LOGGER.info("LAMBDA EXPRESSION | SINGLE LINE");
		listOfStr.sort((str1, str2) -> str1.compareToIgnoreCase(str2));
		listOfStr.forEach(str -> LOGGER.info("{}", str));
	}
	
}
