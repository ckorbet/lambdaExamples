package lambdaexamples;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LambdaExamples {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LambdaExamples.class);
	
	private static Map<Integer, Integer> numbers = new HashMap<Integer, Integer>() {
		private static final long serialVersionUID = 1L;
		{
			put(1, 1);
			put(2, 2);
			put(3, 3);
		}
	};
	
	private LambdaExamples() {
		// default constructor
	}

	public static final void main(final String[] args) {
		lambdaOverHashMap();
	}
	
	private static final Integer suma(final Integer operand1, final Integer operand2) {
		return operand1 + operand2;
	}
	
	private static final void lambdaOverHashMap() {
		LOGGER.info("\t\t\t");
		LOGGER.info("\t\t\t");
		LOGGER.info("LAMBDA OVER HASHMAP\t");
		LOGGER.info("\t\t\t");
		LOGGER.info("\t\t\t");
		
		numbers.forEach((operand1, operand2) -> LOGGER.info(operand1 + " + " + operand2 + " = " + suma(operand1, operand2)));
	}

}
